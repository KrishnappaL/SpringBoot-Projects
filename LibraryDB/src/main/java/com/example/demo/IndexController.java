package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller  
public class IndexController {
	@Autowired
	BookDB bookDB;
	
	//ResponseEntity<Book> re;

	
	@GetMapping("lib") 
	public ModelAndView index() {
		ModelAndView mv=new ModelAndView();	
		mv.setViewName("library.jsp");	
		return mv; 
	}
	@GetMapping("insertlib") 
	public ModelAndView add(Book book) { 
		System.out.println(book.getAuthorName());
		ModelAndView mv=new ModelAndView();
		bookDB.save(book);
		mv.addObject("bookDetails",book);
		mv.setViewName("bookAdded.jsp");
		return mv;
	}
	@GetMapping("deletelib") 
	public ModelAndView delete(Book book) { 
		Optional<Book> opt =bookDB.findById(book.getBookNo());	//optional-->the data is present in database or not
		Book b=opt.get();  //take 
		ModelAndView mv=new ModelAndView();
		mv.addObject("bookDetails",b);
		mv.setViewName("deleted.jsp");
		bookDB.deleteById(book.getBookNo());
		return mv;
	}
	@GetMapping("updatelib") 
	public ModelAndView update(Book book) { 
		bookDB.updateBookName(book.getBookTitle(),book.getBookNo());
		ModelAndView mv=new ModelAndView();
		mv.addObject("bookDetails",book);
		mv.setViewName("updated.jsp");
		return mv;
	}
	@GetMapping("viewlib") 
	public ModelAndView view(Book book) { 
		bookDB.findById(book.getBookNo());	//optional take optional value that is present otherwise null//more data want to print
		Optional<Book> opt =bookDB.findById(book.getBookNo());	//optional-->the data is present in database or not
		Book em=opt.get();  
		ModelAndView mv=new ModelAndView();
		mv.addObject("bookDetails",em);
		mv.setViewName("display.jsp");
		return mv;
	}
	/*
	 * @GetMapping("apilearning") //not use requestmapping //@RequestBody take data
	 * from postman-API to controller public ResponseEntity<Book>
	 * api_data(@RequestBody Book bo) { System.out.println(bo.getAuthorName());
	 * ModelAndView mv=new ModelAndView(); mv.addObject("book",bo);
	 * mv.setViewName("library.jsp"); // return re; return new
	 * ResponseEntity("Insufficient books",HttpStatus.BAD_GATEWAY); //return new
	 * ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR); //return new
	 * ResponseEntity(book,HttpStatus.INTERNAL_SERVER_ERROR);
	 * 
	 * 
	 * }
	 */

}
