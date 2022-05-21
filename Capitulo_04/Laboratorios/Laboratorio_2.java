package Capitulo_04.Laboratorios;

import java.util.Scanner;

public class Laboratorio_2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
	    System.out.print("Digite o m�s a ser pesquisado: ");
	    String mes = s.nextLine().toUpperCase().trim();
	    s.close();
		
		switch (mes){
			case "JANEIRO":
			case "MAR�O":
			case "MAIO":
			case "JULHO":
			case "AGOSTO":
			case "OUTUBRO":
			case "DEZEMBRO":
				System.out.println("\nO m�s de " + mes + " tem 31 dias!");
				break;
			case "Abril":
			case "Junho":
			case "Setembro":
			case "Novembro":
				System.out.println("\nO m�s de " + mes + " tem 30 dias!");
				break;
			case "Fevereiro":
				System.out.println("\nO m�s de " + mes + " tem 28 dias!");
				break;
			default:
				System.out.println("\nO m�s informado n�o existe!");
				break;
		}
	}

}
