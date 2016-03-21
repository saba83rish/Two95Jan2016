package com.two95.jdbcc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.two95.jdbc.Hospital;
import com.two95.jdbc.HospitalDao;

public class RailwaysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("RailwaysDetails.xml");
		JdbcTemplate jdbcTemplate=context.getBean(JdbcTemplate.class);
		Railways r1=(Railways) context.getBean("r1");
		Railways r2=(Railways) context.getBean("r2");
		
		//RailwaysDao r=context.getBean(RailwaysDao.class);
		//r.addTrain(r1);
		//r.addTrain(r2);
		//r.removeTrain("12356");//deleting goa train
		//r.updateTrainDetails(r1);
		
		RailwaysDao r=(RailwaysDao)context.getBean("Railwaysdao");
		
		/*List<Railways> lr=r.getTrainSchedules();
		for(Railways rail:lr){
			System.out.println(rail);
		}*/
		
		List<Railways> list=r.getTrainSchedulesRowMapper();  
        
	    for(Railways rail:list)  
	        System.out.println(rail);  
	}  
		
		
		 
	

}
