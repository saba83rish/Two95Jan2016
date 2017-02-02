package spring.example2;


	import org.springframework.beans.factory.BeanFactory;  
	import org.springframework.beans.factory.xml.XmlBeanFactory;  
	import org.springframework.core.io.*;  
	  
	public class PatientTest {
	    public static void main(String[] args) {  
	          
	       BeanFactory factory=new XmlBeanFactory(new FileSystemResource("patient.xml"));
	       Patient pp=(Patient)factory.getBean("p");
	          
	       
	        pp.show();
	        
	          
	          
	    }  
	}  

