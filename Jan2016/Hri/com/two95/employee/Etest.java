package com.two95.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;




import com.two95.employee.Two95Employee;

public class Etest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext factory=new ClassPathXmlApplicationContext("Emp.xml");
		//Two95Employee s=(Two95Employee) factory.getBean("e1");  
		String g=null;
		String y = null;
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("Emp.xml"));
		//Two95Employee s=(Two95Employee) factory.getBean("e1");
		Two95Employee s1=(Two95Employee) factory.getBean("p1");
		s1.displayemp();
		
		List<Team>t=s1.getTeam();
		Team rname= t.get(0);
		Team mname=t.get(0);
		List<Recruiter> f=rname.getRecruiter();
		List<Marketing> g1=mname.getMarketing();
		
		List<String> a=new ArrayList<String>();
		for( Recruiter r:f){
		 g=r.getName();
		 a.add(g);
		// System.out.println(a);
		
		}
		
		for(Marketing m:g1){
			 y=m.getName();
			a.add(y);
			System.out.println("meeting called for the marketer "+ y);
		}
		
		String[] p=a.toArray(new String[a.size()]);
		String min=p[0];
		for(int i=0;i<p.length;i++){
			if(min.length()>p[i].length()){
				min=p[i];
			}
			
		}
		System.out.println("the smallest name in the whole team is"+min);
	}
		
	
}
