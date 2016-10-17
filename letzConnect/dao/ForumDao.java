package com.connects.dao;

import java.util.List;

import com.connects.model.Blogs;
import com.connects.model.Forum;

public interface ForumDao {


/*
	
//	public Forum getCompleteForum(int fid);
//	public void createForum(Forum f);

public List<Forum> getForumList();
	
	public void deleteForum(Forum f);
	
	public void saveOrUpdate(Forum f);
	
*/
	
	
	public List<Forum> getForumList(String user_name);
	public List<Forum> getForum();
	public void createNewForum(Forum forum);
	public Blogs getForumById(int id);
	public Blogs getForumByName(String name);
	public void delete(int id);
}

	
	
	
	
	
	
	
	




