package com.java.dao.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class LibraryTest {
	public static void main(String[] args) {  
	    ApplicationContext ctx=new ClassPathXmlApplicationContext("LibraryDAO.xml");  
	  
	    JdbcTemplate jdbcTemplate = ctx.getBean(JdbcTemplate.class);
	    //Library l1 = (Library) ctx.getBean("lib");
	   // Library l2 = new Library(105, "Pudasaini", "Ayush", "677 Hamden Circle");
	    //jdbcTemplate.update("insert into Library values(?,?,?,?)",new Object[]{l1.getMemberId(),l1.getMemberLastName(),l1.getMemberFirstName(), l1.getMemberAddress()});
	   //Object[] params = {l2.getMemberId(),l2.getMemberLastName(),l2.getMemberFirstName(),l2.getMemberAddress()};
	    //jdbcTemplate.update("insert into Library values(?,?,?,?)", params);
	    //jdbcTemplate.update("delete from Library where MemberId =105 ");
	    
	    /*Library la = (Library) ctx.getBean("lib2");
	    Library l2 = new Library(107, "Sulllivan", "Jackie", "677 Hamden Circle");
	    LibraryDao dao = ctx.getBean(LibraryDao.class);
	    dao.insertMember(l2);*/
	    Library la = (Library) ctx.getBean("lib2");
	    LibraryDao dao = ctx.getBean(LibraryDao.class);
	   // dao.insertMember(la);
	    //dao.deleteMember(107);
	    dao.updateMember(la);
	    
	    
}}
