package com.example.demo.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
@Entity
@Table(name = "pokemon")
public class Pokemon implements Serializable {

	public Pokemon() {

	}
	
	

	public Pokemon(long pokemonId, @NotEmpty String pokemonName, int pokemonLevelFound, int pokemonTypeId, int userId) {
		super();
		this.pokemonId = pokemonId;
		this.pokemonName = pokemonName;
		this.pokemonLevelFound = pokemonLevelFound;
		this.pokemonTypeId = pokemonTypeId;
		this.userId = userId;
	}



	/*
	public Pokemon(@NotEmpty String pokemonName, int pokemonLevelFound, int pokemonTypeId, int userId,
			List<Evolution> evolutions, List<Ability> abilities, List<Type> types, Usuario usuario) {
		super();
		this.pokemonName = pokemonName;
		this.pokemonLevelFound = pokemonLevelFound;
		this.pokemonTypeId = pokemonTypeId;
		this.userId = userId;
		this.types = types;
		this.evolutions = evolutions;
		this.abilities = abilities;
		this.usuario = usuario;
	}

	public Pokemon(long pokemonId, @NotEmpty String pokemonName, int pokemonLevelFound, int pokemonTypeId, int userId,
			List<Ability> abilities, List<Type> types, Usuario usuario) {
		super();
		this.pokemonId = pokemonId;
		this.pokemonName = pokemonName;
		this.pokemonLevelFound = pokemonLevelFound;
		this.pokemonTypeId = pokemonTypeId;
		this.userId = userId;
		this.types = types;
		this.abilities = abilities;
		this.usuario = usuario;
	}

	public Pokemon(long pokemonId, @NotEmpty String pokemonName, int pokemonLevelFound, int pokemonTypeId, int userId,
			List<Evolution> evolutions, List<Ability> abilities, List<Type> types, Usuario usuario) {
		super();
		this.pokemonId = pokemonId;
		this.pokemonName = pokemonName;
		this.pokemonLevelFound = pokemonLevelFound;
		this.pokemonTypeId = pokemonTypeId;
		this.userId = userId;
		this.types = types;
		this.evolutions = evolutions;
		this.abilities = abilities;
		this.usuario = usuario;
	}
	*/

	private static final long serialVersionUID = 3L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pokemonId")
	private long pokemonId;
	@NotEmpty
	@Column(name = "pokemonName")
	private String pokemonName;

	@Column(name = "pokemonLevelFound")
	private int pokemonLevelFound;

	@Column(name = "pokemonTypeId")
	private int pokemonTypeId;

	@Column(name = "userId")
	private int userId;

	@Transient
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="pokemonId")
	private List<Evolution> evolutions;

	@Transient
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="pokemonId")
	private List<Ability> abilities;

	@Transient
	@ManyToMany()
	private List<Type> types;


	/*
		@OneToOne
		@JoinColumn(name = "userId")
		private Usuario usuario;
	*/
}
