package com.hcl.petpeers.service;

import java.util.List;

import com.hcl.petpeers.model.Pet;
import com.hcl.petpeers.model.User;

public interface PetService {

	String addPet(Pet pet,User user);
	List<Pet> displayPets(User user);
	Pet buyPet(int pid,User user);
	List<Pet> displayPetsAvailable();
}
