package com.watchstreets.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Table
@Component
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
private String Firstname;
private String Lastname;
private String Mobile;
private String Email;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return Firstname;
}
public void setFirstname(String firstname) {
	Firstname = firstname;
}
public String getLastname() {
	return Lastname;
}
public void setLastname(String lastname) {
	Lastname = lastname;
}
public String getMobile() {
	return Mobile;
}
public void setMobile(String mobile) {
	Mobile = mobile;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}




}
