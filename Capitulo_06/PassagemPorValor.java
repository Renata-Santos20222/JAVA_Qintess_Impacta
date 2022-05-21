package Capitulo_06;

public class PassagemPorValor {
	
	static void alterarValor(int valor) {
		valor = 137;
	}
	
	static void alterarReferenciaObjeto(Pessoa p) {
		Pessoa ana = new Pessoa();
		ana.nome = "Ana";
		ana.sexo = 'F';
		ana.idade = 18;
		p = ana;
	}
	
	static void alterarConteudoObjeto(Pessoa p) {
		p.nome = "Jo�o";
		p.sexo = 'M';
		p.idade = 20;
	}

	public static void main(String[] args) {

		int valor = 1500;
		
		// Tentativa de alterar o VALOR
		System.out.println("Antes da chamado do m�todo alterarvalor � " + valor);
		alterarValor(valor);
		System.out.println("Ap�s a chamada do m�todo alterarValor � " + valor + "\n");

		Pessoa maria = new Pessoa();
		maria.nome = "Maria";
		maria.sexo = 'F';
		maria.idade = 50;
		
		// Tentativa de alterar a REFER�NCIA do objeto
		System.out.println("Valores antes da chamada do m�todo \'alterarReferenciaObjeto\'");
		maria.exibirDados();
		
		alterarReferenciaObjeto(maria);
		System.out.println("\nValores depois da chamada do m�todo \'alterarReferenciaObjeto'");
		maria.exibirDados();
		
		// Alterando o CONTE�DO do objeto
		System.out.println("\nValores antes da chamada do m�todo \'alterarConteudoObjeto'");
		maria.exibirDados();
		
		alterarConteudoObjeto(maria);
		System.out.println("\nValores depois da chamada do m�todo \'alterarConteudoObjeto'");
		maria.exibirDados();
	}

}
