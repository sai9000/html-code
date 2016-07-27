package com.niit.Backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Backend.DAO.SupplierDAO;
import com.niit.Backend.model.Supplier;

public class SupplierTest {
public static void main(String[] args){
	@SuppressWarnings("resource")
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	context.scan("com.niit.Backend");
	context.refresh();
	SupplierDAO supplierDAO=(SupplierDAO) context.getBean("supplierDAO");
Supplier supplier=(Supplier) context.getBean("supplier");
supplier.setId("cg151");
supplier.setName("cgname151");
supplier.setDescription("cg151");

supplierDAO.saveOrUpdate(supplier);
if(supplierDAO.get("sdfsf")==null)
{
	System.out.println("supplier does not exist");
	
}

else
{
	System.out.println("supplier exist");
System.out.println();

}
}
}
			














