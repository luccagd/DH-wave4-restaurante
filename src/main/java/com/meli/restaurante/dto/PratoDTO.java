package com.meli.restaurante.dto;

import java.math.BigDecimal;

import com.meli.restaurante.model.Mesa;
import com.meli.restaurante.model.Prato;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
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

	public static PratoDTO toDTO(Prato prato) {
		PratoDTO dto = new PratoDTO();
		dto.setDescricao(prato.getDescricao());
		dto.setPreco(prato.getPreco());
		dto.setQuantidade(prato.getQuantidade());

		return dto;
	}


}
