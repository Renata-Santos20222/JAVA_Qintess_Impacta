package Capitulo_16._03_Path;

// Importando os recursos necess�rios
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExemploSetandoUmPath {

	public static void main(String[] args) {

		/*
			Setando um path
			Este 'caminho' pode existir ou n�o porque n�o o criamos aqui
		*/
		Path poema = Paths.get("resources\\poema.txt");
		
		// Exibindo o caminho especificado pelo path
		System.out.println(poema);
		
		// Exibindo o caminho completo do path a partir da raiz
		System.out.println(poema.toAbsolutePath());
		
		// Exibindo apenas o nome do arquivo
		System.out.println(poema.getFileName());
		
		// Exibindo o caminho completo do diret�rio pai
		System.out.println(poema.getParent().toAbsolutePath());

	}

}
