package com.KCB.app.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerLimits 
{
	@Id
	private int customerLimitId;
	private int customerId;
	private int limitAmount;
	private Date createdOn;
	private Date lastRefreshed;
	
	
	public int getCustomerLimitId()
	{
		return customerLimitId;
	}


	public void setCustomerLimitId(int customerLimitId) 
	{
		this.customerLimitId = customerLimitId;
	}


	public int getCustomerId() 
	{
		return customerId;
	}


	public void setCustomerId(int customerId) 
	{
		this.customerId = customerId;
	}


	public int getLimitAmount() 
	{
		return limitAmount;
	}


	public void setLimitAmount(int limitAmount) 
	{
		this.limitAmount = limitAmount;
	}


	public Date getCreatedOn() {
		return createdOn;
	}


	public void setCreatedOn(Date createdOn) 
	{
		this.createdOn = createdOn;
	}


	public Date getLastRefreshed() 
	{
		return lastRefreshed;
	}


	public void setLastRefreshed(Date lastRefreshed) {
		this.lastRefreshed = lastRefreshed;
	}


	@Override
	public String toString() {
		return "CustomerLimits [customerLimitId=" + customerLimitId + ", customerId=" + customerId + ", limitAmount="
				+ limitAmount + ", createdOn=" + createdOn + ", lastRefreshed=" + lastRefreshed + "]";
	}
	
	
	
	

}
