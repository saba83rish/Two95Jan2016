package com.two95.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spgDAOConf.xml");
		LibraryDao d=ctx.getBean(LibraryDao.class);
		Library l=(Library) ctx.getBean("lib");
		//d.addLibrary(l);
		//d.removeLibrary();
		d.updateLibrary(l);
	}

}
