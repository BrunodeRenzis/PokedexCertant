package com.example.demo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "type")
public class Type implements Serializable {
	
	public Type() {

	}

	public Type(long typeId, @NotNull String typeDescription, long pokemonTypeId) {
		super();
		this.pokemonTypeId = pokemonTypeId;
		this.typeDescription = typeDescription;
		
	}

	private static final long serialVersionUID = 5L;
	@Id
	@GeneratedValue()
	@Column(name = "pokemonTypeId")
	private long pokemonTypeId;

	@NotNull
	@Column(name = "typeDescription")
	private String typeDescription;
	
	@ManyToMany(mappedBy="types",fetch=FetchType.EAGER)
	
	private List<Pokemon> pokemonList = new ArrayList<Pokemon>();
	

}
