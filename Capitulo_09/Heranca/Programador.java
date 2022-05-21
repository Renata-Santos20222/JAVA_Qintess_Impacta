package Capitulo_09.Heranca;

public class Programador extends Funcionario {

	/*
	 private: Somente a pr�pria classe pode acessar vari�veis e m�todos. � o
	 n�vel mais restrito de encapsulamento.
	*/
	private String linguagemProgramacao;
	private String sistemaOperacional;
	double salario;
	
	// Construtor padr�o
	public Programador() {}
	
	// Sobrecarga no Construtor
	public Programador(String n, String e, String linguagem, String so) {
		// Acessando os atributos herdados e as particulares desta classe
		nome = n;
		email = e;
		this.linguagemProgramacao = linguagem;
		this.sistemaOperacional = so;
	}

	// Criando m�todos acessors (getters e setters)
	public String getLinguagemProgramacao() {
		return linguagemProgramacao;
	}

	public void setLinguagemProgramacao(String linguagemProgramacao) {
		this.linguagemProgramacao = linguagemProgramacao;
	}

	public String getSistemaOperacional() {
		return sistemaOperacional;
	}

	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	// M�todo para exibi��o do conte�do
	public void exibir() {
		System.out.println("Nome: " + nome);
		System.out.println("E-mail: " + email);
		System.out.println("Linguagem de programacao: " + linguagemProgramacao);
		System.out.println("Sistema operacional: " + sistemaOperacional + "\n");
	}
	
}
