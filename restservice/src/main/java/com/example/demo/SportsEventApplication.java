package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.controller.PocController;



@SpringBootApplication
@ComponentScan(basePackageClasses={PocController.class})
public class SportsEventApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportsEventApplication.class, args);
	}

}

