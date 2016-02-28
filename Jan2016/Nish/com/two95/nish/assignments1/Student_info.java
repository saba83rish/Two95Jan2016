package com.two95.nish.assignments1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Student_info
 */
@WebServlet("/Student_info")
public class Student_info extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Student_info() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	      response.setContentType("text/html");
	      PrintWriter pw = response.getWriter();
	      
	      DBConnection.connectWithDB();
	      
	      String id = request.getParameter("id");
	      String name = request.getParameter("name");
	      String p = request.getParameter("p");
	      String b = request.getParameter("b");
	      String c= request.getParameter("c");
	      String m = request.getParameter("m");
	      String a = request.getParameter("a");
	 int a_id = 0;
	 int iname= 0;
	 int i_p=0;
	 int i_b = 0;
	 int i_c= 0;
	 int i_m = 0;
	 int i_a = 0;
	 int itotal = 0;
	 int count = 0;
	 int count2 = 0;
	 a_id = Integer.parseInt(id);
	 i_p = Integer.parseInt(p);
	 i_b = Integer.parseInt(b);
	 i_c = Integer.parseInt(c);
	 i_m = Integer.parseInt(m);
	 i_a = Integer.parseInt(a);
	 System.out.println("hii");
	 int [] ar = {i_p,i_b, i_c,i_m,i_a};
	 try{ 
	 pw.println("<html><body bgcolor = Pink ><table>");
	 for(int i = 0; i< ar.length; i++){
		 itotal= itotal+ ar[i];
		 if(ar[i] >100){
			// count = count+1;
			 pw.print("Please enter betweeon 0 to 100 only");
		 }
		 else {
			 if(ar[i] <40){
				 count2 = count2+1;	
			 }
		 }}
		if (count2>0){
			
			pw.println("Sorry you failed!");
		}
		else{
			pw.println("<tr><td>Student_Id = </td><td>"+a_id+"</td></tr>");
			pw.println("<tr><td>Student_Name = </td><td>"+name+"</td></tr>");
			pw.println("<tr><td>Student_Physics = </td><td>"+i_p+"</td></tr>");
			pw.println("<tr><td>Student_Biology = </td><td>"+i_b+"</td></tr>");
			pw.println("<tr><td>Student_Chemistry = </td><td>"+i_c+"</td></tr>");
			pw.println("<tr><td>Student_Math = </td><td>"+i_m+"</td></tr>");
			pw.println("<tr><td>Student_art = </td><td>"+i_a+"</td></tr>");
			pw.println("<tr><td>Student_Total = </td><td>"+itotal+"</td></tr>");			
		}
		DBConnection.st.executeUpdate("insert into Student_info values("+a_id+",'"+name+"','"+i_p+"','"+i_b+"','"+i_c+"','"+i_m+"','"+i_a+"')");
	 DBConnection.st.close();
	 DBConnection.con.close();
	 }catch(Exception e){
		 e.printStackTrace();
     }
	}

}
