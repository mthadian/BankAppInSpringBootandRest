package com.KCB.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.KCB.app.model.Customers;

//@Repository
public interface customerRepo extends JpaRepository<Customers, Integer>
{

	
}
