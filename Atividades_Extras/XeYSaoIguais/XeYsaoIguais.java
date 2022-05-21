package Atividades_Extras.XeYSaoIguais;

import java.util.Scanner;

public class XeYsaoIguais {

	public static void main(String[] args) {

		// Crie um algoritmo que leia dois valores (x e y) e informe se eles s�o iguais.
		
		Scanner scan = new Scanner(System.in);
		
		// Recebendo os n�meros do usu�rio
		System.out.print("Digite o primeiro n�mero: ");
		int numero1 = scan.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		int numero2 = scan.nextInt();
		
		// Verificando se os n�meros s�o iguais
		if (numero1 == numero2) {
			System.out.println("Os n�meros informados s�o iguais (" + numero1 + " = " + numero2 + ")");
		}
		else {
			System.out.println("Os n�meros informados s�o diferentes (" + numero1 + " # " + numero2 + ")");
		}
		
		scan.close();

	}

}
