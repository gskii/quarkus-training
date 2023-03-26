package io.quarkus.workshop.superheroes.fight;

import io.quarkus.runtime.StartupEvent;
import io.quarkus.runtime.configuration.ProfileManager;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

@ApplicationScoped
public class FightApplicationLifeCycle {

    private static final Logger LOGGER = Logger.getLogger(FightApplicationLifeCycle.class);

    void onStart(@Observes StartupEvent ev) {
        LOGGER.info("""

               _____      __   __    ___   ___  ____
              / __(_)__ _/ /  / /_  / _ | / _ \\/  _/
             / _// / _ `/ _ \\/ __/ / __ |/ ___// /
            /_/ /_/\\_, /_//_/\\__/ /_/ |_/_/  /___/
                  /___/
            """
        );
        LOGGER.info("The application VILLAIN is starting with profile " + ProfileManager.getActiveProfile());
    }
}
