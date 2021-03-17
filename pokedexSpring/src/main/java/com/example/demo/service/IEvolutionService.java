package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Evolution;

public interface IEvolutionService {
	public List<Evolution> listarPokemon();
	public void guardar(Evolution evolucion);
	public void eliminar(Evolution evolucion);
	public Evolution encontrarPokemon(Evolution evolucion);
}
