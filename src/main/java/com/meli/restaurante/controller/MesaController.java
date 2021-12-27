package com.meli.restaurante.controller;

import com.meli.restaurante.dto.MesaDTO;
import com.meli.restaurante.model.Mesa;
import com.meli.restaurante.service.MesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mesa")
public class MesaController {

    @Autowired
    private MesaService service;

    @GetMapping("/{id}")
    public ResponseEntity<MesaDTO> findById(@PathVariable Integer id) {
        Mesa mesa = service.findById(id);
        if (mesa == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(MesaDTO.toDTO(mesa));
    }

}
