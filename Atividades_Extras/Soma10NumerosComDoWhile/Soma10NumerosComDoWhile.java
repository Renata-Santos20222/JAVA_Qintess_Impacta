package Atividades_Extras.Soma10NumerosComDoWhile;

import java.util.Scanner;

public class Soma10NumerosComDoWhile {

	public static void main(String[] args) {

		// Escreva um algoritmo que leia 10 n�meros do usu�rio e calcule a soma desses n�meros. Utilize o comando de repeti��o Enquanto (Do While).
		
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int soma = 0;
		
		// Recebendo os n�meros do usu�rio
		do {

			System.out.print("Digite o " + (i+1) + "� n�mero: ");
			soma = soma + scan.nextInt();
			i++;
			
		} while (i < 10);
		
		System.out.print("A soma de todos os n�meros informados = " + soma);
		
		scan.close();

	}

}
