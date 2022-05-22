package Capitulo_11;

public class ExececoesEncadeadas {
	
	public static void main(String[] ars) {
		try {
			metodo1();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	// 1� m�todo
	public static void metodo1() throws Exception {
		try {
			// Chamando o m�todo 2
			metodo2();
		}
		catch(Exception e) {
			throw new Exception("Exce��o descrita no 1� m�todo!");
		}
	}

	// 2� m�todo
	public static void metodo2() throws Exception {
		throw new Exception("Exce��o descrita no 2� m�todo!");
	}
	
}