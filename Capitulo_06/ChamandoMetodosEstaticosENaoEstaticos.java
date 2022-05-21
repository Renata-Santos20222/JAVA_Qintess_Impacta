package Capitulo_06;

public class ChamandoMetodosEstaticosENaoEstaticos {
	
	// Declarando um m�todo dentro da classe
	static void novoEstatico() {
		System.out.println("Este conte�do est� declarado no m�todo da classe principal");
	}

	public static void main(String[] args) {

		// Chamando o m�todo est�tico sem instanci�-lo
		MetodosEstaticosEMetodosNaoEstaticos.metodoEstatico();
		
		// Chamando o m�todo n�o est�tico (necess�rio instanci�-lo)
		new MetodosEstaticosEMetodosNaoEstaticos().metodoNaoEstatico();
		
		// Chamando o m�todo declarado na mesma classe
		novoEstatico();
		
	}
}