package Capitulo_05;

public class Principalempregado {

	public static void main(String[] args) {
		// Criando a inst�ncia da classe Empregado
		Empregado emp = new Empregado();
		
		// Chamada do m�todo setEndereco
		emp.setEndereco("Centro");
		
		// Chamada do m�todo setIdade
		emp.setIdade(40);
		
		// Chamada da fun��o / m�todo mostrar
		System.out.println(emp.mostrar());

	}

}
