package io.quarkus.workshop.superheroes.hero;

import io.quarkus.runtime.StartupEvent;
import io.quarkus.runtime.configuration.ProfileManager;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

@ApplicationScoped
public class HeroApplicationLifeCycle {

    private static final Logger LOGGER = Logger.getLogger(HeroApplicationLifeCycle.class);

    void onStart(@Observes StartupEvent ev) {
        LOGGER.info("""

               __ __                       ___   ___  ____
              / // /__ _______  ___ ___   / _ | / _ \\/  _/
             / _  / -_) __/ _ \\/ -_|_-<  / __ |/ ___// /
            /_//_/\\__/_/  \\___/\\__/___/ /_/ |_/_/  /___/

            """
        );
        LOGGER.info("The application VILLAIN is starting with profile " + ProfileManager.getActiveProfile());
    }
}
