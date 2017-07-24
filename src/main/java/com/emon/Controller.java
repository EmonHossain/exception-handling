package com.emon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private ExceptionService exception;
	
	@GetMapping(value="/person/info")
	public ResponseEntity<Person> getPerson(){
		return new ResponseEntity<Person>(new Person(), HttpStatus.NOT_FOUND);
	}
	@GetMapping(value="/person/plain")
	public Person getPlainPerson(){
		return new Person("Emon",12);
	}
	@GetMapping(value="/person/exception-test")
	public Person exception() throws Exception{
		exception.throwNullPointerException();
		return new Person();
	}
	
}
