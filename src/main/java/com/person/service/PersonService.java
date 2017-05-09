package com.person.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.person.model.Person;
import com.person.model.PersonRequestModel;
import com.person.processor.PersonProcessor;

//@Validated
@Service
public class PersonService {

	@Autowired
	private PersonProcessor personProcessor; 

	public Person getPersonById(//@Valid 
			PersonRequestModel request) throws Exception{
		return personProcessor.getPersonById(request);
	}

}
