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
	private IPokemonService personaService;
	@GetMapping("/")
	public String inicio(Model model,@AuthenticationPrincipal User user) {
		var listaPersonas = personaService.listarPokemon();
		log.info("Ejecutando el controlador Spring MVC");
		log.info("Usuario que ha hecho login: "+user);
		model.addAttribute("listaPersonas", listaPersonas);
		return "index";
	}
	
	@GetMapping("/agregar")
	public String agregar(Pokemon persona) {
		return "modificar";
	}
	
	@PostMapping("/guardar")
	public String guardar(@Valid Pokemon persona, Errors errores) {
		if(errores.hasErrors())
			return "modificar";
		
		personaService.guardar(persona);
		return "redirect:/";
	}
	
	@GetMapping("/editar/{id_persona}")
	public String editar(Pokemon persona,Model model) {
		persona = personaService.encontrarPokemon(persona);
		model.addAttribute("persona", persona);
		return "modificar";
	}
	
	@GetMapping("/eliminar/{id_persona}")
	public String eliminar(Pokemon persona) {
		personaService.eliminar(persona);
		return "redirect:/";
	}
}