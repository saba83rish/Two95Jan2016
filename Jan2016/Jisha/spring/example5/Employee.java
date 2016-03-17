package spring.example5;

public class Employee {
	 String employeeName;  
	 String age;
	 String email;
	 String teamName;
	public Employee(String employeeName, String age, String email, String teamName) {
		super();
		this.employeeName = employeeName;
		this.age = age;
		this.email = email;
		this.teamName = teamName;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
}
