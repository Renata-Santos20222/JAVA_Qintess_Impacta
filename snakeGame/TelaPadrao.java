package snakeGame;

import java.awt.Toolkit;
import javax.swing.JFrame;

	/*
		A classe Board representa o display (a tela do jogo). � uma matriz de c�lulas.
		Possui um m�todo de gera��o de alimentos que gera o alimento em uma posi��o aleat�ria.
	*/

	public class TelaPadrao extends JFrame{
		
		/*
			Esse � um atributo utilizado para controlar explicitamente a compatibilidade entre o .class usado para serializar e o .class que ser� utilizado na desserializa��o.
 			Fonte -> https://blog.algaworks.com/serialversionuid/
		*/
		private static final long serialVersionUID = 1L;

		// Construtor de Board
		public TelaPadrao() {
			
			/* SETANDO O T�TULO DA JANELA (JFrame).
 				Uma vez que voc� tenha um objeto JFrame v�lido (esta classe extende JFrame), voc� pode chamar o m�todo setTitle da classe JFrame
			   -> Fonte: https://alvinalexander.com/java/jframe-title-set/
			*/
			setTitle("Snake Game");
			
			/* SETANDO O TAMANHO DA JANELA (JFrame)
				setSize - Redimensiona este componente para que tenha largura w e altura h.
				Os valores de largura e altura s�o ampliados automaticamente se um deles for menor que o tamanho m�nimo especificado pela chamada anterior para setMinimumSize.
				-> Fonte: https://alvinalexander.com/java/java-set-jframe-size/
				
				***** Poderia ter sido utilizado setPreferredSize *****
						Define o tamanho preferencial deste componente para um valor CONSTANTE.
						As chamadas subsequentes para getPreferredSize sempre retornar�o esse valor.
						Definir o tamanho preferencial como nulo restaura o comportamento padr�o.
		 	*/
			setSize(640, 480);
			
			/* A tela do menu � quem fechar� o sistema, atrav�s do bot�o FECHAR.
			   As outras duas telas poder�o ser fechadas sem fechar o sistema.

				O m�todo 'setDefaultCloseOperation()' � usado para especificar uma das v�rias op��es para o bot�o Fechar.
				Use uma das seguintes constantes para especificar sua escolha:
				JFrame.EXIT_ON_CLOSE       � Saia do aplicativo.
				JFrame.HIDE_ON_CLOSE       � Oculta o quadro, mas mant�m o aplicativo em execu��o.
				JFrame.DISPOSE_ON_CLOSE    � Descarte o objeto frame, mas mantenha o aplicativo rodando.
				JFrame.DO_NOTHING_ON_CLOSE � Ignora o clique. 
				-> Fonte: https://chortle.ccsu.edu/java5/notes/chap56/ch56_9.html
				
				*** setUndecorated(true); -> remove toda a barra de bot�es do jframe***
			*/
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			
			/* CENTRALIZANDO A TELA DO JOGO
				Define a localiza��o da janela em rela��o ao componente especificado de acordo com os cen�rios a seguir:
				A tela de destino mencionada abaixo � uma tela na qual a janela deve ser colocada ap�s o m�todo setLocationRelativeTo ser chamado.
				
				Se o componente for null, ou o GraphicsConfigurationassociado a este componente for null, a janela ser� colocada no centro da tela. O ponto central pode ser obtido com o GraphicsEnvironment.getCenterPointm�todo.
				Se o componente n�o for null, mas n�o estiver sendo exibido no momento, a janela ser� colocada no centro da tela de destino definida pelo GraphicsConfigurationassociado a este componente.
				Se o componente n�o estiver nulle for exibido na tela, a janela estar� localizada de forma que o centro da janela coincida com o centro do componente.
				Fonte -> https://docs.oracle.com/javase/7/docs/api/java/awt/Window.html#setLocationRelativeTo(java.awt.Component)
			*/
			setLocationRelativeTo(null);
			
			/*
			 	** Esse m�todo altera as informa��es relacionadas ao layout e, portanto, invalida a hierarquia do componente! **
				Se o layout for �null� os componentes da sua tela v�o ser �independentes� e sua posi��o vai depender somente do m�todo setBounds.
				Ou seja, os componentes dever�o ter suas posi��es setadas pelo m�todo setBounds.
				-> https://docs.oracle.com/javase/7/docs/api/javax/swing/JFrame.html#setLayout(java.awt.LayoutManager)
				-> https://docs.oracle.com/javase/7/docs/api/javax/swing/RootPaneContainer.html
				-> https://docs.oracle.com/javase/tutorial/uiswing/layout/none.html
				-> https://www.guj.com.br/t/sobre-o-metodo-setlayout/234687/3
			*/
			setLayout(null);
			
			/*
			 	Um m�todo para garantir que uma interface gr�fica tenha a apar�ncia desejada � impedir que o usu�rio a redimensione, usando este m�todo de JFrame:
				   ** public void setResizable(boolean redimension�vel) **
				-> https://chortle.ccsu.edu/java5/notes/chap62/ch62_2.html
			*/
			setResizable(false);
			
			/*
				ALTERANDO O �CONE DA JANELA
				-> https://www.programcreek.com/java-api-examples/?class=javax.swing.JFrame&method=setIconImage
				-> http://www.java2s.com/Code/JavaAPI/javax.swing/JFramesetIconImageImageimage.htm
			*/
			SetIcon();
		}
		
		private void SetIcon() {
			setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("img/icon.png")));
	    }
		
	}