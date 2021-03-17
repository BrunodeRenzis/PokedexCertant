package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Ability;

public interface IAbilityDAO extends CrudRepository<Ability,Long> {

}
