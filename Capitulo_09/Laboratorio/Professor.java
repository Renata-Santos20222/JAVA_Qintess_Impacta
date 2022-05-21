package Capitulo_09.Laboratorio;

public class Professor extends Pessoa{

	private String disciplina;
	private float salario;
	
	// Construtor sobrecarga
	public Professor(String nome, int idade, char sexo, RG rg, String disciplina, float salario) {
		super(nome, idade, sexo, rg);
		this.disciplina = disciplina;
		this.salario = salario;
	}
	
	public void falar() {
		System.out.print(this.getNome() + ": ");
	}

	public void mostrarDados() {
		System.out.println("------------ Professor: " + super.getNome() + " ------------------");
		System.out.println("O RG do professor �: " + + rg.getNumero());
		System.out.println("A data de nascimento do professor �: " + rg.getDataNasc());
		System.out.println("A idade do professor �: " + super.getIdade());
		System.out.println("O sexo do professor � " + super.getSexo());
		System.out.println("O curso ministrado pelo professor � " + this.disciplina);
		System.out.println("O sal�rio do professor � : " + this.salario);
		System.out.println("-------------------------------------------------\n");
	}
	
	// M�todos acessores
	public String getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public float getSalario() {
		return salario;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
}