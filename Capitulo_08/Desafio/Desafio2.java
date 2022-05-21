package Capitulo_08.Desafio;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		  Para a multiplica��o de matrizes � necess�rio uma regra: o n�mero de LINHAS DA 1� MATRIZ deve ser igual ao n�mero de COLUNAS DA 2� MATRIZ.
		  
		  A multiplica��o deve ocorrer da seguinte forma: (matrizA[1][0] * matrizB[0][1]) + (matrizA[2][0] * matrizB[0][2] ...)
		  Ou seja, multiplica-se a linha pela coluna de cada matriz
		  
		  A matriz resultante ter� o N�MERO DE LINHAS DA 1� MATRIZ e o N�MERO DE COLUNAS DA 2� MATRIZ.
		*/

		int[][] matrizA = new int[3][3];
		int[][] matrizB = new int[3][3];
		
		int[][] matrizResult = new int[3][3];

		// Populando as matrizes matrizA
		System.out.println("\nDigite Nove(9) n�meros inteiros que compor�o a \'MATRIZ A\':");
		matrizA = populaArray(matrizA);

		// Limpando o consolte
		limpaTela();
		
		// Populando as matrizes matrizB
		System.out.println("\nDigite Nove(9) n�meros inteiros que compor�o a \'MATRIZ B\':");
		matrizB = populaArray(matrizB);
		
		// Limpando o consolte
		limpaTela();
		
		// Calculando o produto da matrizA X matrizB
		matrizResult = calculaProdutoMatrizes(matrizA, matrizB);

		System.out.println("\n\n");
		exibeMatriz(matrizResult);

	}
	
	public static void limpaTela() throws InterruptedException {
        System.out.println("\n\nAguarde enquanto armazenamos os n�meros no array!");
        Thread.sleep(2000);
		for( int i = 0; i < 15; i++ ) {
			System.out.println("");
		}
	}
	
	public static int[][] populaArray(int matriz[][]) {
		Scanner scan = new Scanner (System.in);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
					matriz[i][j] = scan.nextInt();
				}
		}
		return matriz;
	}
	
	public static int[][] calculaProdutoMatrizes(int[][] matrizA, int[][] matrizB) {
		int[][] matrizResult = new int[3][3];
		int resultado = 0;
		for (int linha = 0; linha < matrizResult.length; linha++) {
			for (int coluna = 0; coluna < matrizA.length; coluna++) {
				for (int x = 0; x < matrizB.length; x++) {
					resultado = resultado + matrizA[linha][x] * matrizB[x][coluna];
				}
				matrizResult[linha][coluna] = resultado;
			}
		}
		return matrizResult;
	}
	
	public static void exibeMatriz(int[][] matriz) {
		System.out.println("O produto das matrizes informadas �: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(" | " + matriz[i][j]);
			}
			System.out.println(" | ");
			
		}
	}
	
}