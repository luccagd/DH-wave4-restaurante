package com.meli.restaurante.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meli.restaurante.dtos.PratoDTO;
import com.meli.restaurante.entities.Prato;
import com.meli.restaurante.services.PratoService;

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
