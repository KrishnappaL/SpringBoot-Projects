package com.example.demo;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import jakarta.transaction.Transactional;

													//classname,datatype of primary key
	public interface BookDB extends CrudRepository<Book,Integer> {

		@Transactional
		@Modifying	
		@Query("update Book book set  book.bookTitle=?1 where book.bookNo=?2 ")

												//?1 first one		?2 second one take
			void updateBookName(String title,int no); //calls above query
	}			
	