package com.watchstreets.dao;

import java.util.List;

import com.watchstreets.model.User;



public interface UserDAO {
	public List<User> list();
	
	
	public User get(int id);
	
	public User getUserByName(String name);

	public void saveOrUpdate(User user);

	public void delete(int id);

	 public boolean isValidUser(String username,String password,boolean isadmin);
	
	


}
