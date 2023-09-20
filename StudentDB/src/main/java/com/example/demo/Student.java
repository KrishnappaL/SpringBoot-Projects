package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity		//annotation related to jpa not springboot help to create table
//using pojo class we take data to indexcontroller
public class Student {
	private String studentName;
	@Id 		//primary key s first column it is
	private int rollNo;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
