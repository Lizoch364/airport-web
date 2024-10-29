package com.example.demo.repository.impl;

import com.example.demo.domain.Flight;
import com.example.demo.repository.FlightRepository;
import com.example.demo.repository.baseRepository.BaseRepositoryImpl;

public class FlightRepositoryImpl extends BaseRepositoryImpl<Flight> implements FlightRepository{
  public FlightRepositoryImpl(Class<Flight> domainClass) {
    super(Flight.class);
  }
}
