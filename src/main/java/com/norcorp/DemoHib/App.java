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
        Alien tanor = new Alien();
        tanor.setAid(103);
        tanor.setAname("Youssef");
        tanor.setColor("Yellow");
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        
        //ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        
        SessionFactory sf = con.buildSessionFactory();
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction(); 
        
        session.save(tanor);
        
        tx.commit();
    }
}
