package com.petmatch.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.petmatch.dao.PersonDAO;
//import com.petmatch.dao.PersonRepository;
import com.petmatch.domain.Person;
@Controller
@SessionAttributes
public class PersonController {
	@Autowired private PersonDAO personDAO;
	//@Autowired private PersonRepository personRepository;
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
		List<Person> persons = personDAO.findAll();//personRepository.findById(1); //
    model.addAttribute("persons", persons);
    return "hellopet";
  }
@RequestMapping(value = "/addOwner", method = RequestMethod.GET)  
public String addContact(){//@ModelAttribute("person") Person person, BindingResult result) {  
    //write the code here to add contact  
    return "addOwner";  
} 

    @RequestMapping(value = "/addOwner", method = RequestMethod.POST)  
    public String addContact(@ModelAttribute("person") Person person, BindingResult result) {  
        //write the code here to add contact  
        return "redirect:owner_registration";  
    }  
    @RequestMapping("hello")
    public String welcome()
    {
     return "hellopet";
    }
}
