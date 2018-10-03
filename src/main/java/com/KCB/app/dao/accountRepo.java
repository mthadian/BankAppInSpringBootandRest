package com.KCB.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.KCB.app.model.Accounts;

//@Repository
public interface accountRepo extends JpaRepository<Accounts , Integer>
{
	public List<Accounts> findByCustomerId(int customerId);
	//public List<Accounts> findByCustomer(int customer);

}
