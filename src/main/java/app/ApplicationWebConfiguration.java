package app;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author hauktoma
 */
@Configuration
@EnableWebSecurity
@Order(6)
public class ApplicationWebConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        // @formatter:off
        http.antMatcher("/**")
                .authorizeRequests()
                .antMatchers("/status").authenticated()
                .antMatchers("/", "/login**", "/webjars/**").permitAll()
                .and().httpBasic();
        // @formatter:on
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user").password("password").roles("USER").and();
    }
}
