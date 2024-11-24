package com.jsp.hibernate.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Fetch_Car {
	public static void main(String[] args) {
		Configuration con=new Configuration();
    	con.configure();
    	con.addAnnotatedClass(Car.class);
    	SessionFactory sf=con.buildSessionFactory();
    	Session session=sf.openSession();
    	Transaction tran=session.beginTransaction();
    	
    	Car car=session.load(Car.class, 44);
    	System.out.println(car);
    	
    	tran.commit();
    	session.close();
    	sf.close();

	}

}
