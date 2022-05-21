package Atividades_Extras.DireitoGozarFerias;

import java.util.Scanner;

public class DireitoGozarFerias {
	
	// Classe Funcion�rio extend Pessoa

	public static void main(String[] args) throws InterruptedException {

		/*
		  Escreva um algoritmo que leia a quantidade de funcion�rios em uma empresa e, para cada funcion�rio leia
		  seu nome e seu tempo de servi�o (em meses). Se o funcion�rio possuir mais de 12 meses na empresa, escreva a
		  mensagem �<NOME> tem direito a f�rias�. Caso contr�rio, escreva a mensagem �<NOME> n�o tem direito a
		  f�rias�. Ao final, exiba quantos funcion�rios possuem direito a f�rias e quantos n�o possuem. 
		*/
		

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de usu�rios: ");
		int qtdFuncionarios = scan.nextInt();
		
		// Populando o array de funcion�rios
		for (int i = 0; i < qtdFuncionarios; i++) {
			
			String nome;
			int tempoServico = 0;
			
			System.out.print("Digite o nome do " + (i+1) + "� funcion�rio: ");
			nome = scan.next();
			
			System.out.print("Idade do usu�rio " + nome + ": ");
			tempoServico = scan.nextInt();
	        
	        if (tempoServico > 12) {
	        	System.out.println("O(a) funcion�rio(a) " + nome + " tem direito a f�rias.");
	        }
	        else {
	        	System.out.println("O(a) funcion�rio(a) " + nome + " n�o tem direito a f�rias.");
	        }
			
			System.out.println("\n-------------------\n");
			
		}
		
		scan.close();

	}
	
	public static void limpaTela() {
		for( int i = 0; i < 15; i++ ) {
			System.out.println("");
		}
	}

}
