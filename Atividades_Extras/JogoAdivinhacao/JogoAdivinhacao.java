package Atividades_Extras.JogoAdivinhacao;

import java.util.Scanner;

public class JogoAdivinhacao {

	public static void main(String[] args) throws InterruptedException {

		/*
		  Escreva um algoritmo que simule um jogo de adivinha��o com a pergunta �O que �, o que �? Quanto mais se
		  tira, mais a gente tem?�. O seu algoritmo deve encerrar apenas quando o usu�rio informar a resposta correta. 
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("O que �, o que �? Quanto mais se tira, mais a gente tem? ");
		String resposta = scan.nextLine();
		
		while (resposta.equals("fotografia") != true){
			
			System.out.println("\nVoc� errou... tente novamente: ");
			System.out.print("\n\nO que �, o que �? Quanto mais se tira, mais a gente tem? ");
			resposta = scan.nextLine();
			
		}
		
		scan.close();
		
		System.out.println("\n\nParab�ns, voc� acertou! At� a pr�xima");

	}
}
