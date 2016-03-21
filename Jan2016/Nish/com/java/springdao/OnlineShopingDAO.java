package com.java.springdao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class OnlineShopingDAO {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void addItem(OnlineShopping os){
		String sql = "insert into OnlineShopping values(?,?,?)";
		Object [] params = {os.getItemID(),os.getItemName(),os.getItemPrice()};
		jdbcTemplate.update(sql,params);
	}
	public void deleteItem()
	{
		String sql = "delete from OnlineShopping where ItemId = 1";
		jdbcTemplate.update(sql);
	}
	public void updateItem(OnlineShopping os)
	{
		String sql = "update OnlineShopping SET ItemName = 'Bangles' where ItemId = "+os.getItemID();
		jdbcTemplate.update(sql);
	}
	public List<OnlineShopping> getAllOnlineShopping(){
		return jdbcTemplate.query("select * from OnlineShopping", new ResultSetExtractor<List<OnlineShopping>>(){

			@Override
			public List<OnlineShopping> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<OnlineShopping> list = new ArrayList<OnlineShopping>();
				while(rs.next()){
					OnlineShopping os = new OnlineShopping();
					os.setItemID(rs.getInt(1));
					os.setItemName(rs.getString(2));
					os.setItemPrice(rs.getDouble(3));	
					list.add(os);
				}
				return list;
			}		
		});		
	}
	public List<OnlineShopping> getAllOnlineShoppingRowMapper(){
		return jdbcTemplate.query("select * from OnlineShopping", new RowMapper<OnlineShopping>(){

			@Override
			public OnlineShopping mapRow(ResultSet rs, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				OnlineShopping os2 = new OnlineShopping();
				os2.setItemID(rs.getInt(1));
				os2.setItemName(rs.getString(2));
				os2.setItemPrice(rs.getDouble(3));
				return os2;
			}			
		});
	}
}
