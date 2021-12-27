package com.meli.restaurante.service;

import com.meli.restaurante.model.Prato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meli.restaurante.repository.PratoRepository;

@Service
public class PratoService {
	
	@Autowired
	private PratoRepository pratoRepository;
	
	public Prato cadastra (Prato prato)
	{
		return pratoRepository.cadastra(prato);
	}
}
