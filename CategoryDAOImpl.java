package ShoppingCartBackend1.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ShoppingCartBackend1.Model.Category;







@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;
	

	public CategoryDAOImpl(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;
		System.out.println("category impl");
	}

	@Transactional
	public void saveOrUpdate(Category category) {
		System.out.println("save update");
		sessionFactory.getCurrentSession().saveOrUpdate(category);
	}

	@Transactional
	public void delete(String id) {
		Category category = new Category();
		category.setId(id);
		sessionFactory.getCurrentSession().delete(category);
	}

@Transactional
public Category get(String id){
	String hql="from Categoy where id="+""+id+"";
	//from category where id='101'
	Query query=sessionFactory.getCurrentSession().createQuery(hql);
@SuppressWarnings("unchecked")
List<Category>listCategory=(List<Category>) ((Criteria) query).list();
if (listCategory !=null && !listCategory.isEmpty()){
	return listCategory.get(0);
	
}
return null;

}

	
	@Transactional
	public List<Category> list() {
		
		
		
		@SuppressWarnings({ "unchecked", "deprecation" })
		List<Category> listCategory = (List<Category>) 
		sessionFactory.getCurrentSession()
	.createCriteria(Category.class)		
		
		.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listCategory;
	}
}

	

	


