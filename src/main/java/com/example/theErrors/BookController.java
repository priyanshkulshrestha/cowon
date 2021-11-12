package com.example.theErrors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {
	@Autowired
	private BookRepository brepo;
	@GetMapping("/book")
	public BookBed  bookAvailableBed() {
		BookBed bBed = new BookBed("458975621456", "AadharCard", "Mahira", "7845964871", "mahira@gmail.com", "Ventilator", "ABC Delhi");

		brepo.save(bBed);
		return bBed;
	}
	

}
