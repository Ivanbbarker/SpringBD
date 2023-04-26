package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.conexionbased.Bicicleta;
import com.example.conexionbased.BicicletaController;
import com.example.conexionbased.BicicletaService;
/*Para utilizar repositorios JPA, tenemos que indicarlo a Spring. Podemos hacer esto con @EnableJpaRepositories.
Tenga en cuenta que tenemos que usar esta anotación con @Configuration: */
@SpringBootApplication
@EnableJpaRepositories(basePackages= "com.example.conexionbased")
public class ConexionbasedApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConexionbasedApplication.class, args);

		Bicicleta bici1 = new Bicicleta((long) 1453664, "yamahas", "XQR");
		Bicicleta bici2 = new Bicicleta((long) 9568745, "isabelita", "SAD");
		Bicicleta bici3 = new Bicicleta((long) 5426318, "kangoo", "RFG");

		System.out.println(bici1.toString());
		System.out.println(bici2.toString());
		System.out.println(bici3.toString());
		/*
		BicicletaService b = new BicicletaService();
		BicicletaController bControl = new BicicletaController(b);
		bControl.createBicicleta(bici1);
		bControl.createBicicleta(bici2);
		bControl.createBicicleta(bici3);
		*/
	}

}
