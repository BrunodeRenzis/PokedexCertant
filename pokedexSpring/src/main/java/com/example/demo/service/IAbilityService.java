package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Ability;

public interface IAbilityService {
	public List<Ability> listarHabilidades();
	public void guardar(Ability ability);
	public void eliminar(Ability ability);
	public Ability encontrarHabilidad(Ability ability);
}
