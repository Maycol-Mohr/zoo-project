package com.maycol.br.zooproject.services;

import com.maycol.br.zooproject.dto.ManagerDTO;
import com.maycol.br.zooproject.entities.Manager;
import com.maycol.br.zooproject.repositories.ManagerRepository;
import com.maycol.br.zooproject.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
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

  @Transactional(readOnly = true)
  public ManagerDTO findById(Long id) {
    Optional<Manager> obj = repository.findById(id);
    Manager entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity nor found"));
    return new ManagerDTO(entity);
  }

  @Transactional
  public ManagerDTO insert(ManagerDTO dto) {
    Manager entity = new Manager();
    entity.setName(dto.getName());
    entity = repository.save(entity);
    return new ManagerDTO(entity);
  }

  @Transactional
  public ManagerDTO update(Long id, ManagerDTO dto) {
    try {
      Manager entity = repository.getReferenceById(id);
      entity.setName(dto.getName());
      entity = repository.save(entity);
      return new ManagerDTO(entity);
    } catch (EntityNotFoundException e) {
      throw new ResourceNotFoundException("id not found" + id);
    }
  }
}
