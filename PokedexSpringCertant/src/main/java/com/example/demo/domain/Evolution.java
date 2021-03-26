package com.example.demo.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
@Entity
@Table(name = "evolution")
public class Evolution implements Serializable {
	private static final long serialVersionUID = 2L;

	public Evolution() {

	}

	public Evolution(long evolutionId, long pokemonId, @NotEmpty String evolutionName, int pokemonTypeId,
			int evolutionLevel /* ,Pokemon pokemon */) {
		super();
		this.evolutionId = evolutionId;
		this.pokemonId = pokemonId;
		this.evolutionName = evolutionName;
		this.pokemonTypeId = pokemonTypeId;
		this.evolutionLevel = evolutionLevel;
		// this.pokemon = pokemon;
	}

	@Id
	@GeneratedValue()
	@Column(name = "evolutionId")
	private long evolutionId;

	@Column(name = "pokemonId")
	private long pokemonId;
	@NotEmpty
	@Column(name = "evolutionName")
	private String evolutionName;
	@NotEmpty
	@Column(name = "pokemonTypeId")
	private int pokemonTypeId;
	@Column(name = "evolutionLevel")
	private int evolutionLevel;
}
