package com.maycol.br.zooproject.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tb_animal")
public class Animal implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;

  private String species;

  private String sex;

  private Integer age;

  private String location;

  @ManyToMany
          @JoinTable(name = "tb_animal_caretaker",
                  joinColumns = @JoinColumn(name = "animal_id"),
                  inverseJoinColumns = @JoinColumn(name = "caretaker_id"))
  Set<Caretaker> caretakers = new HashSet<>();

  public Animal() {
  }

  public Animal(Long id, String name, String species, String sex, Integer age, String location) {
    this.id = id;
    this.name = name;
    this.species = species;
    this.sex = sex;
    this.age = age;
    this.location = location;
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

  public String getSpecies() {
    return species;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Set<Caretaker> getCaretakers() {
    return caretakers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Animal manager = (Animal) o;
    return id.equals(manager.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}