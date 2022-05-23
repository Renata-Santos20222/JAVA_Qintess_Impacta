package Capitulo_14.Exemplo_02;

public class Executando {

	public static void main(String[] args) {

		// Neste exemplo referenciamos a Classe que contém (::) o método calculaJuros()
		ExemploFunc6 calculando = Financeiro::calculaJuros;
		
		System.out.println("Valor final: " + calculando.execute(1200.0, 9.3));

	}

}
