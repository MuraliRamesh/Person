package com.person.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.person.model.Person;
import com.person.model.PersonRequestModel;
import com.person.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@RequestMapping("/hello")
	public String hello() throws Exception{
		return "Hello";
	}
	
	
	@RequestMapping("/person")
	@Produces("application/json")
	public Person getPersonById(@RequestParam(value="personId") long  personId) throws Exception{
		PersonRequestModel request = new PersonRequestModel();
		request.setPersonId(personId);
		return personService.getPersonById(request);
	}
	
}
