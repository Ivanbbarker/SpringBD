package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/*Para utilizar repositorios JPA, tenemos que indicarlo a Spring. Podemos hacer esto con @EnableJpaRepositories.
Tenga en cuenta que tenemos que usar esta anotación con @Configuration: */
@SpringBootApplication
@EnableJpaRepositories(basePackages= {"com.example.conexionbased.Repositorios"})
@ComponentScan(basePackages = {"com.example.conexionbased"})
@EntityScan("com.example.conexionbased.Modelo")
public class ConexionbasedApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConexionbasedApplication.class, args);

	}
}