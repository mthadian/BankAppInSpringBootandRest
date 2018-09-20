package com.KCB.app.model;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Accounts
{
	@Id
	private int AccId;
	private int customerId;
	private int AccountBalance;
	
	
	public void setAccId(int AccId)
	{
		this.AccId=AccId;
	}
	public int getAccId()
	{
		return AccId;
	}
	
	//Customer Id
	public void setCustomerId(int customerId)
	{
		this.customerId=customerId;
	}
	public int getCustomerId()
	{
		return customerId;
	}
	
	//Get AccountBalance
	
	public void setAccountBalance(int AccountBalance)
	{
		this.AccountBalance=AccountBalance;
	}
	
	public int getAccountBalance()
	{
		return AccountBalance;
	}
	
	
	public String toString()
	{
		return "Customer [AccId="+ AccId +", CustomerId="+ customerId +", AccountBalance="+ AccountBalance +"]";
	}

}
