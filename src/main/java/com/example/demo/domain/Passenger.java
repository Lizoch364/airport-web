package com.example.demo.domain;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "passenger")
public class Passenger extends BaseEntity {
  private String surname;
  private String name;
  private String lastName;
  private LocalDate birth;
  private Benefit[] benefit;
  private String login;
  private String password;
  private Ticket[] tickets;

  public Passenger(String surname, String name, String lastName, LocalDate birth, String login, String password) {
    this.surname = surname;
    this.name = name;
    this.lastName = lastName;
    this.birth = birth;
    this.login = login;
    this.password = password;
  }

  protected Passenger() {}

  @Column(name = "surname")
  public String getSurname() {
    return surname;
  }

  @Column(name = "name")
  public String getName() {
    return name;
  }

  @Column(name = "last_name")
  public String getLastName() {
    return lastName;
  }

  @Column(name = "birth")
  public LocalDate getBirth() {
    return birth;
  }

  @ManyToOne
  @JoinColumn(name = "benefit")
  public Benefit[] getBenefit() {
    return benefit;
  }

  @Column(name = "login")
  public String getLogin() {
    return login;
  }

  @Column(name = "password")
  public String getPassword() {
    return password;
  }

  @OneToMany
  @JoinColumn(name = "tickets")
  public Ticket[] getTickets() {
    return tickets;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setBirth(LocalDate birth) {
    this.birth = birth;
  }

  public void setBenefit(Benefit[] benefit) {
    this.benefit = benefit;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setTickets(Ticket[] tickets) {
    this.tickets = tickets;
  }
}
