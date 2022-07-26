package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Mainclass {

	public static void main(String[] args) {
	
		
		 StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.xml").build();  
         
		   Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
		  
		SessionFactory sf = meta.getSessionFactoryBuilder().build();  
		
	Session	s=sf.openSession();
	Transaction t = s.beginTransaction();
	Student venu= new Student();
	venu.setId(1011);
	venu.setSname("vejohn");
	venu.setMarks(6020);
	venu.setStream("civileng");
	Student v=new Student();
	v.setId(21921);
	v.setMarks(456);
	v.setSname("bunty");
	v.setStream("computer science");
	
	
	s.saveOrUpdate(v);
	
	s.saveOrUpdate(venu);
	t.commit();
	s.close();
	
	
		

	}

}
