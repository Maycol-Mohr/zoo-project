package com.maycol.br.zooproject.entities;

import java.io.Serializable;
import java.util.Objects;

public class Manager implements Serializable {

  private Long id;
  private String name;

  public Manager() {
  }

  public Manager(Long id, String name) {
    this.id = id;
    this.name = name;
  }

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Manager manager = (Manager) o;
    return id.equals(manager.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}