package Praticando;

import java.util.Scanner;

public class InverterString {

	public static void main(String[] args) {

		/*
		 Fazer um programa que receba uma string do usu�rio e mostre o conte�do desta string de forma invertida.
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite aqui o seu texto: ");
	    String texto = scan.nextLine();
		scan.close();
		
		System.out.println(" ");
		
		// INVERTENDO ATRAV�S DO M�TODO REVERSE
		//System.out.println(new StringBuilder(texto).reverse().toString());
		
		
		String textoInvertido = "";
	
		
		for (int i = texto.length() - 1;  0 <= i; i--) {
			textoInvertido += texto.charAt(i);
		}
		
		System.out.println("O texto invertido ser�: " + textoInvertido);

	}

}
