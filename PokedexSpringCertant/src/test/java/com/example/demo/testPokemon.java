package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.demo.domain.Pokemon;

class testPokemon {

	@Test
	void test() {
		Pokemon unPokemon=new Pokemon();
		assertEquals(5,1,"Eevee");
	}

}
