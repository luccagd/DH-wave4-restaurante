package com.meli.restaurante.repository;

import java.util.ArrayList;
import java.util.List;

import com.meli.restaurante.model.Prato;
import org.springframework.stereotype.Component;

@Component
public class PratoRepository {

	private List<Prato> pratos = new ArrayList<>();

	public Prato cadastra(Prato prato)
	{
		pratos.add(prato);
		return prato;
	}
}
