package com.example.IntellectTest.DOA;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserData {
	
	@Id
	@GeneratedValue
	private String id;
	private String fName;
	private String lName;
	private String email;
	private int pincCode;
	private Date birthDate;
	private boolean isActive;
	
	
	public UserData() {
		super();
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getPincCode() {
		return pincCode;
	}


	public void setPincCode(int pincCode) {
		this.pincCode = pincCode;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	
	
	
	
	
	
	

}
