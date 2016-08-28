package com.petmatch.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.petmatch.dao.PersonDAO;
import com.petmatch.domain.Person;

@Repository
@SuppressWarnings({"unchecked", "rawtypes"})
public class PersonDAOImpl implements PersonDAO {
	@Autowired
private SessionFactory sessionFactory;
	@Transactional
	public List<Person> findAll() {
	//return	(List<Person>) sessionFactory.getCurrentSession().createCriteria(Person.class).list();
		Session session = sessionFactory.getCurrentSession();
		List<Person> persons=session.createQuery("from Person").list();
		// TODO Auto-generated method stub
		return persons;
	}
	@Override
	public void addPerson(Person person) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Person getEmployee(int empid) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteEmployee(Person employee) {
		// TODO Auto-generated method stub
		
	}

}
