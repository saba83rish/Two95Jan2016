package spring.example9.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Hod {
String name;
//@Autowired
public Hod(){
	
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Hod(String name) {
	super();
	this.name = name;
}

@Override
public String toString() {
	return "Hod [name=" + name + "]";
}

}
