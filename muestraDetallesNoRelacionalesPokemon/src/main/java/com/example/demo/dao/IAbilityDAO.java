package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Ability;

public interface IAbilityDAO extends CrudRepository<Ability,Long> {
	@Query(value="SELECT pokemon.pokemonName, ability.abilityDesc, type.typeDescription FROM pokemon INNER JOIN ability ON pokemon.pokemonId=? AND pokemon.pokemonId=ability.pokemonId INNER JOIN pokemon.type ON ability.typeId=type.typeId", nativeQuery=true)
	List<Ability> habilidadesDeUnPokemon(long pokemonId);
}
