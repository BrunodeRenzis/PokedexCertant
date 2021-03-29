package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.domain.Usuario;
public interface IUsuarioDAO extends JpaRepository<Usuario,Long>{
	public Usuario findByUsername(String username);
	Usuario findByUserId(long userId); 
}
