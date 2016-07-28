package com.niit.Backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Backend.DAO.ProductDAO;
import com.niit.Backend.model.Product;

public class ProductTest {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.Backend");
		context.refresh();
		ProductDAO productDAO=(ProductDAO) context.getBean("productDAO");
		Product product=(Product) context.getBean("product");
		product.setId("cg151");
		product.setName("cgnamesai1");
		product.setDescription("cg151scitizenfastrack");

		productDAO.saveOrUpdate(product);
		if (productDAO.get("sdfsf") == null) {

			System.out.println("product doesnot exist");
		}

		else {
			System.out.println("product exist");
		}

	}

}
