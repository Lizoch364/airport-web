package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.Ticket;
import com.example.demo.repository.baseRepository.CreateRepository;
import com.example.demo.repository.baseRepository.DeleteRepository;
import com.example.demo.repository.baseRepository.GetRepository;
import com.example.demo.repository.baseRepository.UpdateRepository;

@Repository
public interface TicketRepository extends CreateRepository<Ticket>, UpdateRepository<Ticket>, GetRepository<Ticket>, DeleteRepository {
}
