package Atividades_Extras.ConversaoDolarReal;

import java.util.Scanner;

public class ConversaoDolarReal {

	public static void main(String[] args) {

		// Crie um algoritmo que l� um valor real em d�lar, e converte o valor para reais. Considere que a cota��o � US$ 1 = R$ 1,82.
		
		Scanner scan = new Scanner(System.in);
		
		// Recebendo o n�mero do usu�rio
		System.out.print("Informe um valor em d�lares: ");
		double dolar = scan.nextDouble();
		
		double real = dolar * 1.82;
		
		scan.close();
		
		System.out.println("Ap�s a convers�o do valor US$ " + dolar + " temos RS " + real + ".");

	}

}
