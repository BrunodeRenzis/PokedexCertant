package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Usuario;

public interface IUsuarioService {
	public List<Usuario> listarPokemon();
	public void guardar(Usuario usuario);
	public void eliminar(Usuario usuario);
	public Usuario encontrarPokemon(Usuario usuario);
}
