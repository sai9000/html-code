package com.watchstreets.service;

import java.util.List;

import com.watchstreets.model.Product;

public interface ProductInterface {


	public interface ProductServiceInt {
		public void saveOrUpdate(Product product);
		public List<Product> list();
		public Product get(int id);
		public void delete(int id);

}
}
