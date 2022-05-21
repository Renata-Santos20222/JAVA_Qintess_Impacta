package Praticando;

import java.lang.Math;

public class Sorteio {

	public static void main(String[] args) {
		
		/*
		Escreva um algoritmo em java para:
		Sortear um n�mero de 0 a 1000 (dica: usar Math.random())
		Pedir um palpite ao usu�rio. Se ele errar, informar se o palpite � maior ou menor do que o n�mero sorteado.
		Pedir novos palpites at� que o usu�rio acerte e, depois disso, mostrar em quantas tentativas ele acertou. 
		*/
		
        // Definindo o range
        int max = 1000;
        int min = 0;
        int range = max - min + 1;
        
        int numRandomico;
        int palpite = -1;
        int tentativa = 0;
  
        // Gerando n�mero randomico entre 0 at� 1000
        numRandomico = (int)(Math.random() * range) + min;
        
        while (palpite != numRandomico) {
        	
        	// Gerando palpite randomico entre 0 at� 1000
        	palpite = (int)(Math.random() * range) + min;
        	
        	if (palpite < numRandomico) {
        		System.out.println("Seu palpite (" + palpite + ") � MENOR do que o n�mero sorteado (" + numRandomico + ").");
        	}
        	else if (palpite > numRandomico) {
        		System.out.println("Seu palpite (" + palpite + ") � MAIOR do que o n�mero sorteado!");
        	}
        	else {
        		System.out.print("\nVoc� conseguiu!");
        	}
        	tentativa++;
        }

        System.out.println(" Ap�s " + tentativa + " tentativas voc� acertou o n�mero sorteado (" + numRandomico + ").");
    }
}