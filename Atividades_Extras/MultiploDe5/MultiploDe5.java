package Atividades_Extras.MultiploDe5;

import java.util.Scanner;

public class MultiploDe5 {

	public static void main(String[] args) {

		// Crie um algoritmo que receba do usu�rio um n�mero qualquer e verifique se esse � m�ltiplo de 5.
		
		Scanner scan = new Scanner(System.in);
		
		// Recebendo os n�meros do usu�rio
		System.out.print("Digite o primeiro n�mero: ");
		int numero = scan.nextInt();
		
		// Verificando se o n�mero � m�ltiplo de 5
		if (numero % 5 == 0) {
			System.out.println("O n�mero '" + numero + "' � multiplo de 5");
		}
		else {
			System.out.println("O n�mero '" + numero + "' n�o � multiplo de 5");
		}
		
		scan.close();


	}

}
