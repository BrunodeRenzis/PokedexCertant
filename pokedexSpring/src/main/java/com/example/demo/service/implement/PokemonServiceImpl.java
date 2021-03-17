package com.example.demo.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.IPokemonDAO;
import com.example.demo.domain.Pokemon;
import com.example.demo.service.IPokemonService;

@Service
public class PokemonServiceImpl implements IPokemonService{

	@Autowired
	private IPokemonDAO pokemonDAO;
	
	@Override
	@Transactional(readOnly=true)
	public List<Pokemon> listarPokemon() {
		return (List<Pokemon>) pokemonDAO.findAll();
	}

	@Override
	@Transactional
	public void guardar(Pokemon pokemon) {
		pokemonDAO.save(pokemon);
	}

	@Override
	@Transactional
	public void eliminar(Pokemon pokemon) {
		pokemonDAO.delete(pokemon);
	}

	@Override
	@Transactional(readOnly=true)
	public Pokemon encontrarPokemon(Pokemon pokemon) {
		return pokemonDAO.findById(pokemon.getPokemonId()).orElse(null);
	}

}
