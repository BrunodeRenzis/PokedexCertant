package com.example.demo.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.IAbilityDAO;
import com.example.demo.domain.Ability;
import com.example.demo.service.IAbilityService;

public class AbilityServiceImpl implements IAbilityService{

	@Autowired
	private IAbilityDAO abilityDAO;
	
	@Override
	@Transactional
	public List<Ability> listarHabilidades() {
		return (List<Ability>)abilityDAO.findAll();
	}

	@Override
	@Transactional
	public void guardar(Ability ability) {
		abilityDAO.save(ability);
		
	}

	@Override
	@Transactional
	public void eliminar(Ability ability) {
		abilityDAO.delete(ability);
	}

	@Override
	@Transactional
	public Ability encontrarHabilidad(Ability ability) {
		return abilityDAO.findById(ability.getAbilityId()).orElse(null);
	}

}
