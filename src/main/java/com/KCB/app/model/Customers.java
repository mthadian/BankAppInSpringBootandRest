package com.KCB.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customers
{
	@Id
	private int Cid;
	private String firstName;
	private String middleName;
	private String lastName;

	public int getCid() {
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
	public String toString()
	{
		return "Customer [Cid="+ Cid +", firstName="+ firstName +", middleName="+ middleName +", lastName="+lastName+"]";
	}


	
}
