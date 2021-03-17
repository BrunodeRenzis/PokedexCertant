package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Pokemon;

public interface IPokemonDAO extends CrudRepository<Pokemon, Long>{

}
