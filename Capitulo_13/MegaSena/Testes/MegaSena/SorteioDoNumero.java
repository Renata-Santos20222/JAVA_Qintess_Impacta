package Capitulo_13.MegaSena.Testes.MegaSena;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Capitulo_13.MegaSena.MegaSenaUtilitario;

	/*
		� a annotation mais b�sica do JUnit, que serve para marcar m�todos que ser�o executados como testes.
	*/

class SorteioDoNumero {

	@Test
	// testando se o n�mero � maior do que ZERO
	void geracaoDeNumeroPositivo() {
		
		int numeroMaiorQueZero = MegaSenaUtilitario.sortearNumero();
		
		// Usando a instru��o ASSERTION
		assertTrue(numeroMaiorQueZero > 0);
	}
	
	@Test
	// testando se o n�mero � menor ou igual a 60
	void geracaoDeNumeroMenorOuIgualASessenta() {
		
		int numeroMaiorQueZero = MegaSenaUtilitario.sortearNumero();
		
		// Usando a instru��o ASSERTION
		assertTrue(numeroMaiorQueZero <= 60);
	}

}