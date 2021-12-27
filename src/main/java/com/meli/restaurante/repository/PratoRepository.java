package com.meli.restaurante.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.meli.restaurante.entities.Prato;

@Component
public class PratoRepository {

	private List<Prato> pratos = new ArrayList<>();
	
	
	public Prato cadastra(Prato prato)
	{
		pratos.add(prato);
		return prato;
	}
	
	
}
