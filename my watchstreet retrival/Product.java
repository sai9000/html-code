package com.watchstreets.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table
@Component
public class Product {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)



private int id;

private String name;

private String description;

private String quantity;

private String price;

@Transient
private MultipartFile image;


public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
}



public String getQuantity() {
	return quantity;
}

public void setQuantity(String quantity) {
	this.quantity = quantity;
}




public MultipartFile getImage() {
	return image;
}

public void setImage(MultipartFile image) {
	this.image = image;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}


@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="supplier_id",nullable = false, updatable = false, insertable = false)
private Supplier supplier;

public Supplier getSupplier() {
	return supplier;
}

public void setSupplier(Supplier supplier) {
	this.supplier = supplier;
}



@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="category_id", nullable = false, updatable = false, insertable = false)
	private Category category;


public Category getCategory() {
	return category;
}

public void setCategory(Category category) {
	this.category = category;
}


private int supplier_id;

public int getSupplier_id() {
	return supplier_id;
}

public void setSupplier_id(int supplier_id) {
	this.supplier_id = supplier_id;
}

private int category_id;


public int getCategory_id() {
	return category_id;
}

public void setCategory_id(int category_id) {
	this.category_id = category_id;
}










}
