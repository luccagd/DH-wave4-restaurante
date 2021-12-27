package com.meli.restaurante.repository;

import com.meli.restaurante.model.Pedido;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PedidoRepository {

    List<Pedido> listaPedido = new ArrayList();

    public List<Pedido> getAll() {
        return listaPedido;
    }

    public Pedido getById(long id) {
        return listaPedido.stream().filter(x -> x.getId() == id).findFirst().orElse(new Pedido());
    }

    public void post(Pedido pedido) {
        listaPedido.add(pedido);
    }
}
