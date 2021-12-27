package com.meli.restaurante.service;

import com.meli.restaurante.model.Mesa;
import com.meli.restaurante.repository.MesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MesaService {

    @Autowired
    MesaRepository repository;

    public Mesa findById(Integer id) {
        return repository.findById(id);
    }

    public void criarMesa() {
        repository.criarMesa();
    }
}
