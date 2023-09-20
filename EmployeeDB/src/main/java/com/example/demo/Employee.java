package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//pojo class change to entity 
@Entity
public class Employee {

	@Id int empId;
private String name;
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return this.name + "-> " +this.empId;
	}
}
