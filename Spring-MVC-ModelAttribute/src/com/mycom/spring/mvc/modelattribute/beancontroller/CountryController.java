package com.mycom.spring.mvc.modelattribute.beancontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.mycom.spring.mvc.modelattribute.bean.Country;

@Controller
public class CountryController {
	@ModelAttribute
	public Country getCountry(@RequestParam String countryName,@RequestParam long population) {
		Country country=new Country();
		country.setCountryName(countryName);
		country.setPopulation(population);
		return country;
	}
public String showCountry(@ModelAttribute Country country,ModelMap model) {
	System.out.println("Country Name:"+country.getCountryName());
	System.out.println("Population:"+country.getPopulation());
model.addAttribute("countryName",country.getCountryName());
model.addAttribute("population",country.getPopulation());
return "countryDetails";
}
}
