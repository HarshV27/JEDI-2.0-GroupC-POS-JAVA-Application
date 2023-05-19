package com.flipkart.client;

import java.util.Scanner;
import com.flipkart.service.CourseOperation;
import com.flipkart.service.ProfessorOperation;
public class CRSProfessorMenu {
	
	public void createMenu(String profID) {
		Scanner in = new Scanner(System.in);
		
		int input;
		while (CRSApplicationClient.loggedin) {

			System.out.println("****************** Professor Menu ******************");

			System.out.println("1. view Courses");
			System.out.println("2. view Enrolled Students");
			System.out.println("3. add Grades");
			System.out.println("4. logout");
			System.out.println("*****************************************");
			System.out.printf("Choose From Menu: ");
			

			ProfessorOperation professoroperation = new ProfessorOperation();
			CourseOperation courses = new CourseOperation();

			input = in.nextInt();
			switch (input) {
			case 1:
                
				courses.viewCoursesDetails();
                System.out.println("\n1. some Courses\n");
				break;

			case 2:
                
			    professoroperation.viewEnrolledStudent();
                System.out.println("\n2. Enrolled Students\n");
				break;

			case 3:

			    professoroperation.addGrade();
                System.out.println("\n3. Grades added successfully\n");
				break;

			case 4:

				CRSApplicationClient.loggedin = false;
				return;

			default:

				System.out.println("Please select appropriate option...");
			}
		}
		in.close();
	}
				
}