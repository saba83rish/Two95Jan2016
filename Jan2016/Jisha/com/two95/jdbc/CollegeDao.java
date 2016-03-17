package com.two95.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class CollegeDao {
private JdbcTemplate jdbcTemplate;

public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}
	public void addStudent(College c){
		String sql="insert into college values(?,?,?)";
		Object[] param={c.getStudent_id(),c.getStudent_name(),c.getMajor()};
		jdbcTemplate.update(sql, param);
		
		
	}

	public void deleteStudent(int studentid){
		String sql="delete from college where student_id="+studentid;
	jdbcTemplate.update(sql);
	}
	
	public void updateStudent(College co){
	
	String sql="update college set student_name='Hridya' where student_name='tom'";
	jdbcTemplate.update(sql);
	}
}