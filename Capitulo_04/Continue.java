package Capitulo_04;

public class Continue {

	public static void main(String[] args) {

		int num = 0;
		while(num < 10) {
			++num;
			if (num == 5) {
				// O comando 'continue' far� com o que o programa v� diretamente para o teste da condi��o (while neste caso)
				System.out.println("------------------");
				continue;
			}
			System.out.println("O valor de num = " + num);
		}
	}

}
