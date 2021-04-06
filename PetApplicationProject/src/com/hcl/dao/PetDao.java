package com.hcl.dao;

import java.util.List;

import com.hcl.pojo.User;
import com.hcl.pojo.Pet;

public interface PetDao {

	String addPet(Pet Pet,User user);
	List<Pet> displayPets(User user);
	Pet buyPet(int pid,User user);
	List<Pet> displayPetsAvailable();
}