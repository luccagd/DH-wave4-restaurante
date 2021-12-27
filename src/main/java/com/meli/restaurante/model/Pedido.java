package com.meli.restaurante.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Data
public class Pedido {
    private long id;
    private Mesa mesa;
    private List<Prato> listaDePratos = new ArrayList();
}
