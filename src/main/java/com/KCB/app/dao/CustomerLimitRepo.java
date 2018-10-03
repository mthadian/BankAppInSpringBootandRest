package com.KCB.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.KCB.app.model.CustomerLimits;

public interface CustomerLimitRepo extends JpaRepository<CustomerLimits, Integer>
{

}
