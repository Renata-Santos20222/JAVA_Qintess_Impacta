package Atividades_Extras.SaudacaoUsuario;

import java.util.Scanner;

public class SaudacaoUsuario {

	public static void main(String[] args) {

		// Sauda��o usu�rio
		
		Scanner scan = new Scanner(System.in);
		String nomeUsuario;
		
		// Recebendo o nome do usu�rio
		System.out.print("Informe o nome do usu�rio: ");
		nomeUsuario = scan.next();
		
		scan.close();
		
		System.out.println("Seja bemvindo " + nomeUsuario + "!");

	}

}
