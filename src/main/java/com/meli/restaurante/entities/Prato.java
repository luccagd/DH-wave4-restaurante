package com.meli.restaurante.entities;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
