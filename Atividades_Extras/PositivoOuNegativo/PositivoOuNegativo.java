package Atividades_Extras.PositivoOuNegativo;

import java.util.Scanner;

public class PositivoOuNegativo {

	public static void main(String[] args) {

		// Crie um algoritmo que leia um n�mero do usu�rio e informe se e o n�mero � positivo ou negativo.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		double numero = scan.nextDouble();
		
		scan.close();
		
		// Escrevendo em uma �nica linha
		System.out.print("\nO n�mero " + numero + " � ");
		if (numero >= 0) {
			System.out.println("positivo!");
		}
		else {
			System.out.println("negativo!");
		}

	}

}
