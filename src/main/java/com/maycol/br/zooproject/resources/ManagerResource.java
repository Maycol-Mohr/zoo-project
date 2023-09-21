package com.maycol.br.zooproject.resources;

import com.maycol.br.zooproject.dto.ManagerDTO;
import com.maycol.br.zooproject.entities.Manager;
import com.maycol.br.zooproject.services.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
  public ResponseEntity<Page<ManagerDTO>> findAll(Pageable pageable) {
    Page<ManagerDTO> list = service.findAllPaged(pageable);
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

  @PutMapping(value = "/{id}")
  public ResponseEntity<ManagerDTO> update(@PathVariable Long id, @RequestBody ManagerDTO dto) {
    dto = service.update(id, dto);
    return ResponseEntity.ok().body(dto);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id) {
    service.delete(id);
    return ResponseEntity.noContent().build();
  }
}
