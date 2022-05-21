package Praticando;

import java.util.Scanner;

public class MaiorMenorMedia {
	
	public static void main(String[] args) {
		
		/*
		 Escreva um algoritmo em Java que receba a entrada de dados do usu�rio informando o sexo, altura de um grupo de pessoas
		 Calcule:
		 a altura m�dia do grupo
		 a altura m�dia dos homens
		 a altura m�dia das mulheres
		 a maior e menor altura do grupo
		 o n�mero total de homens
		 o n�mero total de mulheres
		*/
		
		// Limpa tela
        limpaTela();
		
		int opcao = 0;
		
		float altura;
		char sexo;
		int qtMulheres = 0;
		int qtHomens = 0;
		float maiorAltura = 0;
		float menorAltura = (float) 5.0;
		float somaAlturaHomens = 0;
		float somaAlturaMulheres = 0;
		float mediaGeral = 0;
		float mediaH = 0;
		float mediaM = 0;
		

        Scanner menu = new Scanner (System.in);

		do {
			// Montando menu
			System.out.println("\n *** ESCOLHA UMA OP��O DE MENU *** \n");
	        System.out.println("Op��o 1 - Novo Cadastro");
	        System.out.print("Op��o 9 - Sair\n");
			System.out.println("\n-------------------------\n");;
	        
	        // Recebe digita��o do usu�rio
	        System.out.print("Digite uma op��o: ");
	        opcao = menu.nextInt();
	        
	        // Limpa tela
	        limpaTela();
	        
	        
	        if (opcao == 1) {

	        	// SEXO
		        System.out.print("\nEscolhao sexo: (M) Mulher || (H) Homem: ");
		        sexo = menu.next().charAt(0);
		        
		        if (sexo == 'M' || sexo == 'm') {
		        	qtMulheres++;
		        }
		        else if (sexo == 'H' || sexo == 'h') {
		        	qtHomens++;
		        }
		        else {
		        	limpaTela();
		        	System.out.println("ENTRADA INV�LIDA! Utilize (M) para mulheres ou (H) para homens");
		        	continue;
		        }
		        
		        // ALTURA
		        System.out.print("Informe a altura (Exemplo: 1,60) ");
		        altura = menu.nextFloat();
		        
		        if(sexo == 'H' || sexo == 'h') {
		        	somaAlturaHomens = somaAlturaHomens + altura;
		        }
		        else {
		        	somaAlturaMulheres = somaAlturaMulheres + altura;
		        }
		        
		        if (altura > maiorAltura) {
		        	maiorAltura = altura;
		        }
		        if (altura < menorAltura) {
		        	menorAltura = altura;
		        }
		        else {
		        	limpaTela();
		        	System.out.println("ENTRADA INV�LIDA! Utilize ',' (v�rgula) para casas decimais.");
		        	continue;
		        }
		        
		        // Limpa tela
		        limpaTela();
	        }
	        else if (opcao != 1 && opcao != 9) {
	        	System.out.println("OP��O N�O RECONHECIDA. TENTE NOVAMENTE!\n\n\n");
	        	continue;
	        }
	        
		}while (opcao != 9);
		
		// Encerra Scanner
		menu.close();
		
		mediaGeral  = (somaAlturaHomens + somaAlturaMulheres) / (qtHomens + qtMulheres);
		
		if (qtHomens != 0) {
			mediaH = somaAlturaHomens / qtHomens;	
		}
		
		if (qtMulheres != 0) {
			mediaM = somaAlturaMulheres / qtMulheres;
		}

        System.out.println("A altura m�dia do grupo � de: " + mediaGeral + ".");
        System.out.println("A maior altura do grupo � de " + maiorAltura + "m, e a menor � de " + menorAltura + "m.");
        System.out.println("A m�dia de altura dos homens �: " + mediaH + "m.");
        System.out.println("A m�dia de altura das mulheres �: " + mediaM + "m.");
        System.out.println("O n�mero de homens �: " + qtHomens);
        System.out.println("O n�mero de mulheres �: " + qtMulheres + ".");

	}

	public static void limpaTela() {
		for( int i = 0; i < 15; i++ ) {
			System.out.println("");
		}
	}
	
}