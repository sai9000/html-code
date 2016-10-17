package com.connects.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.connects.dao.UsersDao;
import com.connects.model.Users;


@Repository("UsersDao")

public class UsersdaoImpl implements UsersDao{
	@Autowired
	private SessionFactory sessionFactory;

	public UsersdaoImpl() {
		System.out.println("UserDAOImpl --One");
	}
	public UsersdaoImpl(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;
		System.out.println("Inside UserDAOImpl");
	}
	
	
	public void saveOrUpdate(Users users) {
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		//users.setEnabled(true);
		session.save(users);
	   /* Users userRole=new Users();
		userRole.setUserid(users.getUserid());
		userRole.setRole("ROLE_USER");
		session.save(userRole);*/
		System.out.println("Done saving user");
		tx.commit();
	}
	@Transactional
	public void delete(int id) {
		Users user = new Users();
		user.setUserid(id);
		sessionFactory.getCurrentSession().delete(user);

	}

	@Transactional
	public Users get(int id) {
		String hql = "from User where id=" + "'" + id + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Users> listUser = (List<Users>) query.list();

		if (listUser != null && listUser.isEmpty()) {
			return listUser.get(0);
		}
		System.out.println("success");
		return null;

	}

	@Transactional
	public List<Users> list() {
		@SuppressWarnings("unchecked")
		List<Users> listUser = (List<Users>) sessionFactory.getCurrentSession().createCriteria(Users.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listUser;

	}

	
	public Users getusername(String name) {
		System.out.println("getting data in dao based on name");
		Session session = this.sessionFactory.getCurrentSession();
	//	Transaction tx=session.beginTransaction();
		Users user = (Users) session.get(Users.class, name);
	//	tx.commit();
		System.out.println("data of user by name=" + name);
		return user;

	}

	public boolean isvaliduser(String userid, String password, boolean isenabled) {
		String hql = "from user where id='" + userid + "' and password= '" + password + "'";
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Users> list = (List<Users>) q.list();
		
		if(list !=null&& !list.isEmpty()){
			return true;
		}
		return false;

	}



	

	

	

}
