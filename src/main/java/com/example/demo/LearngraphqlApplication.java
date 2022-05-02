package com.example.demo;

import com.example.demo.resolver.QueryResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LearngraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearngraphqlApplication.class, args);
	}

//If @Component annotation is removed from QueryResolver class
//you need this:

//	@Bean
//	public QueryResolver query() {
//		return new QueryResolver();
//	}
}
