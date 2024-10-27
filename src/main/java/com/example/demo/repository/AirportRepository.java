package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.Airport;
import com.example.demo.repository.baseRepository.CreateRepository;
import com.example.demo.repository.baseRepository.GetRepository;
import com.example.demo.repository.baseRepository.UpdateRepository;

@Repository
public interface AirportRepository extends CreateRepository<Airport>, GetRepository<Airport>, UpdateRepository<Airport>{

}
