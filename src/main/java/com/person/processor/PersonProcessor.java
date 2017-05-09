package com.person.processor;

import org.springframework.stereotype.Service;

import com.person.model.Person;
import com.person.model.PersonRequestModel;

@Service
public class PersonProcessor {

	public Person getPersonById(PersonRequestModel request) throws Exception {
		if (request.getPersonId() ==-99)
			throw new Exception();
		return new Person("John",
				"Doe",
				"Middle Brook ",
				21,
				"Orange Inc.",
				"Steve",
				"loveyou@sanfrancisco.com",
				"669-000-0000",
				"1st Street",
				"",
				"city",
				"San Francisco",
				"CA",
				"US");
	}

}
