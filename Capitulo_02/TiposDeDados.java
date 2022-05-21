package Capitulo_02;

public class TiposDeDados {
	
	//Exemplos de Enum
	public enum DiaDaSemana{SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;}

	public static void main(String[] args) {

		// Tipos de dados primitivos
		/*
		 * Java � uma linguagem fortemente tipada
		 * H� duas categorias de tipos em Java:
		 * -> Tipos primitivos: Incluem tipos num�ricos (byte, short, int, long, float e double), textuais (char) e booleanos (boolean).
		 * -> Tipos de refer�ncia: Os valores desse tipo s�o refer�ncias a objetos. Os tipos de refer�ncia incluem tipos de classe, de interface e de array.
		*/
		
		// Literais
		/*
		 * Um literal � uma representa��o, em c�digo-fonte, de um valor fixo. Eles n�o
		 * necessitam de nenhuma opera��o computacional para serem representados,
		 * isso acontece de forma direta no c�digo. Os literais podem ser atribu�dos a
		 * vari�veis de um tipo primitivo, como mostra o seguinte exemplo:
		 */
		byte b = 100;
		short s = 100;
		int i = 100;
		long l = 922345678;
		float f = 0.12F;
		double d = 1.32;
		char c = 'M';
		boolean bo = true;
		
		System.out.println("Byte a = " + b);
		System.out.println("short s = " + s);
		System.out.println("int i = " + i);
		System.out.println("long l = " + l);
		System.out.println("float f = " + f);
		System.out.println("double d = " + d);
		System.out.println("char c = " + c);
		System.out.println("boolean bo = " + bo);
		
		// ENUM
		DiaDaSemana diaBom = DiaDaSemana.SABADO;
		System.out.println("\nDia bom � o: " + diaBom.name());
	}

}
