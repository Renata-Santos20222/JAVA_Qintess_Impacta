package Atividades_Extras.Soma10NumerosComFor;

import java.util.Scanner;

public class Soma10NumerosComFor {

	public static void main(String[] args) {
	
		// Escreva um algoritmo que leia 10 n�meros do usu�rio e calcule a soma desses n�meros. Utilize o comando de repeti��o Enquanto (FOR).
		
		Scanner scan = new Scanner(System.in);
		int soma = 0;
		
		// Recebendo os n�meros do usu�rio
		for (int i = 0; i < 10; i++) {
		
			System.out.print("Digite o " + i + "� n�mero: ");
			soma = soma + scan.nextInt();
		}
		
		System.out.print("A soma de todos os n�meros informados = " + soma);
			
			scan.close();
	
	}

}
