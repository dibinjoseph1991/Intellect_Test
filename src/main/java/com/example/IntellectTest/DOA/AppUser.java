package com.example.IntellectTest.DOA;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AppUsers")
public class AppUser {
	
	@Id
	@GeneratedValue
	private String id;
	
	@Column
	private String fName;
	
	@Column
	private String lName;
	
	@Column
	private String email;
	
	@Column
	private int pincCode;
	
	@Column
	private String birthDate;
	
	@Column
	private boolean isActive;
	
	
	public AppUser() {
		
	}


	public AppUser(String id, String fName, String lName, String email, int pincCode, String birthDate,
			boolean isActive) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.pincCode = pincCode;
		this.birthDate = birthDate;
		this.isActive = isActive;
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


	public String getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}


	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	
	
	
	
	
	
	

}
