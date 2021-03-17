package com.example.demo.domain;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class PokemonType implements Serializable{
	private long pokemonId;
	private long typeId;
}
