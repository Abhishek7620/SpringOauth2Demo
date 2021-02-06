package com.DemoApplication.DemoApplication.Configuration;


import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig  extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("root").password("").roles("USER", "ADMIN").and()
                .withUser("test").password("{noop}test123").roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().and().authorizeRequests().antMatchers(HttpMethod.GET, "/api/user/**").hasRole("USER")
                .antMatchers(HttpMethod.POST, "/api/user").hasRole("ADMIN").antMatchers(HttpMethod.PUT, "/api/user/**")
                .hasRole("ADMIN").antMatchers(HttpMethod.PATCH, "/api/user/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/api/user/**").hasRole("ADMIN").and().csrf().disable().formLogin()
                .disable();
    }

}
