package Atividades_Extras.Media15NumerosComFor;

import java.util.Scanner;

public class Media15NumreosComFor {

	public static void main(String[] args) {

		// Escreva um algoritmo que leia 15 n�meros do usu�rio. Ao final exiba a m�dia dos 15 n�meros. Utilize o comando de repeti��o Para (For).
		
		Scanner scan = new Scanner(System.in);
		double soma = 0;
		
		// Recebendo os n�meros do usu�rio
		for (int i = 0; i < 15; i++) {
		
			System.out.print("Digite o " + i + "� n�mero: ");
			soma = soma + scan.nextDouble();
		}
		
		System.out.print("A m�dia de todos os n�meros informados = " + (soma / 10));
			
			scan.close();

	}

}
