package Capitulo_14._03_UtilizandoLambdaComParametros;

public class ExecutandoFunc1 {

	public static void main(String[] args) {

		// Utilizando de express�o lambda
		ExemploFuncional1 dados = (nome, idade, salario) -> System.out.println("Parab�ns " + nome.toUpperCase() + " pelos seus " + idade + " anos de vida! Seu novo sal�rio �: " + salario);
		
		dados.exibeDados("Coisinha", 40, 5550.230);
		
	}

}
