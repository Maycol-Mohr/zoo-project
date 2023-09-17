package com.maycol.br.zooproject.services;

import com.maycol.br.zooproject.entities.Manager;
import com.maycol.br.zooproject.repositories.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {

  @Autowired
  private ManagerRepository repository;

  public List<Manager> findAll() {
    return repository.findAll();
  }
}
