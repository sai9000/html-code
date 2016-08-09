package com.watchstreets.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.watchstreets.dao.UserDAO;
import com.watchstreets.model.User;


@Repository("userDAO")
public class UserDAOImpl implements UserDAO {
	@Autowired
	private SessionFactory sessionfactory;
	public UserDAOImpl(SessionFactory sessionfactory){
		this.sessionfactory=sessionfactory;
	}
		
		@Transactional
		public void saveOrUpdate(User user){
		sessionfactory.getCurrentSession().saveOrUpdate(user);
		}
		
		
		
		
		@Transactional
		public void delete(int id) {
			User user=new User();
			user.setId(id);
			sessionfactory.getCurrentSession().delete(user);
			
		
		}
			
		
		@Transactional
			public List<User> list() {
				@SuppressWarnings("unchecked")
				List<User> listUser = (List<User>) 
				          sessionfactory.getCurrentSession()
						.createCriteria(User.class)
						.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
				return listUser;
			}
			
			public User getUserById(int id) {
				
				Session session=this.sessionfactory.getCurrentSession();
				User user=(User) session.load(User.class,id);
				System.out.println("data of user by id="+user);
				return user;	

			}
			
			public User getUserByName(String name) {
				// TODO Auto-generated method stub
				
					System.out.println("getting data in dao based on name");
					Session session=this.sessionfactory.getCurrentSession();
					User user=(User) session.get(User.class,name);
					System.out.println("data of user by name="+user);
					return user;	

			}

			@Transactional
	public boolean isValidUser(String username, String password,boolean isadmin) {
				// TODO Auto-generated method stub
				String hql = "from User where username= '" + username + "' and " + " password ='" + password+"' and admin='"+isadmin+"'"; 
				Query query = sessionfactory.getCurrentSession().createQuery(hql);
				
				@SuppressWarnings("unchecked")
				List<User> list = (List<User>) query.list();
				
				if (list != null && !list.isEmpty()) {
					return true;
				}
				
				return false;
				}

			
				
				
			}

			

			
		
