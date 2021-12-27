package com.meli.restaurante.dto;

import com.meli.restaurante.model.Mesa;
import com.meli.restaurante.model.Pedido;
import com.meli.restaurante.model.Prato;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@ToString
public class PedidoDTO {
    private long id;
    private Mesa mesa;
    private List<Prato> listaDePratos = new ArrayList();

    public static Pedido converte(PedidoDTO dto){
        Pedido pedido = Pedido.builder()
                .id(dto.getId())
                .mesa(dto.getMesa())
                .listaDePratos(dto.getListaDePratos())
                .build();
        return pedido;
    }

    public static PedidoDTO converte(Pedido pedido){
        PedidoDTO dto = PedidoDTO.builder()
                .id(pedido.getId())
                .mesa(pedido.getMesa())
                .listaDePratos(pedido.getListaDePratos())
                .build();
        return dto;
    }

    public static List<PedidoDTO> converte(List<Pedido> usuarios){
        return usuarios.stream().map(PedidoDTO::converte).collect(Collectors.toList());
    }
}
