package com.watchstreets.dao;

import java.util.List;

import com.watchstreets.model.User;



public interface UserDAO {
	public List<User> list();

	public User get(int id);

	public void saveOrUpdate(User user);

	public void delete(int id);


}
