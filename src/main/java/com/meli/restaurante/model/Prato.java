package com.meli.restaurante.model;

import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Prato {
    private Integer id;
    private BigDecimal preco;
    private String descricao;
    private Integer quantidade;
}