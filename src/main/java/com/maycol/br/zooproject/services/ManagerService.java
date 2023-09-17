package com.maycol.br.zooproject.services;

import com.maycol.br.zooproject.dto.ManagerDTO;
import com.maycol.br.zooproject.entities.Manager;
import com.maycol.br.zooproject.repositories.ManagerRepository;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ManagerService {

  @Autowired
  private ManagerRepository repository;

  @Transactional(readOnly = true)
  public List<ManagerDTO> findAll() {
    List<Manager> list = repository.findAll();
    return list.stream().map(x -> new ManagerDTO(x)).collect(Collectors.toList());
  }
}
