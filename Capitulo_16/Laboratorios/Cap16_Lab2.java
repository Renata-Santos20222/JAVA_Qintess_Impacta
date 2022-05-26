package Capitulo_16.Laboratorios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Cap16_Lab2 {

	final static String PASTA_ORIGEM = "Src\\Capitulo_16\\Laboratorios\\Mp3";
	final static String PASTA_BACKUP = "src\\Capitulo_16\\Laboratorios\\Backup";

	public static void main(String[] args) {

		// Setandos as vari�veis de path
		Path origem = Paths.get(PASTA_ORIGEM);
		Path backup = Paths.get(PASTA_BACKUP);
		
		try {
			
			// M�todos para manipular diret�rios e arquivos
			if (!Files.exists(backup)) {
				System.out.println("O diret�rio 'backup' n�o existe!\n Criando diret�rio 'backup', aguarde.....");
				
				// Criando o diret�rio backup
				Files.createDirectory(backup);

			}
			
			// Criando a vari�vel streamOrigem
			Stream<Path> streamOrigem = Files.list(origem);
			
			streamOrigem.forEach(p -> {
				try {
					Files.copy(p, backup.resolve(p.getFileName()));
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			});
			
			streamOrigem.close();
		
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
