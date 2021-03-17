package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.PokemonType;

public interface IPokemonTypeDAO extends CrudRepository<PokemonType,Long> {

}
