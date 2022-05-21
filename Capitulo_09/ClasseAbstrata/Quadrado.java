package Capitulo_09.ClasseAbstrata;

public class Quadrado extends Poligono {
	
	// Criando os atributos
	private double lado;
	
	// Construtor da classe
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	// Acesso ao m�todo abstrado da classe Pol�gono
	public double calcularArea() {
		double resultado = lado * lado;
		System.out.println("�rea do quadrado: " + resultado);
		return resultado;
	}

}
