package spring.example9.annotation;

//import org.springframework.beans.factory.annotation.Autowired;

public class Trainer {
String name;

public Trainer(){
	
}
public Trainer(String name) {
	super();
	this.name = name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Trainer [name=" + name + "]";
}

}


