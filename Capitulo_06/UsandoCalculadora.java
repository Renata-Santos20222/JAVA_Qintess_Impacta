package Capitulo_06;

public class UsandoCalculadora {

	public static void main(String[] args) {
		float y;
		Calculadora calc = new Calculadora();
		
		y = calc.somar(15,  40);
		System.out.format(String.format("Soma = %.2f", y));

		y = calc.subtrair(15,  20);
		System.out.format(String.format("\n\nSubtra��o = %.2f", y));

		y = calc.multiplicar(2, (float) 25.3);
		System.out.format(String.format("\n\nMultiplica��o = %.2f", y));
		
		y = calc.dividir(20,  2);
		System.out.printf("\n\nDivis�o = %.2f", y);
	}
}