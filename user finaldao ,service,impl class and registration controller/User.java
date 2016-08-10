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
private String Username;
private String Password;
private String Dateofbirth;
private String Mobile;
private String Email;
private String Address;
private boolean isadmin;

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
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	Username = username;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getDateofbirth() {
	return Dateofbirth;
}
public void setDateofbirth(String dateofbirth) {
	Dateofbirth = dateofbirth;
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
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public boolean isIsadmin() {
	return isadmin;
}
public void setIsadmin(boolean isadmin) {
	this.isadmin = isadmin;
}



}
