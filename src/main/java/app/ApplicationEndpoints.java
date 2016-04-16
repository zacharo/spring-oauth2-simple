package app;

import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hauktoma
 */
@RestController
public class ApplicationEndpoints {

    @RequestMapping(value = "/status", method = RequestMethod.GET)
    @ResponseBody
    public String getStatus() {
        return "Hello world!";
    }

    @RequestMapping(value = "/loginPage", method = RequestMethod.GET)
    @ResponseBody
    public String login() {
        return "login page";
    }

    @RequestMapping(value = "/resource", method = RequestMethod.GET)
    @ResponseBody
    public String resource() {
        return "resource granted!";
    }

    @RequestMapping(value = "/revokeToken", method = RequestMethod.GET)
    @ResponseBody
    public String revokeToke() {
        return "token revoked!";
    }

}
