package com.KCB.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Loans 
{
	@Id
	private int loanId;
	private int loanAmount;
	private int loanPeriod;
	private String loanStatus;
	private float loanInterest;
	private String chargeCode;
	private String loanCode;
	private String description;
	
	
	public int getLoanId() 
	{
		return loanId;
	}
	public void setLoanId(int loanId) 
	{
		this.loanId = loanId;
	}
	public int getLoanAmount()
	{
		return loanAmount;
	}
	public void setLoanAmount(int loanAmount)
	{
		this.loanAmount = loanAmount;
	}
	public int getLoanPeriod()
	{
		return loanPeriod;
	}
	public void setLoanPeriod(int loanPeriod)
	{
		this.loanPeriod = loanPeriod;
	}
	public String getLoanStatus() 
	{
		return loanStatus;
	}
	public void setLoanStatus(String loanStatus) 
	{
		this.loanStatus = loanStatus;
	}
	public float getLoanInterest() 
	{
		return loanInterest;
	}
	public void setLoanInterest(float loanInterest) 
	{
		this.loanInterest = loanInterest;
	}
	public String getChargeCode() 
	{
		return chargeCode;
	}
	public void setChargeCode(String chargeCode) 
	{
		this.chargeCode = chargeCode;
	}
	public String getLoanCode() 
	{
		return loanCode;
	}
	public void setLoanCode(String loanCode)
	{
		this.loanCode = loanCode;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
	@Override
	public String toString() {
		return "Loans [loanId=" + loanId + ", loanAmount=" + loanAmount + ", loanPeriod=" + loanPeriod + ", loanStatus="
				+ loanStatus + ", loanInterest=" + loanInterest + ", chargeCode=" + chargeCode + ", loanCode="
				+ loanCode + ", description=" + description + "]";
	}
	
	
	
	

}
