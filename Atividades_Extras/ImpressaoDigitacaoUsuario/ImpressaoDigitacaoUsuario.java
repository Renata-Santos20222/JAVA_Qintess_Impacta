package Atividades_Extras.ImpressaoDigitacaoUsuario;

import java.util.Scanner;

public class ImpressaoDigitacaoUsuario {

	public static void main(String[] args) {

		// Crie um algoritmo que leia uma frase do usu�rio e escreva na tela exatamente o que o usu�rio digitar.
		
		System.out.print("Digite uma frase: ");
		Scanner scan = new Scanner(System.in);
		String frase = new String();
		
		// Recebendo o texto do usu�rio
		frase = scan.nextLine();
		
		scan.close();
		
		// Escrevendo uma palavra por linha
		System.out.println("\n" + frase);

	}

}
