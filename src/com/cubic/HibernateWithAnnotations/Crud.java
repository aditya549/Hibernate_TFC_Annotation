package com.cubic.HibernateWithAnnotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Crud {

	public static void insert() {
		Configuration cfg=new Configuration().addAnnotatedClass(Employee.class).configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		RegularEmployee re=new RegularEmployee();
		re.setEname("reddy");
		re.setSalary(12000);
		re.setBonus(500);
		s.persist(re);
		tx.commit();
		System.out.println("Record Inserted Successfully");
		s.close();
		factory.close();
	}
}
