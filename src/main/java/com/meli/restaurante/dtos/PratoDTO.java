package com.meli.restaurante.dtos;

import java.math.BigDecimal;

import com.meli.restaurante.entities.Prato;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor

public class PratoDTO {

	private BigDecimal preco;
	private String descricao;
	private Integer quantidade;

	public static Prato toEntity(PratoDTO dto) {
		Prato p = new Prato();
		p.setDescricao(dto.getDescricao());
		p.setPreco(dto.getPreco());
		p.setQuantidade(dto.getQuantidade());
		
		return p;
	}
}
