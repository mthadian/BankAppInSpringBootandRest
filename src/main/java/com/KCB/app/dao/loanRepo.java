package com.KCB.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.KCB.app.model.Loans;

public interface loanRepo extends JpaRepository<Loans, Integer>
{
 
}
