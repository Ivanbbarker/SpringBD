package com.example.conexionbased;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ConexionbasedApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConexionbasedApplication.class, args);
	}

}
