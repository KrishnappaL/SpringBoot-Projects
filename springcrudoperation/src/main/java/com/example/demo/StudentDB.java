package com.example.demo;

import org.springframework.data.jpa.repository.Modifying;	//package name
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import jakarta.transaction.Transactional;
												//classname,datatype	
public interface StudentDB extends CrudRepository<Student,Integer> { //act as student class
			//update is not present in interface so we explicitly written
	@Transactional	//Transaction occur in databae so we use
	@Modifying	//-->modification occur in transaction
	@Query("update Student stud set stud.studentName=?1 where stud.rollNo=?2")
											//?1 first one		?2 second one take
		void updateStudentName(String name,int roll); //calls above query
}
