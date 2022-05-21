package Atividades_Extras.MenuOperacoesMatematicas;

import java.util.Scanner;

public class MenuOperacoesMatematicas {

	/*
	 Escreva um algoritmo que leia dois n�meros e apresente um menu com 4 op��es: 
	 1) Somar os n�meros; 2) Subtrair os n�meros; 3) Multiplicar os n�meros; 4) Dividir os n�meros.
	 Leia a op��o do usu�rio e execute a opera��o e apresente o resultado.
	 Caso a op��o digitada seja inv�lida, apresente a mensagem de �Op��o inv�lida� para o usu�rio.
	*/
	
	public static void main(String[] args) throws InterruptedException {
        
		Scanner scan = new Scanner(System.in);
		
        int opcao;

	        // Recebendo os n�meros do usu�rio
	        System.out.print("Digite o 1� n�mero: ");
	        double x = scan.nextDouble();
	        
	        System.out.print("Digite o 2� n�mero: ");
	        double y = scan.nextDouble();
	        
	        Thread.sleep(2000);
	        limpaTela();

        do {
	        // Escreve menu
			System.out.println("*** Menu de op��es ***");
			System.out.println("1-Somar  2-Subtrair  3-Multiplicar  4-Dividir  0-SAIR\n\n\n");

			opcao = scan.nextInt();
			
			switch (opcao) {
				case 0:
			        limpaTela();  
			        System.out.println("Fechando o sistema. \n\nAGUARDE.........\n\n\n\n\n\n\n\n");
		            Thread.sleep(2000);
		            limpaTela();
					break;
				case 1:	        
			        limpaTela();
			        System.out.println("O valor da soma dos n�meros " + x + " e " + y + " = " + somar(x, y));
			        opcao = 0;
					break;
				case 2:        
			        limpaTela();
			        System.out.println("O valor da subtra��o dos n�meros " + x + " e " + y + " = " + subtrair(x, y));
			        opcao = 0;
					break;
				case 3:        
			        limpaTela();
			        System.out.println("O valor da multiplica��o dos n�meros " + x + " e " + y + " = " + Multiplicar(x, y));
			        opcao = 0;
					break;
				case 4:        
			        limpaTela();
			        System.out.println("O valor da divis�o dos n�meros " + x + " e " + y + " = " + dividir(x, y));
			        opcao = 0;
					break;
				default:
					System.out.println("Opcao inv�lida!");
		            // pausa de 2 segundos	            
		            Thread.sleep(2000);
			        limpaTela();
			}
			
		} while (opcao != 0);  
		
        scan.close();

	}
	
	public static void limpaTela() {
		for( int i = 0; i < 15; i++ ) {
			System.out.println("");
		}
	}
	
	public static double somar(double x, double y) {
		double aux = x + y;
		return aux;
	}
	
	public static double Multiplicar(double x, double y) {
		double aux = x - y;
		return aux;
	}
	
	public static double subtrair(double x, double y) {
		double aux = x * y;
		return aux;
	}
	
	public static double dividir(double x, double y) {
		double aux = x / y;
		return aux;
	}

}
