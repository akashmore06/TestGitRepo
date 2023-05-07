package com.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.annotation.service.Pizza;
import com.annotation.service.VegPizza;

@Component
public class PizzaController {
	/*
	// field injection with Autowired
	@Autowired 
	private VegPizza pizza;
	*/
	/*
	// constructor injection
	@Autowired
	public PizzaController(VegPizza pizza) {
		this.pizza=pizza;
	}
	*/
	
	/*
	// setter injection with Autowired
	@Autowired
	public void setVegPizza(VegPizza pizza) {
		this.pizza=pizza;
	}
	*/
	
	
	// for loose coupling  we use interface
	private Pizza pizza;
	
	// if you miss the @Qualifier annotation then it will throw the exception because two classes with same interface so container may be confuse which bean inject
	@Autowired
	public PizzaController(@Qualifier("nonVegPizza") Pizza pizza) {
		this.pizza=pizza;
	}
	public String getPizza() {
		return pizza.getPizza();
	}

}
