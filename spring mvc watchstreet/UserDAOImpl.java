package com.watchstreets.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
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
			
		
		
			public User get(int id) {
				String hql = "from Supplier where id=" + "'"+ id +"'";
				//  from supplier where id = '101'
				Query query =  sessionfactory.getCurrentSession().createQuery(hql);
				@SuppressWarnings("unchecked")
				List<User> listuser = (List<User>) query.list();
				
				if (listuser != null && !listuser.isEmpty()) {
					return listuser.get(0);
				}
				return null;
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
		}
