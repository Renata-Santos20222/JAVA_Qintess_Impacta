package Capitulo_15._07_Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemploStream2 {

	public static void main(String[] args) {

		// Cria uma lista vazias de funcion�rios
		List<Colaborador> listaColab = new ArrayList<>();
		
		// Adicionando funcion�rios a lista
		listaColab.add(new Colaborador(3018, "Joaquim Batista", "Desenvolvedor", 5500.0));
		listaColab.add(new Colaborador(1045, "Maria das Dores", "Analista", 6250.0));
		listaColab.add(new Colaborador(1780, "Jo�o Ricardo", "Desenvolvedor", 7100.0));
		listaColab.add(new Colaborador(5200, "Ana Maria", "Vendedor", 4100.0));
		listaColab.add(new Colaborador(3999, "Robson Gusm�o", "Analista", 6500.0));
		listaColab.add(new Colaborador(2389, "Eduardo Alves", "Desenvolvedor", 3200.0));
				
		// Executando sucessivas opera��es com os dados da lista
		listaColab.stream()
			.sorted(Comparator.comparing(Colaborador::getSalario)
			.reversed())
			
			.limit(3)

			.forEach(System.out::println);
	}

}
