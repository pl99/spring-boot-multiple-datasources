package com.foobar.bar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "delmeuser", schema = "ext")
public class Bar {

  @Id
  private Long id;
  private String name;
  private String dept;
  private Float salary;
  private java.sql.Date time;
  @Column(name = "other_name")
  private String myField; // my_field

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDept() {
    return dept;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }

  public Float getSalary() {
    return salary;
  }

  public void setSalary(Float salary) {
    this.salary = salary;
  }

  public Date getTime() {
    return time;
  }

  public void setTime(Date time) {
    this.time = time;
  }

  public String getMyField() {
    return myField;
  }

  public void setMyField(String myField) {
    this.myField = myField;
  }

  public Bar() {
  }
}
