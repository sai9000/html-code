package com.niit.shoppingcart2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {

		
	
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.scan("com.niit.Shoppingcart2");
		context.refresh();

		context.getBean("category");
		System.out.println("Category is created");
		context.getBean("product");
		System.out.println("product is created");
		Product p= (Product) context.getBean("product");
		p.setId("101");
		p.setName("Mobile");
		p.setPrice("50000");
		
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getPrice());

		System.out.println("Successfully created");

	}

}
