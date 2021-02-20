package com.example.microserviceexpedition.model.repository;

import com.example.microserviceexpedition.model.entity.Expedition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpeditionRepository extends JpaRepository<Expedition, Long> {

    List<Expedition> findByState(String state);

    Expedition findById(long id);
}