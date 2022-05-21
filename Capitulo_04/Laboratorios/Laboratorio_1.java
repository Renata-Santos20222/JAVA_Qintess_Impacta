package Capitulo_04.Laboratorios;

import java.util.Scanner;

public class Laboratorio_1 {

    public static void main(String[] args){
    	
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o n�mero a ser verificado: ");
        int numero = s.nextInt();
	    s.close();
        
        if(numero == 0 || numero == 1){
        	System.out.println("\nO n�mero " + numero + " n�o � considerado um primo!");
        }
        else{
            int x = 0;
            
        	for(int i = numero; i > 0; i--){
        		if(numero % i == 0){
        			x++;
    			}
        	}
        	
        	// declarando um array que armazenar� os divisores de um n�mero
        	int[] divisores = new int[x];
        	int z = 0;
        	
        	for(int i = numero; i > 0; i--){
        		if(numero % i == 0){
        			divisores[z] = numero / i;
        			z++;
        		}
        	}
        	
            if(x > 2){
            	System.out.print("\nO n�mero " + numero + " n�o � primo pois possui " + x + " divisores! S�o eles: ");
        		int cont = 0;
            	for (z = 0; z < x; z++) {
            		cont++;
            		System.out.print(divisores[z]);
            		if(cont < x) {
            			System.out.print(", ");
            		}
            		else {
            			System.out.print(".");
            		}
            	}
            }
            else{
            	System.out.println("\nO n�mero " + numero + " � primo pois possui apenas " + x + " divisores, o n�mero \'1\' e ele mesmo");
            }
		}
    }

}