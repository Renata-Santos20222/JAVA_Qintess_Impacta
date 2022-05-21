package Capitulo_09.OperadorSuper;

public class Estagiario extends Programador{
	String relatorio;
	String horas;
	
	// Construtor padr�o
	public Estagiario() {}

	// Sobrecarga no Construtor
	public Estagiario(String nome, String relatorio, String horas, Double salario) {
		this.nome = nome;
		super.setSalario(salario);
		this.relatorio = relatorio;
		this.horas = horas;
	}
	
	public void dadosEstagiario() {
		System.out.println("Nome do estagi�rio: " + nome);
		System.out.println("Sal�rio do estagi�rio: " + super.getSalario());
		System.out.println("Informa��es sobre o relat�rio: "  + relatorio);
		System.out.println("Quantidade de horas: "  + horas);
	}

}
