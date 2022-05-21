package Atividades_Extras.ImprimindoNumerosImpares;

import java.util.Scanner;

public class ImprimindoNumerosImpares {

	public static void main(String[] args) {

		// Escreva um algoritmo que leia um n�mero qualquer do usu�rio e escreva os �mpares existentes entre 1 e o n�mero informado pelo usu�rio.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int numero = scan.nextInt();
		scan.close();
		
		System.out.print("Os n�meros �mpares menores do que " + numero + " s�o -> ");
		for (int i = 1; i < numero; i++) {
			
			if (i % 2 != 0) {
				System.out.print(i);

				if (i < numero-1) {
					System.out.print(", ");
				} 
				else {
					System.out.print(".");
				}
			}
		}

	}
}
