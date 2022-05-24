package Capitulo_15._02_List;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {

		// Definindo uma List
		List<String> paises = new ArrayList<>();
		
		// Inserindo dados na cole��o
		paises.add("Brasil");
		paises.add("Portugal");
		paises.add("Estados Unidos");
		paises.add("Fran�a");
		paises.add("Inglaterra");
		paises.add(2, "It�lia");
		
		// Exibindo valores
		System.out.println("Paises na ordem original:");
		paises.forEach(pais -> System.out.println(" - " + pais));
		
		System.out.println("\n---------------------------------------------------------------\n");
		
		// Verifica se o ArrayList contem 'Estados Unidos'
		System.out.println("Estados Unidos est� no ArrayList: " + paises.contains("Estados Unidos"));
		
		System.out.println("\n---------------------------------------------------------------\n");
		
		// Imprimindo uma determinada posi��o do ArrayList
		System.out.println("O pa�s que est� na posi��o 2 do ArrayList �: " + paises.get(2));
		
		System.out.println("\n---------------------------------------------------------------\n");
		
		// Imprimindo a posi��o do pa�s 'Fran�a'
		System.out.println("A Fran�a est� na posi��o " + paises.indexOf("Fran�a") + " do ArrayList");
		
		System.out.println("\n---------------------------------------------------------------\n");
		
		// Verificando o tamanho do ArrayList
		System.out.println("O tamanho do ArrayList � de " + paises.size() + " posi��es.");
		
		System.out.println("\n---------------------------------------------------------------\n");
		
		// Substituindo todos os elementos do ArrayLista para mai�culo
		paises.replaceAll(s -> s.toUpperCase());
		
		// Reordenando toda a lista utilizando a ordem natural de Strings
		paises.sort((x, y) -> x.compareTo(y));
		
		System.out.println("Pa�ses ordenados e em mai�sculo:");
		paises.forEach(pais -> System.out.println(paises.indexOf(pais) + " -> " + pais));
	}

}
