package com.example.demo.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.IEvolutionDAO;
import com.example.demo.domain.Ability;
import com.example.demo.domain.Evolution;
import com.example.demo.service.IEvolutionService;

public class EvolutionServiceImpl implements IEvolutionService{

	@Autowired
	private IEvolutionDAO evolutionDAO;
	
	@Override
	@Transactional
	public List<Evolution> listarPokemon() {
		return (List<Evolution>)evolutionDAO.findAll();
	}

	@Override
	@Transactional
	public void guardar(Evolution evolution) {
		evolutionDAO.save(evolution);
		
	}

	@Override
	@Transactional
	public void eliminar(Evolution evolution) {
		evolutionDAO.delete(evolution);
		
	}

	@Override
	@Transactional
	public Evolution encontrarPokemon(Evolution evolution) {
		return evolutionDAO.findById(evolution.getEvolutionId()).orElse(null);
	}

}
