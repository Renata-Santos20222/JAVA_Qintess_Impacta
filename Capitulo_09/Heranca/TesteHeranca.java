package Capitulo_09.Heranca;

public class TesteHeranca {

	public static void main(String[] args) {

		/*
		// Instanciando a classe
		Programador junior = new Programador("M�rio", "mario@gmail.com", "Java", "Linux / Windows");
		
		// fazendo uso do objeto
		junior.exibir();
		*/
		
		Estagiario estagiario = new Estagiario("Jos�", "Este � o meu relat�rio", "O total de horas totalizam 370", 5.300);
		estagiario.dadosEstagiario();

	}

}
