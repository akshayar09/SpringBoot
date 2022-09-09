package com.nichi.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.nichi.controller","com.nichi.project","com.nichi.repository","com.nichi.service"})
@EnableJpaRepositories(basePackages = { "com.nichi.repository"})
public class NichiProjApplication {
	public static void main(String[] args) {
		SpringApplication.run(NichiProjApplication .class, args);
	}

}
