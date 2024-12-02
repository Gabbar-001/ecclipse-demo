package com.hibernate.Persist;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.*;
public class App {
    public static void main(String[] args) {
    	Configuration configuration = new Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	SessionFactory sessionFactory = configuration.buildSessionFactory();	
    	Session session = sessionFactory.openSession();
    	Transaction transaction = session.beginTransaction();
    	Student s = new Student();
    	s.setAge(23);
    	s.setId(102);
    	s.setName("Gabbar");
    	s.setMarks(450);
    	s.setEmail("Gabbar@gmail.com");
    	s.setPhone(79815825);
    	session.persist(s);
    	transaction.commit();
    	session.close();
    	sessionFactory.close();	
    }
}
	