package com.example.demo.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.IPokemonTypeDAO;
import com.example.demo.domain.PokemonType;
import com.example.demo.service.IPokemonTypeService;

public class PokemonTypeServiceImpl implements IPokemonTypeService{

	@Autowired
	private IPokemonTypeDAO pokemonTypeDAO;
	
	@Override
	@Transactional
	public List<PokemonType> listarPokemon() {
		return (List<PokemonType>)pokemonTypeDAO.findAll();
	}

	@Override
	@Transactional
	public void guardar(PokemonType pokemonType) {
		pokemonTypeDAO.save(pokemonType);
	}

	@Override
	@Transactional
	public void eliminar(PokemonType pokemonType) {
		pokemonTypeDAO.delete(pokemonType);
		
	}

	@Override
	@Transactional
	public PokemonType encontrarPokemonTipoId(PokemonType pokemonType) {
		return pokemonTypeDAO.findById(pokemonType.getTypeId()).orElse(null);
	}
	
	@Override
	@Transactional
	public PokemonType encontrarPokemonId(PokemonType pokemonType) {
		return pokemonTypeDAO.findById(pokemonType.getPokemonId()).orElse(null);
	}

}
