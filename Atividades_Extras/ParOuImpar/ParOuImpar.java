package Atividades_Extras.ParOuImpar;

import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args){
    	
		// Crie um algoritmo que leia um n�mero do usu�rio e informe se e o n�mero � par ou �mpar.
		
		Scanner scan = new Scanner(System.in);
		
		// Recebendo o n�mero do usu�rio
		System.out.print("Digite o n�mero a ser verificado: ");
		int numero1 = scan.nextInt();
		
		// Verificando se o n�mero � par ou impar
		if (numero1 % 2 == 0) {
			System.out.println("O n�mero informado � (" + numero1 + ") par.");
		}
		else {
			System.out.println("O n�mero informado � (" + numero1 + ") impar.");
		}
		
		scan.close();
    }

}
