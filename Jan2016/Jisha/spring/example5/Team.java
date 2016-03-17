package spring.example5;


import java.util.List;

public class Team {
List<Employee> marketingEmployeeList;
List<Employee> recruitmentEmployeeList;
public Team(List<Employee> marketingEmployeeList, List<Employee> recruitmentEmployeeList) 
{
	super();
	this.marketingEmployeeList = marketingEmployeeList;
	this.recruitmentEmployeeList = recruitmentEmployeeList;
}
public List<Employee> getMarketingEmployeeList() {
	return marketingEmployeeList;
}
public void setMarketingEmployeeList(List<Employee> marketingEmployeeList) {
	this.marketingEmployeeList = marketingEmployeeList;
}
public List<Employee> getRecruitmentEmployeeList() {
	return recruitmentEmployeeList;
}
public void setRecruitmentEmployeeList(List<Employee> recruitmentEmployeeList) {
	this.recruitmentEmployeeList = recruitmentEmployeeList;
}
@Override
public String toString() {
	return "Team [marketingEmployeeList=" + marketingEmployeeList + ", recruitmentEmployeeList="
			+ recruitmentEmployeeList + "]";
}
public void displayInfo() {
	// TODO Auto-generated method stub
	System.out.println(marketingEmployeeList+" "+recruitmentEmployeeList+" ");
}

}





