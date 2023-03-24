package io.quarkus.workshop.superheroes.villain;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

@ApplicationScoped
public class VillainApplicationLifeCycle {

    private static final Logger LOGGER = Logger.getLogger(VillainApplicationLifeCycle.class);

    void onStart(@Observes StartupEvent ev) {
        LOGGER.info("""

            ____   ____.__.__  .__         .__            _____ __________.___\s
            \\   \\ /   /|__|  | |  | _____  |__| ____     /  _  \\\\______   \\   |
             \\   Y   / |  |  | |  | \\__  \\ |  |/    \\   /  /_\\  \\|     ___/   |
              \\     /  |  |  |_|  |__/ __ \\|  |   |  \\ /    |    \\    |   |   |
               \\___/   |__|____/____(____  /__|___|  / \\____|__  /____|   |___|
                                         \\/        \\/          \\/             \s

            """
        );
    }

    void onStop(@Observes ShutdownEvent ev) {
        LOGGER.info("The application VILLAIN is stopping...");
    }
}
