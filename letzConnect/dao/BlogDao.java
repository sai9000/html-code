package com.connects.dao;

import java.util.List;

import com.connects.model.Blogs;

public interface BlogDao {
   
	public void createBlog(Blogs b);
	public List<Blogs> getBlogList();
	public void deleteBlog(Blogs b);	
	public Blogs getCompleteBlogs(int bid);




}
