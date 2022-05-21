package Atividades_Extras.SomaAteUsuarioDigitarNumeroNegativo;

import java.util.Scanner;

public class SomaAteUsuarioDigitarNumeroNegativo {

	public static void main(String[] args) {
		
		/*
		  Escreva um algoritmo que leia uma sequ�ncia de n�meros do usu�rio e realize a soma desses n�meros.
		  Encerre a execu��o quando um n�mero negativo for digitado. 
		*/
		
		System.out.println("PARA ENCERRAR ESTA OPERA��O INFORME UM N�MERO NEGATIVO");

		Scanner scan = new Scanner(System.in);
		
		int x = 0;
		int soma = 0;
		
		// Recebendo os n�meros do usu�rio
		
		do {
			
			System.out.print("Digite o " + (x+1) + "� n�mero: ");
			x = scan.nextInt();
			
			// Efetuando a soma
			if ( x > 0) {
				soma = soma + x;
			}

		} while (x > 0);
		
		System.out.println("A soma dos n�meros informados = " + soma + ".");
		
		scan.close();

	}

}
