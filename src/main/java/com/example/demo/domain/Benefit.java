package com.example.demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "benefits")
public class Benefit extends BaseEntity{
  private String name;
  private int discountMultiplier;

  public Benefit(String name, int index) {
    this.name = name;
    this.discountMultiplier = index;
  }

  protected Benefit() {}

  @Column(name = "name")
  public String getName() {
    return name;
  }

  @Column(name = "discount_multiplier")
  public int getDiscountMultiplier() {
    return discountMultiplier;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDiscountMultiplier(int index) {
    this.discountMultiplier = index;
  }
}
