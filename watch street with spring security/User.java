package com.watchstreets.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;
@Entity
@Table
@Component
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
@NotEmpty(message="first name cannot be empty")
	private String Firstname;
@NotEmpty(message="last name cannot be empty")

private String Lastname;
@NotEmpty(message="user name cannot be empty")

private String Username;

@NotEmpty(message="password cannot be empty")
private String Password;

@NotEmpty(message="date of birth cannot be empty")
private String Dateofbirth;
@NotEmpty(message="mobile cannot be empty")

private String Mobile;

@NotEmpty(message="Emailcannot be empty")

private String Email;

@NotEmpty(message="Address cannot be empty")

private String Address;




@Column(name="enabled")

private boolean isEnabled;

public boolean isEnabled() {
	return isEnabled;
}

public void setEnabled(boolean isEnabled) {
	this.isEnabled = isEnabled;
}

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




}
