package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Type;

public interface ITypeService {
	public List<Type> listarPokemon();
	public void guardar(Type type);
	public void eliminar(Type type);
	public Type encontrarPokemon(Type type);
	public List <Type> tiposDeUnPokemon(long pokemonId);
}
