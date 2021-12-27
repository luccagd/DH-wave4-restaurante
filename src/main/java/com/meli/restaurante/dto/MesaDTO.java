package com.meli.restaurante.dto;

import com.meli.restaurante.model.Mesa;
import com.meli.restaurante.model.Pedido;

import java.math.BigDecimal;
import java.util.List;

public class MesaDTO {
    private List<Pedido> pedidos;

    private BigDecimal valorTotalConsumido;

    public MesaDTO(List<Pedido> pedidos, BigDecimal valorTotalConsumido) {
        this.pedidos = pedidos;
        this.valorTotalConsumido = valorTotalConsumido;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public BigDecimal getValorTotalConsumido() {
        return valorTotalConsumido;
    }

    public static MesaDTO toDTO(Mesa mesa) {
        return new MesaDTO(mesa.getPedidos(), mesa.getValorTotalConsumido());
    }
}
