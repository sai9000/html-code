package com.watchstreets.dao;

import java.util.List;

import com.watchstreets.model.Supplier;



public interface SupplierDAO {
	public List<Supplier> list();

	public Supplier get(int id);

	public void saveOrUpdate(Supplier supplier);

	public void delete(int id);



}
