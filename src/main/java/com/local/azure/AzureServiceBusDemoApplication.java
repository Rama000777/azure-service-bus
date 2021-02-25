package com.local.azure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class AzureServiceBusDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureServiceBusDemoApplication.class, args);
	}

}
