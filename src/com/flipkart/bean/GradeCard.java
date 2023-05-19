/**
 * 
 */
package com.flipkart.bean;

import java.util.List;

/**
 * @author ratnesh.khandelwal
 *
 */
public class GradeCard {
	private int studentId;
	private int semester;
	private float cpi;
    private List<String> registeredCourses;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentid(int studentid) {
		this.studentId = studentid;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public float getCp1() {
		return cpi;
	}
	public void setCp1(float cp1) {
		cpi = cp1;
	}
	public List<String> getRegisteredCourses() {
		return registeredCourses;
	}
	public void setRegisteredCourses(List<String> registeredCourses) {
		this.registeredCourses = registeredCourses;
	}

    
    

	
}
