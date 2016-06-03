package com.java.annotations;

public class Manager {
	private String managerName;
	private String managerDept;
	public Manager(){
		
	}
	public Manager(String managerName, String managerDept) {
		super();
		this.managerName = managerName;
		this.managerDept = managerDept;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getManagerDept() {
		return managerDept;
	}
	public void setManagerDept(String managerDept) {
		this.managerDept = managerDept;
	}
	@Override
	public String toString() {
		return "Manager [managerName=" + managerName + ", managerDept=" + managerDept + "]";
	}
	

}
