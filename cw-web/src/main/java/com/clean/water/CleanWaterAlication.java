package com.clean.water;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication(scanBasePackages = "com.clean.water")
public class CleanWaterAlication {

	public static void main(String[] args) {
		SpringApplication.run(CleanWaterAlication.class, args);
	}
}
