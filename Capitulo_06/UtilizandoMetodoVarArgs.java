package Capitulo_06;

public class UtilizandoMetodoVarArgs {

	public static void main(String[] args) {
		
		// Instanciando o m�todo 'CriandoMetodoVarArgs
		CriandoMetodoVarArgs metodo = new CriandoMetodoVarArgs();

		// Declarando o array para que guardar� os argumentos para serem enviados ao m�todo
		int[] argumentos = new int[5];
		
		// Percorrendo o array
		for (int i = 0; i < argumentos.length; i++) {
			int j = i + 3;
			argumentos[i] = j;
		}
		
		// Chamando o m�todo e passando a vari�vel 'argumentos' como par�metro
		int resultado = metodo.calcular(argumentos);
		
		// Impress�o do resultado
		System.out.println("O resultado = " + resultado);
		
		// Chamando o m�todo e passando a vari�vel 'argumentos' como par�metro
		int soma = metodo.contar(argumentos);
		
		// Impress�o da soma
		System.out.println("\nA soma = " + soma);

	}
}