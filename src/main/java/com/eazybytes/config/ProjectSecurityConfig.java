package com.eazybytes.config;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {
	//We define our own Custom requirements to secure apis
	//Here we define that which apis are need to be secured as our bussiness requirements
	
	/**
     *  Below is the custom security configurations
     */
	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
		/*http.authorizeHttpRequests()
		    .requestMatchers("/myAccount" , "/myBalance" , "/myLoans","/myCards")
		    .authenticated()
		    .requestMatchers("/contact" , "/notices")
		    .permitAll()
		    .and().formLogin().and().httpBasic();*/
//		http.formLogin();
//		http.httpBasic();
		//return http.build();
		
		
		/*
		 * Below Configuration to deny all requests
		 * 
		//Here we are Denying all the requests coming towards our web application 
		http.authorizeHttpRequests().anyRequest().denyAll()
	    .and().formLogin()
	    .and().httpBasic(); */
		
		
		/*
		 * Below Configuration to permit all requests
		 * */
		//Here we are permitting all the requests coming towards our web application 
		
		//This is not recommended for production
		http.authorizeHttpRequests().anyRequest().permitAll()
	    .and().formLogin()
	    .and().httpBasic();
		
		 return http.build();
	}
}
