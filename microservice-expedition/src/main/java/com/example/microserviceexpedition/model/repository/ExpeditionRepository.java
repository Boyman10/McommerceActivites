package com.example.microserviceexpedition.model.repository;

import com.example.microserviceexpedition.model.entity.Expedition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpeditionRepository extends JpaRepository<Expedition, Long> {
    Expedition getByCommandId(long id);
}