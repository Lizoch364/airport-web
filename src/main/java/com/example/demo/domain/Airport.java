package com.example.demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "airport")
public class Airport extends BaseEntity{
  private String name;
  private String city;

  public Airport(String name, String city) {
    this.name = name;
    this.city = city;
  }

  protected Airport() {}

  @Column(name = "name")
  public String getName() {
    return name;
  }

  @Column(name = "city")
  public String getCity() {
    return city;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCity(String city) {
    this.city = city;
  }
}
