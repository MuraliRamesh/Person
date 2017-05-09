package com.person.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class PersonRequestModel {
	
	@NotNull
	@Length(min=3)
	private long personId;

	/**
	 * @return the personId
	 */
	public long getPersonId() {
		return personId;
	}

	/**
	 * @param personId the personId to set
	 */
	public void setPersonId(long personId) {
		this.personId = personId;
	}
	
}
