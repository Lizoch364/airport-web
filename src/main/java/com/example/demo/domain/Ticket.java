package com.example.demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tickets")
public class Ticket extends BaseEntity {
  private Passenger passenger;
  private Flight flight;
  private int price;

  public Ticket(Passenger passenger, Flight flight, int price) {
    this.passenger = passenger;
    this.flight = flight;
    this.price = price;
  }

  protected Ticket() {}

  @ManyToOne
  @JoinColumn(name = "passenger_id")
  public Passenger getPassenger() {
    return passenger;
  }

  @ManyToOne
  @JoinColumn(name = "flight_id")
  public Flight getFlight() {
    return flight;
  }

  @Column(name = "price")
  public int getPrice() {
    return price;
  }

  public void setPassenger(Passenger passenger) {
    this.passenger = passenger;
  }

  public void setFlight(Flight flight) {
    this.flight = flight;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
