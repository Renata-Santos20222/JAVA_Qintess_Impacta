package Capitulo_14._05_UtilizandoLambdaSemParenteses;

public class ExecutandoFunc3 {

	public static void main(String[] args) {

		// Utilizando de express�o lambda sem par�metro
		ExemploFuncional3 funcao = elemento -> Math.sqrt(elemento);
		
		double resultado = funcao.oMetodo(144);
		System.out.println("Resultado: " + resultado);
		
	}

}
