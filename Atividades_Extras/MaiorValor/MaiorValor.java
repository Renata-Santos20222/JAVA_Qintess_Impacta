package Atividades_Extras.MaiorValor;

import java.util.Scanner;

public class MaiorValor {

	public static void main(String[] args) {

		// Crie um algoritmo que leia dois valores (x e y) e informe qual o maior valor.
		
		Scanner scan = new Scanner(System.in);
		
		// Recebendo os n�meros do usu�rio
		System.out.print("Digite o primeiro n�mero: ");
		double x = scan.nextDouble();
		
		System.out.print("Digite o segundo n�mero: ");
		double y = scan.nextDouble();
		
		// Verificando se os n�meros s�o iguais
		if (x > y) {
			System.out.println("O primeiro n�mero informado (" + x + ") � maior do que o segundo n�mero informado (" + y + ")");
		}
		else {
			System.out.println("O segundo n�mero informado (" + y + ") � maior do que o primeiro n�mero informado (" + x + ")");
		}
		
		scan.close();

	}

}
