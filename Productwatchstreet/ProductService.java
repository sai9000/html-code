package com.watchstreets.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.watchstreets.dao.ProductDAO;
import com.watchstreets.model.Product;
import com.watchstreets.model.User;
@Service
public class ProductService {
	
@Autowired
ProductDAO productDAO;

public void saveOrUpdate(Product product) {
productDAO.saveOrUpdate(product);

}

public Product get(int id) {
	return productDAO.get(id);
}
public Product getProductByName(String name) {
	return productDAO.getProductByName(name);
}

public void delete(int id) {
productDAO.delete(id);

}
public List<Product> list() {
	List<Product>list=productDAO.list();
	
	return list;
}










}
	

	
 