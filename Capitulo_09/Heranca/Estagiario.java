package Capitulo_09.Heranca;

public class Estagiario extends Programador{
	String relatorio;
	String horas;
	
	// Construtor padr�o
	public Estagiario() {}
	
	/*
	// Sobrecarga no Construtor
	public Estagiario(String nome, String relatorio, String horas, Double salario) {
		this.nome = nome;
		this.salario = salario;
		this.relatorio = relatorio;
		this.horas = horas;
	}
	
	OU 
	
	*/
	
	// Sobrecarga no Construtor
	public Estagiario(String n, String relatorio, String h, Double s) {
		nome = n;
		this.salario = s;
		this.relatorio = relatorio;
		horas = h;
	}
	
	public void dadosEstagiario() {
		System.out.println("Nome do estagi�rio: " + nome);
		System.out.println("Sal�rio do estagi�rio: " + salario);
		System.out.println("Informa��es sobre o relat�rio: "  + relatorio);
		System.out.println("Quantidade de horas: "  + horas);
	}

}
