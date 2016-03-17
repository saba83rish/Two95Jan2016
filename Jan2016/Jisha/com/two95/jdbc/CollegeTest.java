package com.two95.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class CollegeTest {

	public static void main(String[] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("College.xml");
		//College c=(College)context.getBean("studentid");
		
		JdbcTemplate jdbcTemplate=context.getBean(JdbcTemplate.class);
		
		/*String sql="insert into college values(?,?,?)";
		Object[] param={c.getStudent_id(),c.getStudent_name(),c.getMajor()};
		jdbcTemplate.update(sql, param);*/
		College c=(College)context.getBean("studentid");
		CollegeDao cd=context.getBean(CollegeDao.class);
		
		
		//cd.addStudent(c);
		//cd.deleteStudent(9);
		cd.updateStudent(c);
	}
	
}
