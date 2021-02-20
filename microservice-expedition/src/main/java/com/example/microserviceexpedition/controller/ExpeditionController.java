package com.example.microserviceexpedition.controller;

import com.example.microserviceexpedition.model.entity.Expedition;
import com.example.microserviceexpedition.model.repository.ExpeditionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExpeditionController {

    @Autowired
    private ExpeditionRepository expeditionRepository;

    @GetMapping("/expeditions")
    List<Expedition> all() {
        return expeditionRepository.findAll();
    }

    @GetMapping("/expeditions/{commandId}")
    Expedition getByCommandId(@PathVariable Long commandId) {
        return expeditionRepository.getByCommandId(commandId);
    }

    @PutMapping("/expeditions/{id}")
    Expedition update(@RequestBody Expedition expedition, @PathVariable Long id) {
        return expeditionRepository.findById(id)
                .map(e -> {
                    e.commandId = expedition.commandId;
                    e.state = expedition.state;
                    return expeditionRepository.save(e);
                })
                .orElseGet(() -> {
                    expedition.id = id;
                    return expeditionRepository.save(expedition);
                });
    }
}
