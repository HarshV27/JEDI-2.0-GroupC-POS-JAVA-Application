/**
 * 
 */
package com.flipkart.bean;

import java.util.Date;

/**
 * @author ratnesh.khandelwal
 *
 */
public class SemesterRegistration extends Course{
    private int studentId;
    private int semester;
    private Date dateOfRegistration;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}
	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}
    
    
    
}
