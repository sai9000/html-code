package com.watchstreets.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.watchstreets.dao.ProductDAO;
import com.watchstreets.model.Product;
import com.watchstreets.model.User;


@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sessionfactory;
	public ProductDAOImpl(SessionFactory sessionfactory){
		this.sessionfactory=sessionfactory;
	}
		
		/*@Transactional
		public void saveOrUpdate(Product product){
			Transaction t=sessionfactory.getCurrentSession().beginTransaction();
			
			sessionfactory.getCurrentSession().saveOrUpdate(product);
		t.commit();
		
		}
		*/
		
	@Transactional
    public void saveOrUpdate(Product product) {
		
		
		
		
		Session s=sessionfactory.getCurrentSession();
		Transaction t=s.beginTransaction();
		System.out.println("User dao impl" +  product);
		s.saveOrUpdate(product);
		t.commit();
		
	}

	
	
	
	
	
	@Transactional
		public Product get(int id) {
			String hql = "from Product where id=" + "'"+ id +"'";
			//  from supplier where id = '101'
			Query query =  sessionfactory.getCurrentSession().createQuery(hql);
			@SuppressWarnings("unchecked")
			List<Product> listproduct = (List<Product>) query.list();
			
			if (listproduct != null && !listproduct.isEmpty()) {
				return listproduct.get(0);
			}
			return null;
		}
	    @Transactional
		public Product getProductByName(String name) {
			// TODO Auto-generated method stub
			
				System.out.println("getting data in dao based on name");
				Session session=this.sessionfactory.getCurrentSession();
				Product product=(Product) session.get(Product.class,name);
				System.out.println("data of user by name="+product);
				return product;	

		}
		
		//@Transactional
		//public void delete(int id) {
			//Product product=new Product();
			//product.setId(id);
			//sessionfactory.getCurrentSession().delete(product);
			
		
		//}
			
		
		//@Transactional
			//public List<Product> list() {
				//@SuppressWarnings("unchecked")
				//List<Product> listProduct = (List<Product>) 
				          //sessionfactory.getCurrentSession()
						//.createCriteria(Product.class)
						//.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
				//return listProduct;
			//}
			

		@SuppressWarnings("unchecked")
		public List<Product> list() {
			
			Session s = sessionfactory.getCurrentSession();
			Transaction tx = s.beginTransaction();
			List<Product> listproduct = s.createCriteria(Product.class).list();
			return listproduct;
		}


		@Transactional
		public void delete(int id) {
			
			System.out.println("Id in deleteProduct(int id):"+id);
		    Session session=sessionfactory.getCurrentSession();
		    Transaction tx=session.beginTransaction();
		    Product product = (Product)session.load(Product.class, id);
		    //tx.begin();
		    //Query query=session.createQuery("delete from product  where id=:status");
		    //query.setInteger("status",id);
		   //  rowsDeleted=query.executeUpdate();
		    
		    session.delete(product);
		    tx.commit();
		  
		     System.out.println("Rows deleted");
		
		  
		}
	
	



	
}
