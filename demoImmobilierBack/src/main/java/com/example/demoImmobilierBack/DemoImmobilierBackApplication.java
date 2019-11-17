package com.example.demoImmobilierBack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.example.demoImmobilierBack")
//@ComponentScan({"com.example.demoImmobilierBack.service","com.example.demoImmobilierBack", "com.example.demoImmobilierBack.controller", "com.example.demoImmobilierBack.repository"})
public class DemoImmobilierBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoImmobilierBackApplication.class, args);
	}

}
