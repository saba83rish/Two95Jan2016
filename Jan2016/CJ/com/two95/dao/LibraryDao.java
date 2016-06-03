package com.two95.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class LibraryDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void addLibrary(Library library) {
		String sql = "INSERT INTO librarytwo95 (BookName,AuthorName) VALUES(?,?)";
		Object args[] = new Object[] {library.getBookName(),library.getAuthorName()};
		jdbcTemplate.update(sql, args);
	}
	
	public void removeLibrary(){
		String sql ="DELETE FROM librarytwo95 where BookName='Two States'";
		jdbcTemplate.update(sql);
	}
	
	public void updateLibrary(Library l){
		String sql ="update librarytwo95 set BookName='HarryPotter Series' where BookName='HarryPotter'";
		jdbcTemplate.update(sql);
	}
}
