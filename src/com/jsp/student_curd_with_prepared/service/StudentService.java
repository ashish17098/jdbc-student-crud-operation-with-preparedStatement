package com.jsp.student_curd_with_prepared.service;

import com.jsp.student_curd_with_prepared.dao.StudentDao;
import com.jsp.student_curd_with_prepared.dto.Student;

public class StudentService {
   StudentDao studentdao = new StudentDao();
   /**
    * insert method for student
    */
   public Student insertStudentService(Student student)
   {
	   System.out.println("insert service method started");
	   if(student.getStudentId()<9999)
	   {
		   Student student2=studentdao.insertStudent(student);
		   System.out.println("insert service method ended");
		   return student2;
		   
	   }else
	   {
		  System.err.println("please pass your id with 4 digit or less than it");
	   }
	   return null;
   }
   public int updateStudentName(int studentId ,String studentName)
	{
	return   studentdao.updateStudentName(studentId, studentName);
	}
   public int updateStudentEmail(int studentId ,String studentEmail)
  	{
  	return   studentdao.updateStudentEmail(studentId, studentEmail);
  	}
   
   public int updateStudentPhone(int studentId ,String studentPhone)
	{
		return studentdao.updateStudentPhone(studentId, studentPhone);
	   
	}
   public int deleteStudentName(int studentId)
	{
	   return studentdao.deleteStudentName(studentId);
	}
   public Student displayStudentData(Student student)
	{
	   Student student3=studentdao.displayStudentData(student);
	   System.out.println("display method ended");
	   return student3   ;
	}
	}
