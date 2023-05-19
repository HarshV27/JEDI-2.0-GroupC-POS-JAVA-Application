/**
 * 
 */
package com.flipkart.service;
import com.flipkart.bean.*;

/**
 * @author ratnesh.khandelwal
 *
 */
public class UserOperation {
	
	User user = new User();
	
//	
//	
//	private void admin() {
//		// TODO Auto-generated method stub
//		System.out.println("SOMETHING SOMETHING SOMETHING SHOEMTHING");
//		
//	}
//
//	private void professor() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private void student() {
//		// TODO Auto-generated method stub
//		
//	}

	
	
	

	public boolean updateDetails(int userID, String Name, String Role) {
		user.setUserId(userID);
		///
		
		System.out.println("update details of the user");
		return true;
	}
	
	public boolean updatePassword() {
		System.out.println("update details of the user");
		return true;
		
	}
}
