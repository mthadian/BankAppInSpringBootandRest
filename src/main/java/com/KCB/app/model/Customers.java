package com.KCB.app.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customers
{
	@Id
	private int Cid;
	private String firstName;
	private String middleName;
	private String lastName;
	private int mobileNumber;
	
	//@OneToMany(mappedBy="cus")
	//private List<Accounts> accounts;

	

	public int getCid() 
	{
		return Cid;
	}

	public void setCid(int cid) {
		Cid = cid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Customers [Cid=" + Cid + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", mobileNumber=" + mobileNumber + "]";
	}

	


	
}
