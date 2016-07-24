 package com.niit.ShoppingCartBackend1.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.ShoppingCartBackend1.Model.Category;

import ShoppingCartBackend1.dao.CategoryDAO;
import ShoppingCartBackend1.dao.CategoryDAOImpl;


@Configuration
@ComponentScan("com.niit.shoppingCartBackend1")
@EnableTransactionManagement

public class ApplicationContextConfig
{

@Bean(name="datasource")
public DataSource getDataSource(){
DriverManagerDataSource dataSource=new DriverManagerDataSource();
dataSource.setDriverClassName("org.h2.Driver");
dataSource.setUrl("jdbc:h2:tcp://localhost/~/SAIBABA");
dataSource.setUsername("sa");
dataSource.setPassword("");
System.out.println("application config datasource");
return dataSource;
}

	private Properties getHibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.hbm2ddl.auto","create");
		properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		System.out.println("application config hibernate props");
		return properties;
	}

	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
		sessionBuilder.addProperties(getHibernateProperties());
		sessionBuilder.addAnnotatedClass(Category.class);
		System.out.println("application config session");
		return sessionBuilder.buildSessionFactory();
	}

	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		System.out.println("application config transaction");
		return transactionManager;
	}

@Autowired
@Bean(name = "categoryDao")
public CategoryDAO getCategoryDao(SessionFactory sessionFactory) {
	System.out.println("application config cegory");
	return new CategoryDAOImpl(sessionFactory);

}


}

