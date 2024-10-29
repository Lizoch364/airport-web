package com.example.demo.repository.impl;

import com.example.demo.domain.Airline;
import com.example.demo.repository.AirlineRepository;
import com.example.demo.repository.baseRepository.BaseRepositoryImpl;

public class AirlineRepositoryImpl extends BaseRepositoryImpl<Airline> implements AirlineRepository{
  public AirlineRepositoryImpl(){
    super(Airline.class);
  }
}
