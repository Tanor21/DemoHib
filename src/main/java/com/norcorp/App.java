package com.norcorp;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import dao.Employee;
import dao.Student;
import utils.HibernateUtil;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	SessionFactory factory = HibernateUtil.getSessionFactory();
    	System.out.println(factory);
    	
		/*
		 * Student st = new Student(); st.setId(4); st.setName("Safiou");
		 * st.setEmail("safiou@gmail.com"); st.setAddress("Canada");
		 * 
		 * Session session = factory.openSession(); 
		 * Transaction tx = session.beginTransaction(); 
		 * session.save(st);
		 * 
		 * tx.commit(); 
		 * session.close(); 
		 * System.out.println(st);
		 */
    	
    	Employee emp = new Employee();
    	emp.setEmpName("ibou Cisse");
    	emp.setEmail("ibou@gmail.com");
    	emp.setSalary(40000.00);
    	emp.setJoiningDate(new Date());
    	emp.setStatus(false);
    	emp.setToken("2165a4cdwekxsc");
    	
    	Session session = factory.openSession(); 
		Transaction tx = session.beginTransaction(); 
		session.save(emp);
		  
		tx.commit(); 
		session.close();
    }
}
