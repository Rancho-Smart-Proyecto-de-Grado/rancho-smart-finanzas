package com.rancho_smart.finanzas_composer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FinanzasComposerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinanzasComposerApplication.class, args);
	}

}
