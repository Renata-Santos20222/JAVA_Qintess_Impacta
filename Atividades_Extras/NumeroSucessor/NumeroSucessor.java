package Atividades_Extras.NumeroSucessor;

import java.util.Scanner;

public class NumeroSucessor {

	public static void main(String[] args) {

		// Crie um algoritmo que leia um n�mero inteiro e mostre seu sucessor
		
		Scanner scan = new Scanner(System.in);
		int numero;
		
		// Recebendo o n�mero do usu�rio
		System.out.print("Informe um n�mero: ");
		numero = scan.nextInt();
		
		scan.close();
		
		System.out.println("\nO sucessor do n�mero informado (" + numero + ") �: " + (numero+1));

	}

}
