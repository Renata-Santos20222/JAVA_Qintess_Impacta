package Capitulo_07;

public class Construtores {
	
	private String cor;
	private int tamanho;
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	// Construtor padr�o de uma classe
    public Construtores() {
		
		/* Tipos primitivos receber�o automaticamente
		 * int    = 0
		 * float  = 0
		 * double = 0
		 * .
		 * .
		 * .
		 * 
		 * float  = false
		 * 
		 * char   = /u0000
		 * 
		 * Objetos em geral = null
		 */
    }

	// Implementando um contrutor
	public Construtores(String cor, int tamanho) {
		setCor("Vermelho");
		setTamanho(36);
	}
	
	// Criando um m�todo para exibir os dados
	public void mostrar() {
		System.out.println("A cor � \'" + cor + "\' e o tamanho � \'" + tamanho + "\'.");
	}
	
}
