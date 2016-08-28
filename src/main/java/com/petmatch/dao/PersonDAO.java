package com.petmatch.dao;

import java.util.List;

import com.petmatch.domain.Person;

public interface PersonDAO {
	
	public void addPerson(Person person);

	 //public List<Person> listPersons();
	 public List<Person> findAll();
	 public Person getEmployee(int empid);
	 
	 public void deleteEmployee(Person employee);
}
