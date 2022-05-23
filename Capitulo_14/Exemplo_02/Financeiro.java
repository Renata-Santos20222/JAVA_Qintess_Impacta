package Capitulo_14.Exemplo_02;

public class Financeiro {

	// Método static
	public static double calculaJuros(double valorInicial, double taxaJuros) {
		double razao = taxaJuros / 100;
		double juros = valorInicial * razao;
		return valorInicial + juros;
	}

}
