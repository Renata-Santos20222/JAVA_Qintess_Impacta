package Capitulo_09.OperadorSuper;

public class Funcionario {

	// Definindo a classe Funcionario
	
	/* As vari�veis e m�todos podem ser acessados pela sua pr�pria
		classe e subclasses (n�o se preocupe, em breve voc� entender� o que s�o
		subclasses);
	*/
	protected String nome;
	protected String email;
	int idade;
	char sexo;
	
	// Construtor padr�o
	public Funcionario() {
	}
	
	// Sobrecarga no Construtor
	public Funcionario(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

}
