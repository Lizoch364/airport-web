package com.example.demo.repository;

import com.example.demo.domain.Passenger;
import com.example.demo.repository.baseRepository.CreateRepository;
import com.example.demo.repository.baseRepository.GetRepository;
import com.example.demo.repository.baseRepository.UpdateRepository;

public interface PassengerRepository extends CreateRepository<Passenger>, GetRepository<Passenger>, UpdateRepository<Passenger>{

}
