package com.example.demo.repository.impl;

import com.example.demo.domain.Ticket;
import com.example.demo.repository.TicketRepository;
import com.example.demo.repository.baseRepository.BaseRepositoryImpl;

public class TicketRepositoryImpl extends BaseRepositoryImpl<Ticket> implements TicketRepository{
  public TicketRepositoryImpl(Class<Ticket> domainClass) {
    super(Ticket.class);
  }
}
