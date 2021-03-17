package com.example.demo.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import lombok.Data;
@Data
@Entity
public class Evolution implements Serializable{
	@Id
	@GeneratedValue()
	private long evolutionId;
	private long pokemonId;
	@NotEmpty
	private String pokemonName;
	@NotEmpty
	private String pokemonType;
	private int evolutionLevel;
}
