package com.KCB.app.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class CustomerLoans 
{
	@Id
	private String loanCode;
	private int customerId;
	private Date dateCreated;
	private Date maturityDate;
	
	
	
	
	public String getLoanCode() {
		return loanCode;
	}




	public void setLoanCode(String loanCode) {
		this.loanCode = loanCode;
	}




	public int getCustomerId() {
		return customerId;
	}




	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}




	public Date getDateCreated() {
		return dateCreated;
	}




	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}




	public Date getMaturityDate() {
		return maturityDate;
	}




	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}




	@Override
	public String toString() {
		return "CustomerLoans [loanCode=" + loanCode + ", customerId=" + customerId + ", dateCreated=" + dateCreated
				+ ", maturityDate=" + maturityDate + "]";
	}
	
	

}
