package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Evolution;
import com.example.demo.domain.Type;

public interface ITypeDAO extends CrudRepository<Type,Long> {

	List<Type> findByPokemonTypeId(long typeId);
	/*@Query(value="SELECT typeDescription FROM pokemonType INNER JOIN type ON pokemonType.type_id=type.typeId WHERE pokemon_id=?", nativeQuery=true)
	List<Type> tiposDeUnPokemon(long pokemonId);*/
}
