package Capitulo_05;

public class AtribuicaoEntreObejtos {

	public static void main(String[] args) {
		
		// Instanciando a classe pessoa
		Pessoa joao = new Pessoa();
		Pessoa maria = new Pessoa();
		
		joao.genero = 'M';
		joao.idade = 44;
		
		maria.genero = 'F';
		maria.idade = 17;


		System.out.println("Jo�o tem o g�nero \'" + joao.genero + "\' e tem " + joao.idade + " anos.");
		System.out.println("Maria tem o g�nero \'" + maria.genero + "\' e tem " + maria.idade + " anos.");
		System.out.println("\n------------------------------------");
		
		// Atribuição entre objetos distintos
		joao = maria;
		System.out.println("\nJo�o tem o g�nero \'" + joao.genero + "\' e tem " + joao.idade + " anos.");
		System.out.println("\n------------------------------------\n");
		
		// Atruibuião valores a atrituos de um objeto
		joao.genero = 'M';
		System.out.println("Jo�o tem o g�nero \'" + joao.genero + "\' e tem " + joao.idade + " anos.");
		System.out.println("Maria tem o g�nero \'" + maria.genero + "\' e tem " + maria.idade + " anos.");
		System.out.println("\n------------------------------------\n");

		maria.idade = 50;
		maria.genero = 'F';
		System.out.println("Jo�o tem o g�nero \'" + joao.genero + "\' e tem " + joao.idade + " anos.");
		System.out.println("Maria tem o g�nero \'" + maria.genero + "\' e tem " + maria.idade + " anos.");
		System.out.println("\n------------------------------------");
	}
}