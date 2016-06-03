package com.two95.hibstud;

import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App 
{
   
    	 public static void main( String[] args )
    	    {
    	        System.out.println("Maven + Hibernate + MySQL");
    	        Session session = HibernateUtil.getSessionFactory().openSession();
    	        
    	        session.beginTransaction();
    	       Student s=new Student();
    	        
    	        s.setName("Sabarish");
    	        s.setId("101");
    	        s.setAge(30);
    	        
    	        session.save(s);
    	        session.getTransaction().commit();
    	    }
    
}
