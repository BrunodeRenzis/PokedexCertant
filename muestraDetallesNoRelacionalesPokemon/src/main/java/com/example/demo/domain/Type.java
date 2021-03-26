package com.example.demo.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "type")
public class Type implements Serializable {
	
	public Type() {

	}

	public Type(long typeId, @NotNull String typeDescription, long pokemonId) {
		super();
		this.typeId = typeId;
		this.typeDescription = typeDescription;
		
	}

	private static final long serialVersionUID = 5L;
	@Id
	@GeneratedValue()
	@Column(name = "typeId")
	private long typeId;

	@NotNull
	@Column(name = "typeDescription")
	private String typeDescription;

}
