package com.watchstreets.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.watchstreets.dao.UserDAO;
import com.watchstreets.model.User;

public class UserService {
	@Autowired
	UserDAO	userDAO;
	
	 public boolean isValidUser(String username,String password,boolean isadmin)
	 {
		 return userDAO.isValidUser(username, password, isadmin);
		 
	 }
	 
	 public User getUserById(int id)
		{
			return userDAO.getUserById(id);
		}
	 
	 public User getUserByName(String name)
		{
			return userDAO.getUserByName(name);

		}
	
	 public void saveOrUpdate(User user)
	{
		userDAO.saveOrUpdate(user);	
	}
	public List<User> list()
	{
		List<User> list=userDAO.list();
		return list;
	}
	
	
	public void delete(int id)
	{
		userDAO.delete(id);
	}

}
