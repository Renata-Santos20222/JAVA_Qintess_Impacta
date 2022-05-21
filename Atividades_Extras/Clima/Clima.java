package Atividades_Extras.Clima;

import java.util.Scanner;

public class Clima {

	public static void main(String[] args) {

		/*
		 Crie um algoritmo que, dada uma temperatura em graus c�lsius, exiba uma mensagem informando o tipo do
		 clima, de acordo com as seguintes condi��es: se a temperatura estiver at� 18 graus, o clima � frio; se a
		 temperatura estiver entre 19 e 23 graus, o clima � agrad�vel; se a temperatura estiver entre 24 e 35 graus, o
		 clima � quente; se a temperatura estiver acima de 35 graus, o clima � muito quente. 
		*/
		
		Scanner scan = new Scanner(System.in);
		
		// Recebendo os n�meros do usu�rio
		System.out.print("Digite a temperatura em graus Celsius: ");
		int temperatura = scan.nextInt();
		
		// Verificando o clima
		if (temperatura <= 18) {
			System.out.println("Clima frio!");
		}
		else if (temperatura >= 19 && temperatura <= 23) {
			System.out.println("Clima agrad�vel!");
		}
		else if (temperatura >= 24 && temperatura <= 35) {
			System.out.println("Clima quente!");
		}
		else {
				System.out.println("Muito quente!");
		}
		
		scan.close();

	}

}
