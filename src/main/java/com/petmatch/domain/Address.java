package com.petmatch.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {
	@Id @GeneratedValue
	private int id;
	private int zipCode;
	public int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	

}
