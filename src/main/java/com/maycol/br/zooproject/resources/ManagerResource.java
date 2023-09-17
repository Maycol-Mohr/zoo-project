package com.maycol.br.zooproject.resources;

import com.maycol.br.zooproject.dto.ManagerDTO;
import com.maycol.br.zooproject.entities.Manager;
import com.maycol.br.zooproject.services.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/managers")
public class ManagerResource {

  @Autowired
  private ManagerService service;

  @GetMapping
  public ResponseEntity<List<ManagerDTO>> findAll() {
    List<ManagerDTO> list = service.findAll();
    return ResponseEntity.ok().body(list);
  }
}
