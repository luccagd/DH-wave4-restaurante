package com.meli.restaurante.service;

import com.meli.restaurante.dto.PedidoDTO;
import com.meli.restaurante.model.Mesa;
import com.meli.restaurante.model.Pedido;
import com.meli.restaurante.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public void postPedido(PedidoDTO dto){
        Pedido pedido = new Pedido();
        Mesa mesa = new Mesa();
    }
}
