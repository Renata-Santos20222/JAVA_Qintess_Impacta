package Atividades_Extras.MultiplicacaoXvezesY;

import java.util.Scanner;

public class MultiplicacaoXvezesY {

	public static void main(String[] args) {

		// Crie um algoritmo que l� dois n�meros inteiros, X e Y, e mostre o resultado da multiplica��o de x por y.
		
		Scanner scan = new Scanner(System.in);
		int numero1, numero2;
		
		// Recebendo o n�mero do usu�rio
		System.out.print("Informe o primeiro n�mero: ");
		numero1 = scan.nextInt();
		
		System.out.print("Informe o segundo n�mero: ");
		numero2 = scan.nextInt();
		
		scan.close();
		
		System.out.println("\nA multiplica��o dos n�meros informados (" + numero1 + " e " + numero2 + ") �: " + (numero1 * numero2));

	}

}
