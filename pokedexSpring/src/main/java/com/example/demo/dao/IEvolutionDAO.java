package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Evolution;

public interface IEvolutionDAO extends CrudRepository<Evolution,Long> {

}
