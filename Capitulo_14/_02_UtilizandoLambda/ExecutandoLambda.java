package Capitulo_14._02_UtilizandoLambda;

public class ExecutandoLambda {

	public static void main(String[] args) {

		// Implementando a opera��o a ser realizada atrav�s de uma express�o lambda
		OperacaoAritimetica operacao = (x, y) -> x +y;
		
		// Realizando a soma
		double result = operacao.execute(15.8, 8.3);
		
		System.out.println(result);
		
	}

}
