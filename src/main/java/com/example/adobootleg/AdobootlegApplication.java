package com.example.adobootleg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.example.adobootleg", "com.example.adobootleg.services"})
public class AdobootlegApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdobootlegApplication.class, args);
	}

}
