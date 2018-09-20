package com.KCB.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.KCB.app.model.Accounts;

//@Repository
public interface accountRepo extends JpaRepository<Accounts , Integer>
{
	public List<Accounts> findByCustomerId(int customerId);

}
