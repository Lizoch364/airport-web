package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.Flight;
import com.example.demo.repository.baseRepository.CreateRepository;
import com.example.demo.repository.baseRepository.GetRepository;
import com.example.demo.repository.baseRepository.UpdateRepository;

@Repository
public interface FlightRepository extends CreateRepository<Flight>, GetRepository<Flight>, UpdateRepository<Flight>{

}
