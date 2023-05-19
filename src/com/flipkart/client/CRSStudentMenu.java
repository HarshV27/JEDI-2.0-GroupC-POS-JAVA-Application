package com.flipkart.client;
import java.util.Scanner;
import com.flipkart.service.CourseOperation;
import com.flipkart.service.PaymentOperation;
public class CRSStudentMenu {
    Scanner sc = new Scanner(System.in);
    public void create_menu(){
        while(CRSApplicationClient.loggedin){ 

            System.out.println("************* Student Menu *************");

            System.out.println("1. Register for Course");
            System.out.println("2. Add Course");
            System.out.println("3. Drop Course");
            System.out.println("4. View Course");
            System.out.println("5. View Registered Courses");
            System.out.println("6. View grade card");
            System.out.println("7. Make Payment");
            System.out.println("8. Logout");
            System.out.println("*****************************************");
            
            int choice = sc.nextInt();
            CourseOperation courses = new CourseOperation();
            PaymentOperation paymentoperation = new PaymentOperation();
            
            switch (choice) {
            
            case 1: 
                
                courses.registerCourses();
                System.out.println("1. Register for Course");
                break;

            case 2:
                
                courses.addCourse();
                System.out.println("2. Add Course");
                break;

            case 3:

                courses.dropCourse();
                System.out.println("3. Drop Course");
                break;

            case 4:

                courses.viewCoursesDetails();
                System.out.println("4. View Course");
                break;

            case 5:
               
                courses.viewRegisteredCourses();
                System.out.println("5. View Registered Courses");
                break;

            case 6:
            
                courses.viewGrade();
                System.out.println("6. View grade card");
                break;

            case 7:

                paymentoperation.payFees();
                System.out.println("7. Make Payment");

                break;

            case 8:
                CRSApplicationClient.loggedin = false;
                break;			

            default:
                System.out.println("Incorrect Choice!");

           }   
       }
    }
}