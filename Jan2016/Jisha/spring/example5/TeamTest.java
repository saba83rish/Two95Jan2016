package spring.example5;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  
		  
public class TeamTest{
		    public static void main(String[] args) 
		    { 
		      BeanFactory factory=new XmlBeanFactory(new FileSystemResource("team.xml"));
		      Team t =(Team)factory.getBean("team");
		      t.displayInfo();
		      List<Employee> m = t. getMarketingEmployeeList();
		      List<Employee> r= t.getRecruitmentEmployeeList();
		      List<String>mTeam = new ArrayList<String>();
		      List<String>newList = new ArrayList<String>();
		      List<String>Team = new ArrayList<String>();
		      for(Employee e : m )
		      {
		    	  mTeam.add(e.getEmployeeName());
		    	  newList = new ArrayList<String>();
		    	  System.out.println("Marketing:  "+e.getEmployeeName());
		      }
		      for(Employee e2:r){
		    	//  e2.add(e2.getEmployeeName());
		    	  newList.add(e2.getEmployeeName()); 
		      }
		    
		    String[] s = newList.toArray(new String[0]);
		    String first = s[0];
		        for (int i=1; i<s.length;i++)
		        {
		          if((s[i].length()<first.length()))
		          {
		               first = s[i];  
		               System.out.println("Smallest name");
		          }
		        }
		        System.out.println("marketing");
		        
			}
		}



		    