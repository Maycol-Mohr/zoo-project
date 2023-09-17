package com.maycol.br.zooproject.resources;

import com.maycol.br.zooproject.entities.Manager;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/managers")
public class ManagerResource {

  @GetMapping
  public ResponseEntity<List<Manager>> findAll() {
    List<Manager> list = new ArrayList<>();
    list.add(new Manager(1L, "Michael"));
    list.add(new Manager(2L, "Pedro"));
    return ResponseEntity.ok().body(list);
  }
}
