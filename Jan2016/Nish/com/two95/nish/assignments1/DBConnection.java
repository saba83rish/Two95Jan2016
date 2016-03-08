package com.two95.nish.assignments1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnection {
	public static Connection con;
    public static Statement st;
    public static void connectWithDB(){
    	try
    	{
    		Class.forName("com.mysql.jdbc.Driver");
    		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/two95", "root", "nischala");
    		st = con.createStatement();
    		System.out.println("Connection Succeed");
    		//int Student_ID = 101;
    		//String Student_Name = "Nischala Pandey";
    		//String Student_physics = "90";
    		//String Student_Biology = "60";
    		//String Student_Chemistry = "90";
    		//String Student_Math = "60";
    		//String Student_Art = "90";
    		//System.out.println("insert into student values("+Student_ID+",'"+Student_Name+"','"+Student_physics+"','"+Student_Biology+"','"+Student_Chemistry+"','"+Student_Math+"','"+Student_Art+"')");
    		//st.executeUpdate("insert into Student_info values("+Student_ID+",'"+Student_Name+"','"+Student_physics+"','"+Student_Biology+"','"+Student_Chemistry+"','"+Student_Math+"','"+Student_Art+"')");
    	   System.out.println("Query Executed");
    	}catch(Exception e){
    		
    	}
    }   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBConnection.connectWithDB();

	}

}
