package Capitulo_09.Laboratorio;

public class RG {
	
	private int numero;
	private String dataNasc;
	
	// Construtor sobrecarga
	public RG(int numero, String dataNasc) {
		this.numero = numero;
		this.dataNasc = dataNasc;
	}

	// M�todos acessores
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getDataNasc() {
		return dataNasc;
	}
	
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
}
