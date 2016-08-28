package com.petmatch.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.petmatch.dao.PersonDAO;
import com.petmatch.domain.Person;
@Controller
public class PersonController {
	@Autowired private PersonDAO personDAO;
@RequestMapping(value="/",method=RequestMethod.GET)
public String list(Model model) {
	/*Person p= new Person();
	p.setId(1);
	p.setName("Jone");
	Person p2= new Person();
	p2.setId(2);
	p2.setName("Jone 1");
List<Person> persons= new ArrayList<Person>();
persons.add(p);
persons.add(p2);*/
		List<Person> persons = personDAO.findAll();
    model.addAttribute("persons", persons);
    return "index";
  }
}
