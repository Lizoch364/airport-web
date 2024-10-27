package com.example.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Passenger;
import com.example.demo.repository.PassengerRepository;

@Component
public class ConsoleRunner implements CommandLineRunner {
  private PassengerRepository passengerRepository;

  @Autowired
  public ConsoleRunner(PassengerRepository passengerRepository) {
    this.passengerRepository = passengerRepository;
  }

  @Override
  public void run(String... args) throws Exception {
    Passenger passenger = new Passenger("фамилия", "имя",  "отчество",  LocalDate.now(), "login", "password");
    passengerRepository.save(passenger);
  }

}
