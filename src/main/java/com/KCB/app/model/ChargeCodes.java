package com.KCB.app.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ChargeCodes 
{
	@Id
	private int chargeCodeId;
	private String type;
	private int amount;
	private float rate;
	private String chargeCode;
	
	public int getChargeCodeId()
	{
		return chargeCodeId;
	}
	public void setChargeCodeId(int chargeCodeId)
	{
		this.chargeCodeId = chargeCodeId;
	}
	public String getType() 
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public int getAmount() 
	{
		return amount;
	}
	public void setAmount(int amount)
	{
		this.amount = amount;
	}
	public float getRate() 
	{
		return rate;
	}
	public void setRate(float rate)
	{
		this.rate = rate;
	}
	public String getChargeCode() 
	{
		return chargeCode;
	}
	public void setChargeCode(String chargeCode)
	{
		this.chargeCode = chargeCode;
	}
	@Override
	public String toString() {
		return "ChargeCodes [chargeCodeId=" + chargeCodeId + ", type=" + type + ", amount=" + amount + ", rate=" + rate
				+ ", chargeCode=" + chargeCode + "]";
	}
	
	
	

}
