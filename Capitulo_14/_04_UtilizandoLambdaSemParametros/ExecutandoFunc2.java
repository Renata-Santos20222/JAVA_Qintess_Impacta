package Capitulo_14._04_UtilizandoLambdaSemParametros;

public class ExecutandoFunc2 {

	public static void main(String[] args) {

		// Utilizando de express�o lambda sem par�metro
		ExemploFuncional2 funcao = () -> System.out.println("Ol� munda do Java Funcional!");
		funcao.exibeDados();
		
	}

}
