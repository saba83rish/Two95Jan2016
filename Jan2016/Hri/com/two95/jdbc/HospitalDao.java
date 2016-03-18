package com.two95.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class HospitalDao {

	private JdbcTemplate jdbcTemplate;


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void addPatient(Hospital h){
		String sql="insert into hospital values(?,?,?,?)";
		Object[] params={h.getPatient_id(),h.getName(),h.getConsultingDoctor(),h.getFees()};
		jdbcTemplate.update(sql,params);
	}
	
	public void deletePatient(int id){
		String sql="delete from Hospital where patient_id="+id;
		jdbcTemplate.update(sql);
	}
	
	public void updatePatientRecord(Hospital hw){
		
		String sql="update Hospital set name='Christin' where name='CJ'";
		jdbcTemplate.update(sql);
	}
	
	}

