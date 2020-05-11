//package com.realbeauty.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.cors.reactive.CorsConfigurationSource;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//	private final static String[] PUBLIC_MATCHERS = { "/carro/**"};
//	private final static String[] PUBLIC_MATCHERS_GET = { "/pessoas/**"};
//
//	protected void configure(HttpSecurity http) throws Exception {
//		http.cors().and().csrf().disable();
//		http.authorizeRequests()
//		
//		.antMatchers(HttpMethod.GET , PUBLIC_MATCHERS_GET).permitAll()
//		.antMatchers( PUBLIC_MATCHERS).permitAll()
//		.anyRequest().authenticated();
//
//		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//	}
//
//	@Bean
//CorsConfigurationSource corsConfigurationSource() {
//  final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//  source.registerCorsConfiguration("/**", new CorsConfiguration().applyPermitDefaultValues());
//  return  (CorsConfigurationSource) source;
//}
//}
