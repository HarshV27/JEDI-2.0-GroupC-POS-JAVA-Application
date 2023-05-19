package com.flipkart.client;
import java.util.Scanner;
import com.flipkart.service.AdminOperation;
import com.flipkart.service.CourseOperation;

public class CRSAdminMenu {
    Scanner sc = new Scanner(System.in);
    
    public void createMenu(){
        while(CRSApplicationClient.loggedin){ 

        System.out.println("**************** Admin Menu ****************");
        
        System.out.println("1. View Courses in catalog");
        System.out.println("2. Add Course to catalog");
        System.out.println("3. Delete Course from catalog");
        System.out.println("4. Approve Student Registeration");
        System.out.println("5. View Pending Approvals");
        System.out.println("6. Add Professor");
        System.out.println("7. Assign Professor To Courses");
        System.out.println("8. Generate Report Card");
        System.out.println("9. Logout");
        System.out.println("*******************************");

        int choice = sc.nextInt();
        AdminOperation adminoperations = new AdminOperation();
        CourseOperation courses = new CourseOperation();

            switch (choice) {
            
            case 1: 

                courses.viewCoursesDetails();
                System.out.println("1. View Courses in catalog");
                break;

            case 2:
                //add course to catelog here *******
                adminoperations.assignCourse();
                System.out.println("2. Add Course to catalog");
                break;

            case 3:

                adminoperations.dropCourse();
                System.out.println("3. Delete Course from catalog");

                break;

            case 4:
 
                adminoperations.approveStudent();
                System.out.println("4. Approve Student Registeratio");
                break;

            case 5:

                adminoperations.viewPendingApprovals();
                System.out.println("5. View Pending Approvals");
                break;

            case 6:

                adminoperations.addProfessor();
                System.out.println("6. Add Professor");
                break;

            case 7:

                adminoperations.assignCourse();
                System.out.println("7. Assign Professor To Courses");
                break;

            case 8:

                 adminoperations.generateGradeCard();
                 System.out.println("8. Generate Report Card");
                 break;

            case 9:
            
                 CRSApplicationClient.loggedin = false;
                 return;

            default:
            
                System.out.println("Incorrect Choice!");
            
            }
       }
    }
}