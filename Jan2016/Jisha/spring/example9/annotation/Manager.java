package spring.example9.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Manager {
Trainer trainer;
Student student;
Hod hod;


public Manager(){
	
}
@Autowired
public Manager(Trainer trainer, Student student, Hod hod) {

	this.trainer = trainer;
	this.student = student;
	this.hod = hod;
}


public Trainer getTrainer() {
	return trainer;
}


public void setTrainer(Trainer trainer) {
	this.trainer = trainer;
}


public Student getStudent() {
	return student;
}


public void setStudent(Student student) {
	this.student = student;
}


public Hod getHod() {
	return hod;
}


public void setHod(Hod hod) {
	this.hod = hod;
}


public void show(){
	System.out.println(trainer  +" "+student+" "+hod);
}

}
