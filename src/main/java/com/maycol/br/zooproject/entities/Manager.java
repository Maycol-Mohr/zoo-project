package com.maycol.br.zooproject.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_manager")
public class Manager implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;

  @OneToMany(mappedBy = "manager")
  private List<Caretaker> caretakers = new ArrayList<>();

  public Manager() {
  }

  public Manager(Long id, String name, List<Caretaker> caretakers) {
    this.id = id;
    this.name = name;
    this.caretakers = caretakers;
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

  public List<Caretaker> getCaretakers() {
    return caretakers;
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