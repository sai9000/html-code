package com.watchstreets.dao;

import java.util.List;

import com.watchstreets.model.Category;


public interface CategoryDAO {
	public List<Category> list();

	public Category get(int id);

	public void saveOrUpdate(Category category);

	public void delete(int id);


}
