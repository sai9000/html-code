package com.watchstreets.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.watchstreets.dao.CategoryDAO;
import com.watchstreets.model.Category;
@Service

public class CategoryService {
@Autowired
CategoryDAO categoryDAO; 

	public List<Category> list() {
		List<Category> list=categoryDAO.list(); 
		return list;
	}

	public Category get(int id) {
		return categoryDAO.get(id);
	}

	public void saveOrUpdate(Category category) {
	
		categoryDAO.saveOrUpdate(category);	
	}

	public void delete(int id) {
	
		categoryDAO.delete(id);
	
	
	}













}
