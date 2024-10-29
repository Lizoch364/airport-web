package com.example.demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "airlines")
public class Airline extends BaseEntity {
  private String name;

  public Airline(String name) {
    this.name = name;
  }

  protected Airline() {}

  @Column(name = "name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
