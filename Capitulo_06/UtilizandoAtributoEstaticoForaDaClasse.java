package Capitulo_06;

import Capitulo_06.TestandoChamadaAtributoStatic.ModificadorDeAtributosStaticos;

public class UtilizandoAtributoEstaticoForaDaClasse {

	public static void main(String[] args) {

		ModificadorDeAtributosStaticos x = new ModificadorDeAtributosStaticos();
		ModificadorDeAtributosStaticos y = new ModificadorDeAtributosStaticos();
		ModificadorDeAtributosStaticos z = new ModificadorDeAtributosStaticos();
		
		x.ano = 2022;
		System.out.println("O Valor declarado na classe �: " + x.ano);
		
		y.ano = 1992;
		System.out.println("O Valor declarado na classe �: " + y.ano);
		
		z.ano = 1893;
		System.out.println("O Valor declarado na classe �: " + z.ano);
		
		System.out.println("\n----------------------------------------\n");
		
		System.out.println("O Valor declarado na classe �: " + x.ano);
		System.out.println("O Valor declarado na classe �: " + y.ano);
		System.out.println("O Valor declarado na classe �: " + z.ano);
		
	}
}
