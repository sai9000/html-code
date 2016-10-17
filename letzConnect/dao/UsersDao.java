package com.connects.dao;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.connects.model.Users;

public interface UsersDao {


public List<Users>list();
	




public Users get(int userid);
public void saveOrUpdate(Users users);
public void delete (int userid);
public Users getusername(String username);
public boolean isvaliduser(String username, String password,boolean isenabled);













}
