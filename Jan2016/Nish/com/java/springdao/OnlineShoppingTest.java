package com.java.springdao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class OnlineShoppingTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("OnlineShopping.xml");

		//JdbcTemplate jdbcTemplate = ctx.getBean(JdbcTemplate.class);

		// OnlineShopping os = (OnlineShopping) ctx.getBean("item2");
		// OnlineShopping os = (OnlineShopping) ctx.getBean("item3");
		// OnlineShopping os = (OnlineShopping) ctx.getBean("item4");

		//OnlineShopingDAO osdao = ctx.getBean(OnlineShopingDAO.class);
		// osdao.addItem(os);
		// osdao.updateItem(os);
		// osdao.deleteItem();
		
		OnlineShopingDAO osdao = (OnlineShopingDAO) ctx.getBean("Onlinedao");
		/*List<OnlineShopping> list = osdao.getAllOnlineShopping();
		
		for(OnlineShopping os: list){
			System.out.println(os);
		}*/
		List<OnlineShopping> l1 = osdao.getAllOnlineShoppingRowMapper();
		for(OnlineShopping os:l1){
			System.out.println(os);
		}
	}
}