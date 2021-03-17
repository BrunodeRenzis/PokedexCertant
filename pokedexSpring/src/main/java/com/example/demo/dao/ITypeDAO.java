package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.domain.Type;

public interface ITypeDAO extends CrudRepository<Type,Long> {

}
