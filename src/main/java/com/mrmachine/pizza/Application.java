package com.mrmachine.pizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/*
 * Habilita la auditoria para llevar la trazabilidad de los registros
 * en movimiento del sistema de informacion.
 * 
 * Se habilita tambien la persistencia de datos con JPA
 * */
@EnableJpaAuditing
@SpringBootApplication
@EnableJpaRepositories
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
