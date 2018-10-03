package com.KCB.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.KCB.app.model.ChargeCodes;

public interface ChargeCodeRepo extends JpaRepository<ChargeCodes, Integer>
{

}
