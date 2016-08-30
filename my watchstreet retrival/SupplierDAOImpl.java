package com.watchstreets.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.watchstreets.dao.SupplierDAO;
import com.watchstreets.model.Supplier;

@Repository("supplierDAO")
public class SupplierDAOImpl implements SupplierDAO {
	@Autowired
	private SessionFactory sessionfactory;

	public SupplierDAOImpl(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

@Transactional
	public void saveOrUpdate(Supplier supplier) {
		Transaction t = sessionfactory.getCurrentSession().beginTransaction();

		sessionfactory.getCurrentSession().saveOrUpdate(supplier);
		t.commit();

	}

	@Transactional
	public void delete(int id) {
		Supplier supplier = new Supplier();
		supplier.setId(id);
		sessionfactory.getCurrentSession().delete(supplier);

	}

	public Supplier get(int id) {
		String hql = "from Supplier where id=" + "'" + id + "'";
		// from supplier where id = '101'
		Query query = sessionfactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Supplier> listsupplier = (List<Supplier>) query.list();

		if (listsupplier != null && !listsupplier.isEmpty()) {
			return listsupplier.get(0);
		}
		return null;
	}

	@Transactional
	public List<Supplier> list() {
		@SuppressWarnings("unchecked")
		List<Supplier> listSupplier = (List<Supplier>) sessionfactory.getCurrentSession().createCriteria(Supplier.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listSupplier;
	}

	@Transactional
	public Supplier getByName(String name) {

	   String hql = "from Supplier where name=" + "'"+ name +"'";
	
		Query query = (Query) sessionfactory.openSession().createQuery(hql);
		List<Supplier> listSupplier = (List<Supplier>)  query.list();
		
		if  (listSupplier != null && !listSupplier.isEmpty()){
			return listSupplier.get(0);
			
		}
   		return null;
	}
	
}
