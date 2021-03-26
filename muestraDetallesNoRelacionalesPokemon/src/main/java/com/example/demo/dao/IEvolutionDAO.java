package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Evolution;

public interface IEvolutionDAO extends JpaRepository<Evolution,Long> {
	
	List<Evolution> findByPokemonId(long pokemonId);
	
	@Query(value="SELECT evolutionName,evolutionLevel FROM evolution WHERE pokemonId=?", nativeQuery=true)
	List<Evolution> evolucionesDeUnPokemon(long pokemonId);
	
}
