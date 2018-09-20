package com.KCB.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.KCB.app.model.Customers;

//@Repository
public interface customerRepo extends JpaRepository<Customers, Integer>
{

	
}
