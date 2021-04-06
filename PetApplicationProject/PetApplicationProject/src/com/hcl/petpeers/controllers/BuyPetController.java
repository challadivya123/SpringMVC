
package com.hcl.petpeers.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hcl.petpeers.model.Pet;
import com.hcl.petpeers.model.User;
import com.hcl.petpeers.service.PetService;

@Controller
public class BuyPetController {

	@Autowired
	PetService petservice;
	
	@RequestMapping("/buypets")
	public String getBuyPetsPage(Model model,HttpServletResponse response) {
		
		List<Pet> availPets = petservice.displayPetsAvailable();
		model.addAttribute("availPets", availPets);
		
		return "buypets";
	}
	
	@RequestMapping("/buypet/{pid}")
	public String getBuyPetPage(@PathVariable int pid,Model model,HttpServletRequest httpServletRequest) {
		String message ="";
		HttpSession session = httpServletRequest.getSession();
		User user = (User) session.getAttribute("validUser");
		Pet pet = petservice.buyPet(pid, user);
		if(pet==null) {
			 message ="Sorry your Purchase Failed..!!";
			model.addAttribute("message",message);
		}
		message="Your purchase is success!! ";
		model.addAttribute("updated_pet",pet);
		model.addAttribute("message",message);
		return "buypet";
		
	}
}
