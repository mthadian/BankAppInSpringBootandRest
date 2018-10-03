package com.KCB.app.model;


import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Accounts
{
	@Id
	private int AccId;
	private int customerId;
	private int AccountBalance;
	
	//@ManyToOne
	//private Customers cus;
	
	

	public int getAccId() 
	{
		return AccId;
	}


	public void setAccId(int accId) 
	{
		AccId = accId;
	}

	public int getCustomerId() 
	{
		return customerId;
	}


	public void setCustomerId(int customerId)
	{
		this.customerId = customerId;
	}

	public int getAccountBalance() 
	{
		return AccountBalance;
	}

	public void setAccountBalance(int accountBalance) 
	{
		AccountBalance = accountBalance;
	}


	@Override
	public String toString() {
		return "Accounts [AccId=" + AccId + ", customerId=" + customerId + ", AccountBalance=" + AccountBalance + "]";
	}

	

}
