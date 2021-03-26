package com.example.demo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
@Entity
@Table(name = "ability")
public class Ability implements Serializable {
	private static final long serialVersionUID = 1L;

	public Ability() {

	}

	public Ability(long abilityId, long pokemonId, long typeId, @NotEmpty String abilityDesc) {
		super();
		this.abilityId = abilityId;
		this.pokemonId = pokemonId;
		this.typeId = typeId;
		this.abilityDesc = abilityDesc;		
	}

	@Id
	@GeneratedValue()
	@Column(name = "abilityId")
	private long abilityId;
	@Column(name = "pokemonId")
	private long pokemonId;
	@Column(name = "typeId")
	private long typeId;
	@NotEmpty
	@Column(name = "abilityDesc")
	private String abilityDesc;
	
	/*ACÁ EMPIEZA LA PARTE EN LA QUE SE CAGA TODO*/
	
	//@ManyToOne(cascade=CascadeType.ALL)
	//private Pokemon unPokemon = new Pokemon();
}
