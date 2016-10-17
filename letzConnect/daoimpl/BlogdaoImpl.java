package com.connects.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.connects.dao.BlogDao;
import com.connects.model.Blogs;
import com.connects.model.Users;
@Repository
public class BlogdaoImpl implements BlogDao  {

	@Autowired
	private SessionFactory sessionFactory;   
	
	public BlogdaoImpl(){}
	
	public BlogdaoImpl(SessionFactory sf){
		this.sessionFactory=sf;
	}

	public void createBlogs(Blogs b) {
	
		Session s=sessionFactory.getCurrentSession();
		Transaction t=s.beginTransaction();
		System.out.println("Blog dao impl" +  b);
		s.saveOrUpdate(b);
		t.commit();	

		
	}

	public List<Blogs> getBlogList() {
		List<Blogs> lst;
		System.out.println("getAllBlogs()");
		Session ses = sessionFactory.openSession();
		System.out.println("getBlogList()session " + ses.isOpen());
		Query qry = ses.createQuery("from Blogs where blogstatus='valid'");
		lst = qry.list();
		System.out.println(lst);
		return lst;		
	}

	public void deleteBlog(Blogs b) {
		Blogs bl= new Blogs();
	

		sessionFactory.getCurrentSession().delete(b);
		
		
		
	}

	public Blogs getCompleteBlogs(int bid) {
		Blogs b;	
		List<Blogs> lst;
		System.out.println("DAO-getCompleteBlog()");
		Session ses = sessionFactory.openSession();
		System.out.println("getBlogList()session " + ses.isOpen());
		Query qry = ses.createQuery("from Blog where blogid="+bid);
		lst = qry.list();
		b=lst.get(0);
		System.out.println(lst);
		return b;	
	}

	
	public void createBlog(Blogs b) {
		Session s=sessionFactory.getCurrentSession();
		Transaction t=s.beginTransaction();
		System.out.println("Blog dao impl" +  b);
		s.saveOrUpdate(b);
		t.commit();	
}



	
		
	}




	