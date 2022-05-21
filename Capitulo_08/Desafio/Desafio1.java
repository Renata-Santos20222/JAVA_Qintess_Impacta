package Capitulo_08.Desafio;

public class Desafio1 {

	public static void main(String[] args) {

		int[][] matriz = new int[10][10];
		
		// Definindo o range do sorteio
        // Definindo o range
        int max = 9;
        int min = 1;
        int range = (max - min) + 1;

		// Preenchendo a matriz com n�meros de 1 a 9
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				
		        // Sorteando n�mero de 0 a 9 e incluindo na matriz[4][4]
		        if (j == 4) {
		        	matriz[i][j] = (int)(Math.random() * range) + min;
		        	continue;
		        }
				
				matriz[i][j] = j;
			}
		}
		
		// Exibindo o conte�do de cada posi��o da matriz
		System.out.println("Exibindo o conte�do de cada posi��o da matriz");
		for (int i = 0; i < matriz.length; i++) {
			if (i < 9) {
				System.out.print("Linha 0" + (i+1) + "-> ");
			}
			else{
				System.out.print("Linha " + (i+1) + "-> ");	
			}
			for (int j = 0; j < matriz.length; j++) {
		       System.out.print("matriz[" + i + "]" + "[" + j + "]" + " = " + matriz[i][j] + " | ");
			}
			System.out.println();
		}
		
		System.out.println("");
		
		// Exibindo o conte�do completo da matriz
		System.out.println("Exibindo o conte�do de cada posi��o da matriz");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
		       System.out.print("|" + matriz[i][j]);
			
			}
			System.out.print("|");
			System.out.println("");
		}
		
		// Soma da 3� coluna da matriz
		int soma = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				
				if (j == 2) {
					soma = soma + matriz[i][j];
				}
			}
		}
		System.out.println("\nA soma da 3� coluna = " + soma);
		
		// Somando a coluna com n�meros rand�micos
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				
				if (j == 4) {
					soma = soma + matriz[i][j];
				}
			}
		}
		System.out.println("A soma da 4� coluna (cont�m n�meros rand�micos) = " + soma);
	}
}
