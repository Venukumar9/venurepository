package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mainclass {

	public static void main(String[] args) {
	
		Configuration c = new Configuration();
		c.configure("hibernate.xml");
		SessionFactory sf= c.buildSessionFactory();
		
	Session	s=sf.openSession();
	Transaction t = s.beginTransaction();
	Student venu= new Student();
	venu.setId(212);
	venu.setSname("venujohn");
	venu.setMarks(600);
	venu.setStream("civil");
	Student v=new Student();
	v.setId(23);
	v.setMarks(456);
	v.setSname("john");
	v.setStream("cse");
	s.save(v);
	s.update(v);
	s.save(venu);
	t.commit();
	s.close();
	
	
		

	}

}
