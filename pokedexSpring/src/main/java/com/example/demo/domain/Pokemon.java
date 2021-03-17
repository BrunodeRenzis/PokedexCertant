package com.example.demo.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
@Entity
public class Pokemon implements Serializable {
	private static final long serialVersionUID= 1L;
	@Id
	@GeneratedValue()
	private long pokemonId;
	@NotEmpty
	private String pokemonName;
	
	private int pokemonType;

	private int pokemonLevelFound;

	private int userId;
}
