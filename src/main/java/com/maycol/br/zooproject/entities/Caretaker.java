package com.maycol.br.zooproject.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tb_caretaker")
public class Caretaker implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;

  @ManyToOne
  @JoinColumn(name = "manager_id")
  private Manager manager;

  @ManyToMany(mappedBy = "caretakers")
  private Set<Animal> animals;

  public Caretaker() {
  }

  public Caretaker(Long id, String name, Manager manager) {
    this.id = id;
    this.name = name;
    this.manager = manager;
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

  public Manager getManager() {
    return manager;
  }

  public void setManager(Manager manager) {
    this.manager = manager;
  }

  public Set<Animal> getAnimals() {
    return animals;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Caretaker manager = (Caretaker) o;
    return id.equals(manager.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}