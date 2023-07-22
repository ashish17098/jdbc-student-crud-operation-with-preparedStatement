package com.jsp.student_curd_with_prepared.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class StudentConnection {

	
	public static Connection getStudentConnection()
	{
	 
	try
	{
		 // step-1 load/register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// step-2 create connection
		String url ="jdbc:mysql://localhost:3306/jdbc_preparedstatement";
		String user= "root";
		String pass="Ashish@8";
	
	Connection	connection=DriverManager.getConnection(url, user, pass);
		return  connection;
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return null;
	}
}
