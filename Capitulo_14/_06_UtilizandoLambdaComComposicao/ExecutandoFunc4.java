package Capitulo_14._06_UtilizandoLambdaComComposicao;

public class ExecutandoFunc4 {

	public static void main(String[] args) {

		// Fazendo uma composi��o
		ExemploFuncional4 novosDados = (nome, idade, salario) -> {
			String nomeMaiusculo = nome.toUpperCase();
			if (idade < 18) {
				System.out.println("O colaborador " + nomeMaiusculo + " n�o pode ter menos que 18 anos.");
			}
			else{
				System.out.println("O colaborador " + nomeMaiusculo + " recebe o sal�rio " + salario + ".");
			}
		};
		
		novosDados.exibeDados("Sr. Batata", 45, 6500.85);

	}

}
