package Capitulo_09.Laboratorio;

public class Aluno extends Pessoa{

	private float mensalidade;
	private String curso;
	
	public Aluno(int numRG, String nasc, String nome, int idade, char sexo, String curso, float mensalidade) {
		super(nome, idade, sexo, new RG(numRG, nasc));
		this.curso = curso;
		this.mensalidade = mensalidade;
	}

	// M�todo falar
	public void falar() {
		System.out.print("-> " + this.getNome() + " Presente!\n\n");
	}

	public void mostrarDados() {
		System.out.println("--------------- Aluno: " + super.getNome() + " -------------------");
		System.out.println("O RG do aluno �: " + + rg.getNumero());
		System.out.println("A data de nascimento do aluno �: " + rg.getDataNasc());
		System.out.println("A idade do aluno �: " + super.getIdade());
		System.out.println("O sexo do aluno � " + super.getSexo());
		System.out.println("O curso em que oaluno est� matriculado � " + this.curso);
		System.out.println("A mensalidade paga pelo aluno �: " + this.mensalidade);
		System.out.println("-------------------------------------------------\n");
	}

	// M�todos acessores
	public float getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
