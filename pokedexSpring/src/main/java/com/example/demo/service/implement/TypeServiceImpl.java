package com.example.demo.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.ITypeDAO;
import com.example.demo.domain.Type;
import com.example.demo.service.ITypeService;

public class TypeServiceImpl implements ITypeService{

	@Autowired
	private ITypeDAO typeDAO;
	@Override
	@Transactional
	public List<Type> listarPokemon() {
		return (List<Type>)typeDAO.findAll();
	}

	@Override
	@Transactional
	public void guardar(Type type) {
		typeDAO.save(type);
		
	}

	@Override
	@Transactional
	public void eliminar(Type type) {
		typeDAO.delete(type);
	}

	@Override
	@Transactional(readOnly=true)
	public Type encontrarPokemon(Type type) {
		return typeDAO.findById(type.getPokemonTypeId()).orElse(null);
	}
	
}