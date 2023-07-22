package com.jsp.student_curd_with_prepared.controller;

import java.util.Scanner;

import com.jsp.student_curd_with_prepared.dto.Student;
import com.jsp.student_curd_with_prepared.service.StudentService;

public class StudentController {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("main method started!!!!!!!!!!!!!!");
		Student student = null;
		 StudentService studentService  = new StudentService();

		 System.out.println("1.Insert\n2.Update\n3.Delete\n4.Display");
		 System.out.println("enter your option");
		 int ch =sc.nextInt();
		 switch (ch)
		 {
		 /**
		  * case 1 for insertion data
		  */
		 case 1:{
			 System.out.println("enter student id ");
			 int id =sc.nextInt();
			 System.out.println("enter student name");
			 String name=sc.next();
			 System.out.println("enter student email");
			 String email=sc.next();
			 System.out.println("enter student phone");
			 long phone=sc.nextLong();
			 student  = new Student(id ,name , email,phone);
			
			 studentService.insertStudentService(student);
			 System.out.println("main method ended!!!!!!!!!!!!!!");
		 }
		 break;
		 /**
		  * case 2 for updation of data
		  */
		 case 2:{
			   System.out.println("1.Name\n2.email\n3.phone");
			   System.out.println("please choose your option to update your data");
			   int chi =sc.nextInt();
			   switch(chi)
			   {
			   case 1:
			   {
				   System.out.println("enter student id");
					 int id =sc.nextInt();
					 System.out.println("enter student name");
					 String name=sc.next();
				     int id1=	studentService.updateStudentName(id, name);
				     if(id1==1)
				     {
					    System.out.println("Name data updated");
				     }
				     else {
					    System.err.println("id not matched pls enter correct id");
				     }
			   }
			   break;
			   case 2:{
				   System.out.println("enter student id");
					 int id =sc.nextInt();
					 System.out.println("enter student email");
					 String email=sc.next();
				     int id11=	studentService.updateStudentEmail(id, email);
				     if(id11==1)
				     {
					    System.out.println("Email data updated");
				     }
				     else {
					    System.err.println("id not matched pls enter correct id");
				     }
			   }
			   break;
			   case 3:{
				   System.out.println("enter student id");
					 int id =sc.nextInt();
					 System.out.println("enter student phone");
					 String phone=sc.next();
				     int id12=	studentService.updateStudentPhone(id, phone);
				     if(id12==1)
				     {
					    System.out.println("Phone data updated");
				     }
				     else {
					    System.err.println("id not matched pls enter correct id");
				     }
			         }
			         break;
			        }
			  
		     }
		 break;
		 /**
		  *  case 3 for deletion of data..
		  */
		 case 3:
		 {
			 System.out.println("enter student id ");
			 int id =sc.nextInt();
			 int id2=	studentService.deleteStudentName(id);
		     if(id2==1)
		     {
			    System.out.println("data deleted");
		     }
		     else {
			    System.err.println("id not matched pls enter correct id");
		     }
		 }
		 break;
		 /**
		  * case 4 
		  */
		 case 4:
		 {
	    student  = new Student();
		studentService.displayStudentData(student);
			 System.out.println("data displayed");
		 }
		 break;
		 default:
		 {
			 System.out.println("enter in given range");
		 }
		 }
		 System.out.println("main method ended...............");
	}

}
