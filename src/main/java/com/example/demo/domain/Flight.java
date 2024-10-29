package com.example.demo.domain;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "flights")
public class Flight extends BaseEntity {
  private String name;
  private LocalDate startDate;
  private LocalDate endDate;
  private Airport departureAirport;
  private Airport arrivalAirport;
  private Airline airline;
  private Set<Ticket> tickets;

  public Flight(String name, LocalDate startDate, LocalDate endDate, Airport departureAirport, Airport arrivalAirport, Airline airline) {
    this.name = name;
    this.startDate = startDate;
    this.endDate = endDate;
    this.departureAirport = departureAirport;
    this.arrivalAirport = arrivalAirport;
    this.airline = airline;
  }

  protected Flight() {}

  @Column(name = "name")
  public String getName() {
    return name;
  }

  @Column(name = "start_date")
  public LocalDate getStartDate() {
    return startDate;
  }

  @Column(name = "end_date")
  public LocalDate getEndDate() {
    return endDate;
  }

  @ManyToOne
  @JoinColumn(name = "departure_airport_id")
  public Airport getDepartureAirport() {
    return departureAirport;
  }

  @ManyToOne
  @JoinColumn(name = "arrival_airport_id")
  public Airport getArrivalAirport() {
    return arrivalAirport;
  }

  @ManyToOne
  @JoinColumn(name = "airline_id")
  public Airline getAirline() {
    return airline;
  }

  @OneToMany(mappedBy = "flight")
  public Set<Ticket> getTickets() {
    return tickets;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public void setDepartureAirport(Airport departureAirport) {
    this.departureAirport = departureAirport;
  }

  public void setArrivalAirport(Airport arrivalAirport) {
    this.arrivalAirport = arrivalAirport;
  }

  public void setAirline(Airline airline) {
    this.airline = airline;
  }

  public void setTickets(Set<Ticket> tickets) {
    this.tickets = tickets;
  }
}
