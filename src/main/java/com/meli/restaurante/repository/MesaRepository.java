package com.meli.restaurante.repository;

import com.meli.restaurante.model.Mesa;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MesaRepository {

    private static List<Mesa> mesas = new ArrayList<>();

    public Mesa findById(Integer id) {
        for (Mesa mesa : mesas) {
            if (id == mesa.getId()) {
                return mesa;
            }
        }

        return null;
    }

    public void criarMesa() {
        mesas.add(new Mesa());
    }
}
