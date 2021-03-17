package com.example.demo.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
public class Type implements Serializable{
	@Id
	@GeneratedValue()
	private long pokemonTypeId;
	
	@NotNull
	private String typeDescription;
}
