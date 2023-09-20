package com.example.demo;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
//crud gave employee object to EmployeeDB

import jakarta.transaction.Transactional;
public interface EmployeeDB  extends CrudRepository<Employee, Integer>{
@Transactional
@Modifying
@Query("update Employee emp set emp.name=?1 where emp.empId=?2 ")
	void updateEmployee(String name,int no);

}
