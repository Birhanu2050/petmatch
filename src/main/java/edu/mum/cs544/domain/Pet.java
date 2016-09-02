package edu.mum.cs544.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Pet {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int petId;
	private String petName;
/*	//@Temporal(TemporalType.DATE)
	private Date dob;*/
	private String dob;
	@Enumerated(EnumType.STRING)
	private Color petColor;
	
	private String petDescription;
	@Enumerated(EnumType.STRING)
    private Gender gender;
	@Enumerated(EnumType.STRING)
	private PetType petType;
	
	@OneToOne(cascade = CascadeType.ALL)
   
    @JoinColumn(name = "address_id")
	private Address petAddress;
	public String getPetDescription() {
		return petDescription;
	}

	public Color getPetColor() {
		return petColor;
	}

	public void setPetColor(Color petColor) {
		this.petColor = petColor;
	}

	public void setPetDescription(String petDescription) {
		this.petDescription = petDescription;
	}

	

	
	public Address getPetAddress() {
		return petAddress;
	}

	public void setPetAddress(Address petAddress) {
		this.petAddress = petAddress;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public PetType getPetType() {
		return petType;
	}

	public void setPetType(PetType petType) {
		this.petType = petType;
	}

	
	
	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}



	
}
