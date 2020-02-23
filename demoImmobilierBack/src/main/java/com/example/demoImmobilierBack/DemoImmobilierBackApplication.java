package com.example.demoImmobilierBack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@SpringBootApplication(scanBasePackages = "com.example.demoImmobilierBack")
//@ComponentScan ({"com.example.demoImmobilierBack", "com.example.demoImmobilierBack.service"})
//@ComponentScan({"com.example.demoImmobilierBack.service","com.example.demoImmobilierBack", "com.example.demoImmobilierBack.controller", "com.example.demoImmobilierBack.repository"})
public class DemoImmobilierBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoImmobilierBackApplication.class, args);
	}
	
	@Bean
	public CommonsRequestLoggingFilter requestLoggingFilter() {
	    CommonsRequestLoggingFilter loggingFilter = new CommonsRequestLoggingFilter();
	    loggingFilter.setIncludeClientInfo(true);
	    loggingFilter.setIncludeQueryString(true);
	    loggingFilter.setIncludePayload(true);
	    loggingFilter.setIncludeHeaders(false);
	    return loggingFilter;
	}

}


