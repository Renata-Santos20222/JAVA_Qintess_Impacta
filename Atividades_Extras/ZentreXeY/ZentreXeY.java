package Atividades_Extras.ZentreXeY;

import java.util.Scanner;

public class ZentreXeY {

	public static void main(String[] args) {

		// Crie um algoritmo que leia dois valores (x e y) representando um intervalo. Em seguida, leia um novo valor (z) e verifique se z pertence ao intervalo [x, y].
		
		Scanner scan = new Scanner(System.in);
		
		// Recebendo os n�meros do usu�rio
		System.out.print("Digite o primeiro n�mero: ");
		int x = scan.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		int y = scan.nextInt();
		
		System.out.print("Digite o terceiro n�mero: ");
		int z = scan.nextInt();
		
		// Verificando x est� entre x e y
		if (z > x && z < y) {
			System.out.println("O n�mero (" + z + ") est� entre os n�meros " + x + " e " + y);
		}
		else {
			System.out.println("O n�mero (" + z + ") n�o est� entre os n�meros " + x + " e " + y);
		}
		
		scan.close();

	}

}
