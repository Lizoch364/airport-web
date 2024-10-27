package com.example.demo.repository.impl;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.Passenger;
import com.example.demo.repository.PassengerRepository;
import com.example.demo.repository.baseRepository.BaseRepositoryImpl;

@Repository
public class PassengerRepositoryImpl extends BaseRepositoryImpl<Passenger> implements PassengerRepository {
  public PassengerRepositoryImpl() {
    super(Passenger.class);
  }
}
