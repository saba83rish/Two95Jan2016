package com.two95.emp;

import java.util.ArrayList;
import java.util.Comparator;

public class Employee {
private String empName;
private String empDesg;
private String empEmail;


public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpDesg() {
	return empDesg;
}
public void setEmpDesg(String empDesg) {
	this.empDesg = empDesg;
}
public String getEmpEmail() {
	return empEmail;
}
public void setEmpEmail(String empEmail) {
	this.empEmail = empEmail;
}
@Override
public String toString() {
	return "Employee [empName=" + empName + ", empDesg=" + empDesg + ", empEmail=" + empEmail + "]";
}

}

