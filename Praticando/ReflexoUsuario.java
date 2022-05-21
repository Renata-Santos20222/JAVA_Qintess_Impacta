package Praticando;

import java.util.Scanner;

public class ReflexoUsuario {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 Fazer um algoritmo em Java para medir os reflexos do usu�rio. O programa deve:
		 Mostrar a palavra �Agora!� ap�s um tempo aleat�rio e um n�mero, tamb�m aleat�rio
		 Contar o tempo at� que o usu�rio digite o n�mero pedido e mostrar esse tempo.
		 Dicas: usar o m�todo getTimeInMillis da classe Calendar ou o m�todo nanoTime da classe System.
		*/
		
		Scanner sc = new Scanner (System.in);

		char opcao = 'z';
		int numeroDigitado;
		int tentativas = 0;
        limpaTela();
        
		do {

			if (tentativas != 0 && opcao == 'n') {
				limpaTela();
				System.out.println("Vamos tentar novamente\n\n\n");
			}
			else {
		        System.out.println("IREMOS MEDIR SEUS REFLEXOS!\n\n\n");
		        System.out.println("Digite o n�mero exibido na tela no menor tempo poss�vel\n\n\n");
			}
	        System.out.print("Podemos come�ar? Pressione (S) para sim ou (N) para n�o: ");

	        // Recebendo a resposta do usu�rio a respeito do in�cio do teste
	        opcao = sc.next().charAt(0);
	        
			if (opcao == 's' || opcao == 'S') {
				
	            // Gerando n�mero randomico entre 0 at� 1000
	            int max = 1000;
	            int min = 0;
	            int range = max - min + 1;
	            
	            int numRandomico = (int)(Math.random() * range) + min;
	            
	            limpaTela();
	            
	            System.out.println("\n\nDigite o n�mero " +numRandomico + " assim que dermos o sinal. Fique atento!");
	            
	            // pausa de 2 segundos	            
	            Thread.sleep(2000);
	            System.out.println("AGORA!");

	            long start = System.currentTimeMillis();
	            
		        // Recebendo a digita��o do usu�rio 
		        numeroDigitado = sc.nextInt();
		        
	            long finish = System.currentTimeMillis();
		        
		        sc.close();

		        
		        System.out.println("O usu�rio digitou o n�mero " + numeroDigitado + " ap�s " + (finish - start) + " milissegundos.");
	        }

            tentativas++;
	        
		}while (opcao == 'n' || opcao == 'N');

	}
	
	public static void limpaTela() {
		for( int i = 0; i < 15; i++ ) {
			System.out.println("");
		}
	}

}
