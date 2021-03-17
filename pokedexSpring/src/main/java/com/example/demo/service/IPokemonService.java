package com.example.demo.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Pokemon;

public interface IPokemonService{
	public List<Pokemon> listarPokemon();
	public void guardar(Pokemon pokemon);
	public void eliminar(Pokemon pokemon);
	public Pokemon encontrarPokemon(Pokemon pokemon);
}
