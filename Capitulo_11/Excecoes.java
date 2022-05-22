package Capitulo_11;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/*
	Fonte -> https://acervolima.com/excecoes-em-java/
	O que � uma exce��o?
	
	Uma exce��o � um evento indesejado ou inesperado, que ocorre durante a execu��o de um programa, ou seja, em tempo de execu��o, que interrompe o
	fluxo normal das instru��es do programa.
	
	Hierarquia de exce��o
	Todos os tipos de exce��o e erros s�o subclasses da classe Throwable , que � a classe base da hierarquia.
	Um ramo � encabe�ado por Exception.
	Esta classe � usada para condi��es excepcionais que os programas do usu�rio devem capturar.NullPointerException � um exemplo de tal exce��o.
	Outro ramo, Error, s�o usados pelo sistema de tempo de execu��o Java ( JVM ) para indicar erros relacionados ao pr�prio ambiente de tempo de execu��o (JRE).
	
	Como a JVM trata uma exce��o?
	Tratamento de exce��es padr�o: sempre que dentro de um m�todo, se uma exce��o ocorrer, o m�todo cria um objeto conhecido como Objeto de exce��o e o entrega
	ao sistema de tempo de execu��o (JVM).
	O objeto de exce��o cont�m o nome e a descri��o da exce��o e o estado atual do programa em que a exce��o ocorreu.
	Criar o Objeto de Exce��o e trat�-lo no sistema de tempo de execu��o � chamado de lan�amento de uma Exce��o.
	Pode haver a lista dos m�todos que foram chamados para chegar ao m�todo em que a exce��o ocorreu.
	Esta lista ordenada de m�todos � chamada Call Stack.
	A partir da� os seguintes procedimentos acontecer�o:
		1- O sistema de tempo de execu��o pesquisa a pilha de chamadas para encontrar o m�todo que cont�m o bloco de c�digo que pode manipular a exce��o ocorrida.
		   O bloco do c�digo � chamado de manipulador de exce��es.
		2- O sistema de tempo de execu��o come�a a pesquisar a partir do m�todo no qual a exce��o ocorreu, prossegue pela pilha de chamadas na ordem inversa em
		   que os m�todos foram chamados.
		3- Se encontrar o manipulador apropriado, ele passa a exce��o ocorrida para ele.
		   Manipulador apropriado significa que o tipo do objeto de exce��o lan�ado corresponde ao tipo do objeto de exce��o que ele pode manipular.
		4- Se o sistema de tempo de execu��o pesquisar todos os m�todos na pilha de chamadas e n�o conseguir encontrar o manipulador apropriado, o sistema de tempo
		   de execu��o transfere o Objeto de Exce��o para o manipulador de exce��o padr�o, que faz parte do sistema de tempo de execu��o.
		   Este manipulador imprime as informa��es de exce��o no formato a seguir e termina o programa de forma anormal.
*/

public class Excecoes {
	
	public static void main(String[] ars) throws IOException {
		
		int i;
		
		// Bloco try com catch (exception)
		try {
			i = 1/0;
			System.out.print(i);
		}
		catch (Exception e) {
			System.out.println(e);
			System.out.println("\nN�o � poss�vel dividir um inteiro por 0");
		}
		
		System.out.println("\n********************************************************************************\n");
		
		// Bloco try com catch (ArithmeticException e print e.printStackTrace)
		try {
			int x;
			x = 1/0;
			x = 2;
			System.out.print(x);
		}
		catch (ArithmeticException e) {
			System.out.println("Tratando a exce��o: ");
			e.printStackTrace();
		}
		
		System.out.println("Continua��o do c�digo.........");
		
		System.out.println("\n********************************************************************************\n");
		
		/* 
			Bloco try mas manipulando mais de uma Exception IOException e ArithmeticException
			catch (IOException | ArithmeticException ex) {
			O IOException foi levado para a assinatura da classe
			
			Uma outra explica��o -> https://www.devmedia.com.br/tratando-excecoes-em-java/25514
			Imagine uma situa��o em que n�o � desejado que uma exce��o seja tratada na pr�pria classe ou m�todo, mas sim em outro m�todo ou classe que venha lhe chamar.
			Para solucionar tal situa��o utilizamos o comando throws na assinatura do m�todo com a poss�vel exce��o que o mesmo poder� a vir lan�ar.
			Sintaxe: tipo_retorno nome_metodo() throws tipo_exce��o_1, tipo_exce��o_2, tipo_exce��o_n
			Na classe principal (main) poder�amos tratar a excess�o, por exemplo.
			public static void main(String args[]){
				try {
					aumentarLetras();
				}
				catch(NullPointerException e) {
					System.out.println("Ocorreu um NullPointerException ao executar o m�todo aumentarLetras() "+e);
				}
			}
		*/
		try {
			int x;
			x = 1/0;
			System.out.print(x);
		}
		catch (ArithmeticException ex) {
			System.out.println(ex);
		}
		
		System.out.println("\n********************************************************************************\n");
		
		// Bloco try com catch e finally
		File file = null;
		InputStream is = null;
		try {
			file = new File("arquivo.txt");
			System.out.println("Imagine que o arquivo foi encontrado e manipulado pelo sistema");
			System.out.println("\nDepois disso manipulamos o arquivo");
			System.out.println("Por�m ap�s a manipula��o o arquivo ainda est� aberto, gerando uma falha de seguran�a, desperd�cio de recusos, dentre outras.");
			System.out.println("\nO 'finally' pode ser utilizado para fechar o arquivo, por exemplo.\n");
		}
		/*
			O finally neste caso � utilizado para evitar deixar o arquivo aberto.
		*/
		finally {
			is.close();
		}
		
		System.out.println("Continua��o do c�digo.........");
		
		System.out.println("\n********************************************************************************\n");
		
	}

}
