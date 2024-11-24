package com.jsp.hibernate.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Car car=new Car(42,"BENZ","E-class",1000000);
    	Configuration con=new Configuration();
    	con.configure();
    	con.addAnnotatedClass(Car.class);
    	SessionFactory sf=con.buildSessionFactory();
    	Session session=sf.openSession();
    	Transaction tran=session.beginTransaction();
    	
    	session.save(car);
    	
    	tran.commit();
    	session.close();
    	sf.close();
    	
    	
    }
}
