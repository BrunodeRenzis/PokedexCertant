 package com.example.demo.controllers;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.domain.Pokemon;
import com.example.demo.service.IPokemonService;
import com.example.demo.service.implement.PokemonServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ControladorInicio {
	@Autowired
	private PokemonServiceImpl pokemonService;
	@GetMapping("/")
	public String inicio(Model model,@AuthenticationPrincipal User user) {
		var listaPokemon = pokemonService.listarPokemon();
		log.info("Ejecutando el controlador Spring MVC");
		log.info("Usuario que ha hecho login: "+user);
		model.addAttribute("listaPokemon", listaPokemon);
		return "index";
	}
	
	@GetMapping("/agregar")
	public String agregar(Pokemon pokemon) {
		return "modificar";
	}
	
	@PostMapping("/guardar")
	public String guardar(@Valid Pokemon pokemon, Errors errores) {
		if(errores.hasErrors())
			return "modificar";
		
		pokemonService.guardar(pokemon);
		return "redirect:/";
	}
	
	@GetMapping("/editar/{pokemonId}")
	public String editar(Pokemon pokemon,Model model) {
		pokemon = pokemonService.encontrarPokemon(pokemon);
		model.addAttribute("pokemon", pokemon);
		return "modificar";
	}
	
	@GetMapping("/eliminar/{pokemonId}")
	public String eliminar(Pokemon pokemon) {
		pokemonService.eliminar(pokemon);
		return "redirect:/";
	}
	
	@GetMapping("/ver/{pokemonId}")
	public String ver(Pokemon pokemon,Model model) {
		pokemon=pokemonService.encontrarPokemonCompleto(pokemon);
		model.addAttribute("pokemon",pokemon);
		return "ver";
	}
}