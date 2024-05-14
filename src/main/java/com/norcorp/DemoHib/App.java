package com.norcorp.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Alien tanor = new Alien();
        //tanor.setAid(103);
        //tanor.setAname("Youssef");
        //tanor.setColor("Yellow");
    	
    	//Alien tanor = null; //NB: for fetching the data
    	
    	AlienName an = new AlienName();
    	an.setFname("Ousmane");
    	an.setMname("Tanor");
    	an.setLname("Cisse");
    	
    	Alien tanor = new Alien();
    	tanor.setAid(101);
    	tanor.setColor("Green");
    	tanor.setAname(an);
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        
        //ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        
        SessionFactory sf = con.buildSessionFactory();
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction(); 
        
        session.save(tanor); // NB: to save the object using hibernate
        
        //tanor = (Alien) session.get(Alien.class, 101); // NB: to fetch the data from database using hibernate
        
        tx.commit();
        
        System.out.println(tanor);
    }
}
