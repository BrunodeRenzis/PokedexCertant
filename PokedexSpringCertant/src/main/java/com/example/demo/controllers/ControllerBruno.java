package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.implement.EvolutionServiceImpl;
import com.example.demo.service.implement.PokemonServiceImpl;
@RestController
@RequestMapping("/")
public class ControllerBruno {
	
	@Autowired
	EvolutionServiceImpl unaEvolucion;
	
	@Autowired
	PokemonServiceImpl pokemonServiceImpl;
	
	public ControllerBruno(){
		
	}
	
	@GetMapping(value="/bruno")
	public void probarEvolucion() {
		pokemonServiceImpl.encontrarPokemonCompleto(null);
	}
}
