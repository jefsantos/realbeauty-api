package com.omelhordochile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import com.omelhordochile.utils.SenhaUtils;

//import com.omelhordochile.utils.SenhaUtils;

@SpringBootApplication
public class PessoaServiceApplication {

	@Value("${paginacao.quantidade_por_pagina}")
	private int qdtPorPagina;
	public static void main(String[] args) {
		SpringApplication.run(PessoaServiceApplication.class, args);

	}
	
	@Bean
	public FilterRegistrationBean<CorsFilter> corsXFilter() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials(true);
		config.addAllowedOrigin("*");
		config.addAllowedHeader("*");
		config.addAllowedMethod("*");
		source.registerCorsConfiguration("/**", config);
		FilterRegistrationBean<CorsFilter> bean = new FilterRegistrationBean<CorsFilter>(new CorsFilter(source));
		bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
		return bean;
	}
	
//	@Bean
//	public CommandLineRunner commandLineRunner() {
//		return args ->{
//			System.out.println("### Quantidade por paginas="+ this.qdtPorPagina);
//		};
//	}	
//	
//	
	
	
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args ->{
		
			
			String senhaEncoded = SenhaUtils.gerarBCrypt("'12345");
			
			System.out.println("SENHA MODIFICADA: " + senhaEncoded);
			
		};
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	}


