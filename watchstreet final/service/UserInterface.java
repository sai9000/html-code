package com.watchstreets.service;

import java.util.List;

import com.watchstreets.model.User;

public interface UserInterface {

	public interface UserServiceInterface {

		public List<User> list();
		public User get(int id);
		public void saveOrUpdate(User user);
		public void delete (int d);
		public User getusername(String name);
		public boolean isvaliduser(String user, String pass,boolean isadmin);
	}








}
