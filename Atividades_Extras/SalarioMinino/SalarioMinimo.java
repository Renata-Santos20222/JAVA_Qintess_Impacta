package Atividades_Extras.SalarioMinino;

import java.util.Scanner;

public class SalarioMinimo {

	public static void main(String[] args) {

		/*
		 Construa um algoritmo que leia do usu�rio o sal�rio e exiba uma mensagem de acordo com as seguintes
		condi��es: se o sal�rio for at� R$ 645, escreva a mensagem �At� 1 sal�rio m�nimo; se o sal�rio for acima de R$
		645 e at� R$ 1935, escreva a mensagem �At� 3 sal�rios m�nimos�; se for acima de R$ 1935 e abaixo de R$ 3225,
		escreva a mensagem �At� 5 sal�rios m�nimos�; se for acima de R$ 3225, escreva a mensagem �Acima de 5
		sal�rios m�nimos�. 
	   */
		
		Scanner scan = new Scanner(System.in);
		
		// Recebendo o sal�rio do usu�rio
		System.out.print("Informe seu sal�rio: ");
		double salario = scan.nextDouble();
		
		// Verificando o sal�rio
		if (salario <= 645) {
			System.out.println("At� 1 sal�rio m�nimo!");
		}
		else if (salario > 645  && salario <= 1935) {
			System.out.println("At� 3 sal�rios m�nimos!");
		}
		else if (salario > 1935 && salario <= 3255) {
			System.out.println("At� 5 sal�rios m�nimos!");
		}
		else {
				System.out.println("Acima de 5 sal�rios m�nimos!");
		}
		
		scan.close();

	}

}
