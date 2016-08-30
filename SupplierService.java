package com.watchstreets.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.watchstreets.dao.SupplierDAO;
import com.watchstreets.model.Supplier;

@Service

public class SupplierService {
@Autowired
	
SupplierDAO supplierDAO;
	
public List<Supplier> list() {
	List<Supplier> list=supplierDAO.list(); 
	return list;

	}


public Supplier getByName(String name) {
	return supplierDAO.getByName(name);
}
	
public Supplier get(int id) {
		return supplierDAO.get(id);
	}

	public void saveOrUpdate(Supplier supplier) {
		supplierDAO.saveOrUpdate(supplier);	
	}

	public void delete(int id) {
		
		supplierDAO.delete(id);
	
	}


		


	}

 
