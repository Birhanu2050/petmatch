package edu.mum.cs544.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import edu.mum.cs544.domain.Pet;
import edu.mum.cs544.services.PetService;


@Controller

public class PetController {
	@Autowired
	private PetService petService;

	public void setPetService(PetService petService) {
		this.petService = petService;
	}

	@RequestMapping(value = "/pet", method = RequestMethod.GET)
	public String addPet(Model model) {
		/*
		 * Pet p = new Pet(); p.setPetId(1); p.setPetName("boby");
		 * p.setPetColor("red"); p.setPetDescription("Bark every morning");
		 */
		model.addAttribute("pet", new Pet());
		return "addpet";
	}

	@RequestMapping(value = "/pet", method = RequestMethod.POST)
	public String addPet(@Valid Pet pet, BindingResult bindingResult) {
		
		petService.save(pet);
		return "petsucess";
	}

	@RequestMapping("/")
	public String entry() {
		return "home";
	}
}
