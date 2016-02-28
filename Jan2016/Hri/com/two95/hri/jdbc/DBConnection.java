package com.two95.hri.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
/**
 *   for creating jdbc connection
 * @author gopu
 *
 */
public  class DBConnection {
public static Connection con;
static Statement st;
public static void connectWithDB(){
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/two95","root","root123");
		st=con.createStatement();
		/*System.out.println("connection success");
		String stud_id="101";
		String name="Hridya";
		int subject1=90;
		int subject2=90;
		int subject3=90;
		int subject4=90;
		int subject5=90;
		int total=subject1+subject2+subject3+subject4+subject5;
		int result=0;

		//System.out.println("insert into student values('"+stud_id+"','"+name+"','"+subject1+"','"+subject2+"','"+subject3+"','"+subject4+"','"+subject5+"')");
		st.executeUpdate("insert into student values("+stud_id+",'"+name+"','"+subject1+"','"+subject2+"','"+subject3+"','"+subject4+"','"+subject5+"','"+total+"','"+result+"')");
		*/
		System.out.println("query executed");
		
	}
catch(Exception e){
	e.printStackTrace();

}
}
public static void main(String[] args){
	DBConnection.connectWithDB();
}


}