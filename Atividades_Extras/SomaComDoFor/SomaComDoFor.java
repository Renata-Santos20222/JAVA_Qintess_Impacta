package Atividades_Extras.SomaComDoFor;

public class SomaComDoFor {

	public static void main(String[] args) {

		// Escreva um algoritmo que calcule a soma dos n�meros de 1 a 15. Utilize o comando de repeti��o Enquanto (Do While).
		int soma = 0;
		
		for  (int i = 0; i <= 15; i++) {
			soma = soma + i;
		}

		System.out.println("A soma dos n�meros de 1 a 15 �: " + soma);

	}

}
