package com.two95.hibernate.student.HibernateStudent;

import java.util.Date;

import org.hibernate.Session;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
		System.out.println("Maven + Hibernate + MYSQL");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		Student student = new Student();
		
		student.setStudentId(101);
		student.setFirstName("John");
		student.setLastName("Sullivan");
		student.setGender("Male");
        
		session.save(student);
		session.getTransaction().commit();
	
	}
}
