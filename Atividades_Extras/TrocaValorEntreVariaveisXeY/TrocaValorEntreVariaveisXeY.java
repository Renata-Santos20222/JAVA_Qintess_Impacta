package Atividades_Extras.TrocaValorEntreVariaveisXeY;

import java.util.Scanner;

public class TrocaValorEntreVariaveisXeY {

	public static void main(String[] args) {

		// Crie um algoritmo que leia as vari�veis inteiras x e y e
		// troque o valor destas vari�veis. Isto �, x deve ficar com o valor de y e y deve ficar com o valor de x.
		// Mostre os valores depois da troca.
		Scanner scan = new Scanner(System.in);
		
		// Recebendo o n�mero do usu�rio
		System.out.print("Informe um n�mero: ");
		double x = scan.nextInt();
		
		System.out.print("Informe outro n�mero: ");
		double y = scan.nextInt();
		
		System.out.println("\nO valor original de 'X' era " + x + " e o valor de 'Y' era " + y);
		
		double aux = x;
		x = y;
		y = aux;
		
		System.out.println("\nAp�s a invers�o temos 'X' = " + x + " e 'Y' � = " + y);
		
		scan.close();

	}

}
