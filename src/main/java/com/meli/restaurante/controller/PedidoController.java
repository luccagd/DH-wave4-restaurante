package com.meli.restaurante.controller;

import com.meli.restaurante.dto.PedidoDTO;
import com.meli.restaurante.model.Pedido;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    private Pedido pedido = new Pedido();

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> getPedidosById(@PathVariable long id){
        return ResponseEntity.ok(pedido);
    }

    @GetMapping("/ping")
    public String pong(){
        return "pong";
    }

    @PostMapping
    public ResponseEntity<PedidoDTO> postPedido(@RequestBody PedidoDTO pedidoDTO, UriComponentsBuilder uriComponentsBuilder){
        URI uri = uriComponentsBuilder.path("/{id}").buildAndExpand(pedido.getId()).toUri();
        return ResponseEntity.created(uri).body(pedidoDTO);
    }
}
