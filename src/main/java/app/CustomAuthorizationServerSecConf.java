package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.configuration.ClientDetailsServiceConfiguration;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerEndpointsConfiguration;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerSecurityConfiguration;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.endpoint.FrameworkEndpointHandlerMapping;

/**
 * @author hauktoma
 */
@Configuration
@Import({ ClientDetailsServiceConfiguration.class, AuthorizationServerEndpointsConfiguration.class })
public class CustomAuthorizationServerSecConf extends AuthorizationServerSecurityConfiguration {

    @Override
    protected void configure(final HttpSecurity http) throws Exception {
        http
                .authorizeRequests().antMatchers("/revokeToken").fullyAuthenticated()
                .and().requestMatchers().antMatchers("/revokeToken");
        super.configure(http);
    }
}