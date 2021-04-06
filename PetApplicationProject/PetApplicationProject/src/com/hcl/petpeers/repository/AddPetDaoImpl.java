package com.hcl.petpeers.repository;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


import com.hcl.petpeers.model.Pet;
import com.hcl.petpeers.model.User;

public class AddPetDaoImpl implements PetDao {
	
	@Autowired
	SessionFactory sessionFactory;
	/*@Override
	public String addPet(Pet pet,User user) {
		System.out.println("Pet Id: " +pet.getPetId());
		sessionFactory.getCurrentSession().save(pet);
		return "pet";
	}*/
		@Override
	    public String addPet(Pet pet, User user) {
			
			
	        String message = "Pet Added Sucessfully";
	        Session session = sessionFactory.getCurrentSession();
	        if (session != null) {
	            session.save(pet);
	            return message;
	        }
	        return " Pet Not Added";
	    }

	 

	    
	    public List<Pet> displayPet(User user) {
	    	
	    	
	    	Session session = sessionFactory.getCurrentSession();
	        String query = "from Pet p where p.petId=:petId";
	        List<Pet> mypet = session.createQuery(query).setParameter("userId", user.getUserEmail()).list();
	        return mypet;
	    }

	 

	    @Override
	    public Pet buyPet(int petId, User user) {

	 

	        Session session = sessionFactory.getCurrentSession();
	        Pet pet = (Pet) session.get(Pet.class, petId);
	        if (pet != null) {
	            //pet.setUser(user);
	            session.save(pet);
	            Pet updated_pet = (Pet) session.get(Pet.class, petId);
	            return updated_pet;
	        }

	 

	        return null;
	    }

	 

	    public List<Pet> displayPetAvailable() {

	 

	        Session session = sessionFactory.getCurrentSession();
	        String query = "from pet p where ";
	        List<Pet> availPets = session.createQuery(query).list();
	        return availPets;
	    }



		@Override
		public List<Pet> displayPets(User user) {
			// TODO Auto-generated method stub
			return null;
		}



		@Override
		public List<Pet> displayPetsAvailable() {
			// TODO Auto-generated method stub
			return null;
		}
		
}