package com.meli.restaurante.controller;

import com.meli.restaurante.model.Mesa;
import com.meli.restaurante.model.Prato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meli.restaurante.dto.PratoDTO;
import com.meli.restaurante.service.PratoService;

@RestController
@RequestMapping("/prato")
public class PratoController {
	
	@Autowired
	private PratoService pratoService;
	
	@PostMapping
	public ResponseEntity<Prato> cadastrar(@RequestBody PratoDTO prato)
	{
		Prato p = pratoService.cadastra(PratoDTO.toEntity(prato));
		return new ResponseEntity<Prato>(p, HttpStatus.CREATED);
	}

}
