package Capitulo_09.ClasseAbstrata;

public class Triangulo extends Poligono{
	
	// Criando os atributos
	private double base;
	private double altura;
	
	// Construtor da classe
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	// Acesso ao m�todo abstrado da classe Pol�gono
	public double calcularArea() {
		double resultado = (base * altura) / 2;
		System.out.println("�rea do tri�ngulo: " + resultado);
		return resultado;
	}

}
