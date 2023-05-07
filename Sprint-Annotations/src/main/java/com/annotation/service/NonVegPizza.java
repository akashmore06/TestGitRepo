package com.annotation.service;

import org.springframework.stereotype.Component;

@Component	
public class NonVegPizza  implements Pizza{

	@Override
	public String getPizza() {
		System.out.println("hjhjh");
		return "Non-VegPizza";
	}
}