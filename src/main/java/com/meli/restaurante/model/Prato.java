package com.meli.restaurante.model;

import lombok.*;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@Builder
public class Prato {
    private static Integer count = 0;

    private Integer id;
    private BigDecimal preco;
    private String descricao;
    private Integer quantidade;

    public Prato() {
        count++;

        this.id = count;
    }
}