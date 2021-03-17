package com.example.demo.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
@Entity
public class Ability implements Serializable{
	@Id
	@GeneratedValue()
	private long abilityId;
	private long pokemonId;
	private long typeId;
	@NotEmpty
	private String abilityDesc;
}
