package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "patient")
public class PatientPersonalDetails {

	// fields
	@Id
	@GeneratedValue

	@Max(value = 100, message = "must be equal or greater than 100")
	private int Id;

	@NotBlank(message = "Name is required.")
	private String pName;

	@Min(value = 45, message = "must be equal or greater than 45")
	private int pAge;

	@Min(value = 10, message = "must be equal or less than 10")
	private long phoneNo;

	@NotBlank(message = "Gender is required.")
	private String gender;

	@NotBlank(message = "Address is required.")
	private String address;

	@NotBlank(message = "symptoms is required.")
	private String symptoms;

	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name="uid") User user;
	 */
	// Getters & Setters
	public int getId() {
		return Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpAge() {
		return pAge;
	}

	public void setpAge(int pAge) {
		this.pAge = pAge;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	/*
	 * public User getUser() { return user; } public void setUser(User user) {
	 * this.user = user; }
	 */

	@Override
	public String toString() {
		return "PatientPersonalDetails [pId=" + Id + ", pName=" + pName + ", pAge=" + pAge + ", phoneNo=" + phoneNo
				+ ", gender=" + gender + ", address=" + address + ", symptoms=" + symptoms + "]";
	}

}