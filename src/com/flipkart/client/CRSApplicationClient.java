package com.flipkart.client;
import com.flipkart.service.LoginOperation;
import java.util.Scanner;

public class CRSApplicationClient {
    static boolean loggedin = false;
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);	
		int userChoice;	
        LoginOperation login = new LoginOperation();
		login.create_Main_Menu();
		userChoice=sc.nextInt();

        while(userChoice!=4)
		{
			switch(userChoice)
			{	
				case 1:

        	        loginUser();
					break;

				case 2:

				    login.registerStudent();
					break;

				case 3:

				    login.updatePassword();
					break;

				default:

					System.out.println("Invalid Input");
			}

			login.create_Main_Menu();
			userChoice=sc.nextInt();

		}
		sc.close();
	}
    


    public static void loginUser()
	{
		
		Scanner in = new Scanner(System.in);
	
		String userId,password,role;
		
        System.out.println("+++++++++++++++++ Login ++++++++++++++++++++++");
		System.out.println("Email:");
		userId = in.next();
		System.out.println("Password:");
		password = in.next();
        System.out.println("Role:");
		role = in.next();

		loggedin =  true;    
		
		if(loggedin)
		{	  
			switch(role) {
				case "Admin":
			
					System.out.println("Successfully logined as Admin");
				
					CRSAdminMenu adminMenu = new CRSAdminMenu();
					adminMenu.createMenu();
					break;
				case "Professor":
			
					System.out.println("Successfully logined as Professor");
					CRSProfessorMenu professorMenu=new CRSProfessorMenu();
					professorMenu.createMenu(userId);
				
					
					break;
				case "Student":
					
				    System.out.println("Successfully logined as Student");
				
					boolean isApproved=true; 
					if(isApproved) {
						
						CRSStudentMenu studentMenu=new CRSStudentMenu();
						studentMenu.create_menu();
            	        System.out.println("StudentMenu");
						
					} else {
						System.out.println("Failed to login, you have not been approved by the administration!");
						loggedin=false;
					}
					break;
				}		
		}
		else
		{
			System.out.println("Invalid Credentials!");
		}
		
	}
	
}