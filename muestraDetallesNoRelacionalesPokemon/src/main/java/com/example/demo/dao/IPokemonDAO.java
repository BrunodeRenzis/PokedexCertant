package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Pokemon;

public interface IPokemonDAO extends CrudRepository<Pokemon, Long>{
	//public List <Pokemon> findByUserId(int userId);
}
