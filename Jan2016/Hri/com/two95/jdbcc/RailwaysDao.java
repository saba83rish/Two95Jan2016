package com.two95.jdbcc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.two95.jdbc.Hospital;

public class RailwaysDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void addTrain(Railways r){
		String sql="insert into railways values(?,?,?)";
		Object[] params={r.getTrainNo(),r.getArrival(),r.getDeparture()};
		jdbcTemplate.update(sql,params);
	}
	
	public void removeTrain(String trainNo){
		String sql="delete from railways where train_number="+trainNo;
		jdbcTemplate.update(sql);
	}
	
	public void updateTrainDetails(Railways ri){
		
		String sql="update railways set arrival='J&k' where departure="+"'"+ri.getDeparture()+"'";
		jdbcTemplate.update(sql);
	}
	
	public List<Railways> getTrainSchedules(){
		return jdbcTemplate.query("select * from railways",new ResultSetExtractor<List<Railways>>(){

			@Override
			public List<Railways> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<Railways> l=new ArrayList<Railways>();
				while(rs.next()){
					Railways rr=new Railways();
					rr.setTrainNo(rs.getString(1));
					rr.setArrival(rs.getString(2));
					rr.setDeparture(rs.getString(3));
					l.add(rr);
				}
				return l;
				
			}});}
	
	public List<Railways> getTrainSchedulesRowMapper(){  
		 return jdbcTemplate.query("select * from railways",new RowMapper<Railways>(){  
		    @Override  
		    public Railways mapRow(ResultSet rs, int rownumber) throws SQLException {  
		        Railways rl=new Railways();  
		        rl.setTrainNo(rs.getString(1));  
		        rl.setArrival(rs.getString(2));
		        rl.setDeparture(rs.getString(3)); 
		        return rl;  
		    }  
		    });  
}
			
}