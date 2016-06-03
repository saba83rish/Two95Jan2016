package com.java.dao.practice;

import org.springframework.jdbc.core.JdbcTemplate;

public class LibraryDao {
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void insertMember(Library l){
		String sql = "insert into Library values (?,?,?,?)";
		Object [] params = {l.getMemberId(),l.getMemberLastName(),l.getMemberFirstName(),l.getMemberAddress()};
		jdbcTemplate.update(sql,params);	
	}
	public void deleteMember(int id){
		String sql = "delete from Library where MemberId = "+107;
		jdbcTemplate.update(sql);	
	}
	public int updateMember(Library l2){
		String sql = "Update Library SET MemberLastName = 'Karki' Where MemberLastName = 'Acharaya'";
		return jdbcTemplate.update(sql);
	}
	
}
