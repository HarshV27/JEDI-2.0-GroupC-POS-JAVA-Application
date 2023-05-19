package com.flipkart.service;
import java.util.Scanner;

public class LoginOperation {

	public void create_Main_Menu()
	{
		System.out.println("++++++++++++++++ Course Management System ++++++++++++++++++++++");

		System.out.println("1. Login");
		System.out.println("2. Student Registration");
		System.out.println("3. Update password");
		System.out.println("4. Exit");

		System.out.print("Enter user input: ");
	}

    public void registerStudent(){
        Scanner sc=new Scanner(System.in);
        String userId,name,password,address;
        
        System.out.println("+++++++++++++++ Student Registration +++++++++++++++++++++++++++++");

        System.out.println("Name:");
        name=sc.nextLine();
        System.out.println("Email:");
        userId=sc.next();
        System.out.println("Password:");
        password=sc.next();
        
        System.out.println("Registeration Completed");

    }   
        
    public void updatePassword() {
        Scanner in = new Scanner(System.in);
        String userId,oldPassword,newPassword;

        System.out.println("++++++++++++++++ Update Password +++++++++++++++++++++++++++++++++");

        System.out.println("Email");
        userId=in.next();
        System.out.println("Old Password:");
        oldPassword=in.next();     
        System.out.println("New Password:");
        newPassword=in.next();
        System.out.println("Password updated successfully!");   
    }
    	
}
