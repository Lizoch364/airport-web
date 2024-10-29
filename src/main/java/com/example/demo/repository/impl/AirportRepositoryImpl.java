package com.example.demo.repository.impl;

import com.example.demo.domain.Airport;
import com.example.demo.repository.AirportRepository;
import com.example.demo.repository.baseRepository.BaseRepositoryImpl;

public class AirportRepositoryImpl extends BaseRepositoryImpl<Airport> implements AirportRepository{
  public AirportRepositoryImpl(){
    super(Airport.class);
  }
}
