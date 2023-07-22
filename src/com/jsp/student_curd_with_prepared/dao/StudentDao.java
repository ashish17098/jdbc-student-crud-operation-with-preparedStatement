package com.jsp.student_curd_with_prepared.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jsp.student_curd_with_prepared.connection.StudentConnection;
import com.jsp.student_curd_with_prepared.dto.Student;

public class StudentDao {
	Connection connection =StudentConnection.getStudentConnection();
	/**
	 *  insert method for Student
	 */
     public Student insertStudent( Student student)
     {
    	  String insertQuery ="insert into student values(?,?,?,?)";
    	  
    	/**
    	 *  jdbc code  
    	 */
    	  
    	 try
    	 {
    		 PreparedStatement preparedStatement =connection.prepareStatement(insertQuery);
    		 preparedStatement.setInt(1, student.getStudentId());
    		 preparedStatement.setString(2, student.getStudentName());
    		 preparedStatement.setString(3, student.getStudentEmail());
    		 preparedStatement.setLong(4, student.getStudentPhone());
    		 preparedStatement.execute();
    		 return student;
    	 }catch (Exception e) {
			// TODO: handle exception
    		 e.printStackTrace();
		}
		return null;
     }
		/* method insert ended*/
		
		/**
		 *   update student method
		 */
		public int updateStudentName(int studentId ,String studentName)
		{
			String updateStudentNameQuery="update student set name=? where id=?";
			
			try {
				PreparedStatement preparedStatement =connection.prepareStatement(updateStudentNameQuery);
				preparedStatement.setInt(2, studentId);
				preparedStatement.setString(1,studentName );
				return preparedStatement.executeUpdate();
			}catch(Exception e) {
				e.printStackTrace();
			}
			return 0;
		}
		/* method ended*/
		
		
		public int updateStudentEmail(int studentId ,String studentEmail)
		{
			String updateStudentEmailQuery="update student set email=? where id=?";
			
			try {
				PreparedStatement preparedStatement =connection.prepareStatement(updateStudentEmailQuery);
				preparedStatement.setInt(2, studentId);
				preparedStatement.setString(1,studentEmail );
				return preparedStatement.executeUpdate();
			}catch(Exception e) {
				e.printStackTrace();
			}
			return 0;
		}
		
		/* method ended*/
		
		public int updateStudentPhone(int studentId ,String studentPhone)
		{
			String updateStudentPhoneQuery="update student set phone=? where id=?";
			
			try {
				PreparedStatement preparedStatement =connection.prepareStatement(updateStudentPhoneQuery);
				preparedStatement.setInt(2, studentId);
				preparedStatement.setString(1,studentPhone );
				return preparedStatement.executeUpdate();
			}catch(Exception e) {
				e.printStackTrace();
			}
			return 0;
		}
		/* method update ended*/
		
		
		
		/**
		 * delete student data
		 */
		public int deleteStudentName(int studentId)
		{
			String deleteStudentNameQuery="delete from student where id =?";
			try
			{
				PreparedStatement preparedStatement =connection.prepareStatement(deleteStudentNameQuery);
				preparedStatement.setInt(1, studentId);
				return preparedStatement.executeUpdate();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			return 0;
		}
     /* method delete ended*/
		/**
		 * Display student data
		 */
		
		public Student displayStudentData(Student student)
		{
			String displayQuery="select * from student";
			try {
				PreparedStatement preparedStatement=connection.prepareStatement(displayQuery);
				   
			    ResultSet resultSet=  preparedStatement.executeQuery();
			    while(resultSet.next())
			    {
			    	int id =resultSet.getInt(1);
			    	String name=resultSet.getString(2); 
			    	String email =resultSet.getString(3);
			    	long phone=resultSet.getLong(4);
			    	
			    	System.out.println(id);
			    	System.out.println(name);
			    	System.out.println(email);
			    	System.out.println(phone);
			    	System.out.println("========================");
			    			
			    }
				return student;
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			return null;
		
		}
}
