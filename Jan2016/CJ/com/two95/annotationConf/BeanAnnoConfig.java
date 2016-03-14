package com.two95.annotationConf;

import org.springframework.context.annotation.Bean;

public class BeanAnnoConfig {
	private DisplayInfo DisplayInfo;
	
	@Bean(name="student")
	public Student s()
	{
		Student s=new Student();
		s.setStudentName("christin");
		return s;
	}
	@Bean(name="trainer")
	public Trainer t()
	{
		Trainer t=new Trainer();
		t.setTrainerName("Ansari");
		return t;
	}
	@Bean(name="manager")
	public Manager m()
	{
		Manager m=new Manager();
		m.setManagerName("sam");
		return m;
	}
	@Bean(name = "display")
	public DisplayInfo di()
	{
		DisplayInfo d=new DisplayInfo();
//		d.setStudent(s());
//		d.setTrainer(t());
//		d.setManager(m());
		return d;
	}
	

	
}
