package com.niit.Backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Backend.DAO.CategoryDAO;
import com.niit.Backend.model.Category;

public class CategoryTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.Backend");
		context.refresh();
		
		CategoryDAO categoryDAO=(CategoryDAO) context.getBean("categoryDAO");
		Category category=(Category) context.getBean("category");
		
		category.setId("cg150");
		category.setName("cgname150");
		category.setDescription("cgDec150");
		
		categoryDAO.saveOrUpdate(category);
		
		if(categoryDAO.get("sdfsf")==null)
		{
			System.out.println("Category does not exist");
		}
		else
		{
			System.out.println("category exist ..... the details are.....");
			System.out.println();
		}
		
		
	}

}
