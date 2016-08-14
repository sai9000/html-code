package com.watchstreets.dao;

import java.util.List;

import com.watchstreets.model.Product;


public interface ProductDAO {
	public void saveOrUpdate(Product product);
		 
	public Product get(int id);
	public Product getProductByName(String name) ;

	public void delete(int id) ;
	//public List<Product> list();

}
