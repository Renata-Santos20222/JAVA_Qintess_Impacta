package Atividades_Extras.ReajusteSalarioFuncionario;

import java.util.Scanner;

public class ReajusteSalarioFuncionario {

	public static void main(String[] args) {

		// Crie um algoritmo que l� o sal�rio de um funcion�rio, reajusta o sal�rio em 7% e mostra o resultado.

		Scanner scan = new Scanner(System.in);
		
		// Recebendo o valor do sal�rio do funcion�rio
		System.out.print("Informe o valor do sal�rio a ser reajustado: ");
		double salario = scan.nextDouble();
		salario = salario + (salario * 0.07);
		
		scan.close();
		
		System.out.print("O valor do sal�rio do funcionario reajustado em 7% � " + salario);
		
	}

}
