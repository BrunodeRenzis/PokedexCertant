package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.PokemonType;

public interface IPokemonTypeService {
	public List<PokemonType> listarPokemon();
	public void guardar(PokemonType pokemonType);
	public void eliminar(PokemonType pokemonType);
	public PokemonType encontrarPokemonTipoId(PokemonType pokemonType);
	public PokemonType encontrarPokemonId(PokemonType pokemonType);
}
