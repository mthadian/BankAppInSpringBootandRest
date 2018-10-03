package com.KCB.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.KCB.app.model.CustomerLoans;

public interface customerLoanRepo extends JpaRepository<CustomerLoans, String>
{

}
