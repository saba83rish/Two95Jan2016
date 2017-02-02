package spring.example9.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
String name;
//@Autowired

public Student(){
	
}
public String getName() {
	return name;
}

public Student(String name) {
	super();
	this.name = name;
}

public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student [name=" + name + "]";
}


}
