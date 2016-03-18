package com.two95.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class HospitalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("HospitalDetails.xml");
		JdbcTemplate jdbcTemplate=context.getBean(JdbcTemplate.class);
		
		/*Hospital h1=(Hospital)context.getBean("h1");
		Hospital h2=new Hospital(112,"Sabarish","Chandrasekaran",300);
		
		String sql1="insert into hospital values(?,?,?,?)";
		Object[] params1={h1.getPatient_id(),h1.getName(),h1.getConsultingDoctor(),h1.getFees()};
		jdbcTemplate.update(sql1,params1);
		String sql2="insert into hospital values(?,?,?,?)";
		Object[] params2={h2.getPatient_id(),h2.getName(),h2.getConsultingDoctor(),h2.getFees()};
		jdbcTemplate.update(sql2,params2);*/
		
		Hospital h1=(Hospital) context.getBean("h1");
		HospitalDao h=context.getBean(HospitalDao.class);
		
		Hospital hw=new Hospital(103,"CJ","Thomas",500);
		//h.addPatient(h1);
		//h.deletePatient(101);//deleting hridya record
		h.updatePatientRecord(hw);
		
	}

}
