package Capitulo_13;

import java.util.Random;

public class MegaSenaUtilitario {
	
	// M�todo utilit�rio
	public static int sortearNumero() {
		Random sorteador = new Random();
		int numero = sorteador.nextInt();
		return numero;
	}

}