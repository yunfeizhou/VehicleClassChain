package main;

import java.util.UUID;

public class Person {
	
	private String FirstName;
	private String LastName;
	private UUID PersonID;
	
	public Person(){
		
	}
	
	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public UUID getPersonID() {
		return PersonID;
	}

	public void setPersonID() {
		UUID PersonID = UUID.randomUUID();
		this.PersonID=PersonID;
	}

}
