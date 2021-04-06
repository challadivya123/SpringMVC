package com.hcl.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.pojo.User;
import com.hcl.pojo.Pet;
@Repository
@Transactional
public class PetDaoImpl implements PetDao {

	@Autowired
	SessionFactory sessionFactory;

	public String addPet(Pet Pet, User user) {
		// TODO Auto-generated method stub
		String message = "Sucessfully Registered";
		//pet.setUser(user);
		Session session = sessionFactory.getCurrentSession();
		if (session != null) {
			session.save(Pet);
			return message;
		}
		return "Not Registered";
	}
		
	

	public List<Pet> displayPets(User user) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String sql = "from Pet p where p.user.id=:uid";
		@SuppressWarnings("unchecked")
		
		List<Pet> myPetList = (List) session.createQuery(sql).setParameter("uid", user.getUserid()).list();
		//List<Pet> mypet = session.createQuery(sql).setParameter("uid", user.getUserid()).list();
		return myPetList ;
	}

	public Pet buyPet(int pid, User user) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Pet Pet = (Pet) session.get(Pet.class, pid);
		if (Pet != null) {
			Pet.setUser(user);
			session.save(Pet);
			Pet updated_pet = (Pet) session.get(Pet.class, pid);
			return updated_pet;
		}

		return null;
	}

	public List<Pet> displayPetsAvailable() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String sql = "from Pet p ";
		List<Pet> availPets = session.createQuery(sql).list();
		return availPets;
	}
		

}