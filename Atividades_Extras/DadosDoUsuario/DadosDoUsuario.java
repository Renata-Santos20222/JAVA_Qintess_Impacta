package Atividades_Extras.DadosDoUsuario;

import java.util.Scanner;

public class DadosDoUsuario {

	public static void main(String[] args) {

		// Crie um algoritmo que solicite o nome, o endere�o e o telefone do usu�rio e depois mostra os dados digitados em uma �nica linha.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		String nome = scan.nextLine();
		
		System.out.print("Informe seu endere�o completo: ");
		String endereco = scan.nextLine();
		
		System.out.print("Qual o seu ddd? ");
		int ddd = scan.nextInt();
		
		System.out.print("E o seu telefone?: ");
		String telefone = scan.next();
		
		scan.close();
		
		// Escrevendo em uma �nica linha
		System.out.println("\nUsu�rio: " + nome + " | Endere�o: " + endereco + " | Telefone: (" + ddd + ") " + telefone);

	}

}
