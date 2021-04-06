package com.hcl.petpeers.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="PET")
public class Pet {
	
	@Id
	@Column(name="PET_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer petId;
	
	@Column(name="PET_NAME")
	@NotEmpty
	@Size(min=3,max=10)
	private String petName;
	
	
	@Column(name="PET_BREED")
	@NotEmpty
	@Size(min=3,max=10)
	private String petBreed;
	
	
	@Column(name="PET_AGE")
	@NotNull
	private Integer petAge;
	
	
	private User user;
	
	
	
	
	/*
	 * public Pet(Integer petId, String petName, String petBreed, Integer petAge,
	 * User user) { super(); this.petId = petId; this.petName = petName;
	 * this.petBreed = petBreed; this.petAge = petAge; this.user = user; }
	 */

	public Pet() {
		
	}


	public Integer getPetId() {
		return petId;
	}


	public void setPetId(Integer petId) {
		this.petId = petId;
	}


	public String getPetName() {
		return petName;
	}


	public void setPetName(String petName) {
		this.petName = petName;
	}


	public String getPetBreed() {
		return petBreed;
	}


	public void setPetBreed(String petBreed) {
		this.petBreed = petBreed;
	}


	public Integer getPetAge() {
		return petAge;
	}


	public void setPetAge(Integer petAge) {
		this.petAge = petAge;
	}


	

	
	


}