package com.example.demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "benefit")
public class Benefit extends BaseEntity{
  private String name;
  private int index;

  public Benefit(String name, int index) {
    this.name = name;
    this.index = index;
  }
  
  protected Benefit() {}

  @Column(name = "name")
  public String getName() {
    return name;
  }

  @Column(name = "index")
  public int getIndex() {
    return index;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setIndex(int index) {
    this.index = index;
  }
}
