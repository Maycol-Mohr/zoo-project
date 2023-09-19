package com.maycol.br.zooproject.resources;

import com.maycol.br.zooproject.dto.ManagerDTO;
import com.maycol.br.zooproject.entities.Manager;
import com.maycol.br.zooproject.services.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

  @GetMapping(value = "/{id}")
  public ResponseEntity<ManagerDTO> findById(@PathVariable Long id) {
    ManagerDTO dto = service.findById(id);
    return ResponseEntity.ok().body(dto);
  }

  @PostMapping
  public ResponseEntity<ManagerDTO> insert(@RequestBody ManagerDTO dto) {
    dto = service.insert(dto);
    URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
            .buildAndExpand(dto.getId()).toUri();
    return ResponseEntity.created(uri).body(dto);
  }
}
