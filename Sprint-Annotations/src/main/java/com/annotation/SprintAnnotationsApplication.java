package com.annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.annotation.controller.PizzaController;

@SpringBootApplication
public class SprintAnnotationsApplication {

	public static void main(String[] args) {
		ApplicationContext context=	SpringApplication.run(SprintAnnotationsApplication.class, args);

		PizzaController p=	 context.getBean(PizzaController.class);
		System.out.println(p.getPizza());
	}

}
