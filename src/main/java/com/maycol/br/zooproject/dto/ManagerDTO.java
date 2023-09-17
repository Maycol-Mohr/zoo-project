package com.maycol.br.zooproject.dto;

import com.maycol.br.zooproject.entities.Manager;

import java.io.Serializable;

public class ManagerDTO implements Serializable {

  private Long id;
  private String name;

  public ManagerDTO() {
  }

  public ManagerDTO(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  public ManagerDTO(Manager entity) {
    this.id = entity.getId();
    this.name = entity.getName();
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
}