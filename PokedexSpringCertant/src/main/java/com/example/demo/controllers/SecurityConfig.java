package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	/*
	//Defino los usuarios y el tipo de acceso (Autenticación)
	@Override
	protected void configure (AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("Bruno").password("{noop}bruno2021").roles("ADMIN","USER").and().withUser("Javier").password("{noop}javi2021").roles("USER");
	}*/
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder build) throws Exception {
		build.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}
	
	//Defino los roles que tendrán acceso a los paths (Autorización)
	@Override
	protected void configure (HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/editar/**","/agregar/**","/eliminar/**").hasRole("ADMIN").antMatchers("/").hasAnyRole("USER","ADMIN").and().formLogin().loginPage("/login").and().exceptionHandling().accessDeniedPage("/errores/403");
	}
}
