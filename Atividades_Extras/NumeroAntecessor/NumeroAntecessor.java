package Atividades_Extras.NumeroAntecessor;

import java.util.Scanner;

public class NumeroAntecessor {

	public static void main(String[] args) {

		// Crie um algoritmo que leia um n�mero inteiro e mostre seu antecessor
		
		Scanner scan = new Scanner(System.in);
		int numero;
		
		// Recebendo o n�mero do usu�rio
		System.out.print("Informe um n�mero: ");
		numero = scan.nextInt();
		
		scan.close();
		
		System.out.println("\nO antecessor do n�mero informado (" + numero + ") �: " + (numero-1));

	}

}
