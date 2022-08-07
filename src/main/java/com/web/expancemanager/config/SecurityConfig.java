package com.web.expancemanager.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		// add our user for in memory authentication
		
		UserBuilder user = User.withDefaultPasswordEncoder();
		
		auth.inMemoryAuthentication()
		.withUser(user.username("tsaransh").password("saransh18092002").roles("Admin"))
		.withUser(user.username("tansh").password("ansh").roles("Manager"))
		.withUser(user.username("s.faridi").password("sameer").roles("Employee"));
		
	}
	
	//********** if you want custom login page *****************// 
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
		.anyRequest()
		.authenticated().and()
		.formLogin().loginPage("/login.html")
		.loginProcessingUrl("/authenticateTheUser")
		.permitAll()
		.and()
		.logout()
		.permitAll();
		
	}

	
	
	
	
}
