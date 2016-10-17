package com.connects.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.connects.dao.ForumDao;
import com.connects.model.Blogs;
import com.connects.model.Forum;
import com.connects.model.Users;

@Repository

public class ForumdaoImpl implements ForumDao {
	
/*	@Autowired
	private SessionFactory sessionFactory;   
	
	public ForumdaoImpl(){}
	
	public ForumdaoImpl(SessionFactory sf){
		this.sessionFactory=sf;
	}
	
	public void saveOrUpdate(Forum f) {
		// TODO Auto-generated method stub
		Session s=sessionFactory.getCurrentSession();
		Transaction t=s.beginTransaction();
		System.out.println("Forum dao impl" +  f);
		s.saveOrUpdate(f);
		t.commit();	

	}

	
	public List<Forum> getForumList() {
		@SuppressWarnings("unchecked")
		List<Forum> list = (List<Forum>) sessionFactory.getCurrentSession().createCriteria(Users.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return list;

		List<Forum> lst;
		System.out.println("getAllForums()");
		Session ses = sessionFactory.openSession();
		System.out.println("getForumList()session " + ses.isOpen());
		Query qry = ses.createQuery("from Forum where forumstatus='valid'");
		lst = qry.list();
		System.out.println(lst);
		return lst;			
	}

	public void deleteForum(Forum f) {
		Session s=sessionFactory.getCurrentSession();
		Transaction t=s.beginTransaction();
		deleteForum(f);
		t.commit();
		
	}

	public Forum getForumid(int post_id) {
		String hql = "from Forum where forumid=" + "'" + post_id + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Forum> listUser = (List<Forum>) query.list();

		if (listUser != null && listUser.isEmpty()) {
			return listUser.get(0);
		}
		System.out.println("success");

		return null;
		
		
	}







*/
	
	
	@Autowired
	private SessionFactory sessionFactory;

	public void createNewForum(Forum f)
	{
		Session s=sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		System.out.println(f);
		s.save(f);
		t.commit();
	}
	
		@SuppressWarnings("unchecked")
	public List<Forum> getForumList(String user_name) {

		Session session=sessionFactory.openSession();
		Criteria c=session.createCriteria(Forum.class);
		c.add(Restrictions.eq("user_name", user_name));
		List <Forum> forum=c.list();
		return forum;
	}
	public void delete(int id) {
		Forum f = new Forum();
		
		sessionFactory.getCurrentSession().delete(f);
		System.out.println("Deleting the Forum");
	}

	@SuppressWarnings("unchecked")
	public List<Forum> getForum()
	{

		List<Forum> forum;
		System.out.println("in forum DAO");
		Session session=this.sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		org.hibernate.Query qury=session.createQuery("from Forum");
		
		System.out.println(qury.toString());
		forum=(List<Forum>)qury.list();
		tx.commit();
		return forum;
		
	}

	@Override
	public Blogs getForumById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Blogs getForumByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}


	
	


















}






