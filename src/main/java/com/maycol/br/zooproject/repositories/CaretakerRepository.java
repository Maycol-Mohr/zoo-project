package com.maycol.br.zooproject.repositories;

import com.maycol.br.zooproject.entities.Caretaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaretakerRepository extends JpaRepository<Caretaker, Long> {
}
