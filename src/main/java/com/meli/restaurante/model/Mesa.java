package com.meli.restaurante.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private static Integer count = 0;

    private Integer id;

    private List<Pedido> pedidos;

    private BigDecimal valorTotalConsumido;

    public Mesa() {
        count++;

        this.id = count;
        this.pedidos = new ArrayList<>();
        this.valorTotalConsumido = new BigDecimal(0.0);
    }

    public Integer getId() {
        return id;
    }

    public List<Pedido> getPedidos() {
        return new ArrayList<>(pedidos);
    }

    public BigDecimal getValorTotalConsumido() {
        return valorTotalConsumido;
    }

}
