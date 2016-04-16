package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * @author hauktoma
 */
@SpringBootApplication
// @EnableAuthorizationServer   // not needed, we have our custom class here
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
