package com.example.demo.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "passengers")
public class Passenger extends BaseEntity {
  private String surname;
  private String name;
  private String lastName;
  private LocalDate birthDate;
  private Set<Benefit> benefits;
  private String login;
  private String password;
  private Set<Ticket> tickets;

  public Passenger(String surname, String name, String lastName, LocalDate birthDate, String login, String password) {
    this.surname = surname;
    this.name = name;
    this.lastName = lastName;
    this.birthDate = birthDate;
    this.login = login;
    this.password = password;
    this.benefits = new HashSet<>();
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

  @Column(name = "birth_date")
  public LocalDate getBirthDate() {
    return birthDate;
  }

  @ManyToMany
  public Set<Benefit> getBenefits() {
    return benefits;
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
  public Set<Ticket> getTickets() {
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

  public void setBirthDate(LocalDate birth) {
    this.birthDate = birth;
  }

  public void setBenefits(Set<Benefit> benefits) {
    this.benefits = benefits;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setTickets(Set<Ticket> tickets) {
    this.tickets = tickets;
  }
}
