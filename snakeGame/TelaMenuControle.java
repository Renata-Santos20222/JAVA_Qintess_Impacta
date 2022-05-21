package snakeGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Classe para controlarmos os eventos dos bot�es dispon�veis no Menu, acionados pelo usu�rio.
public class TelaMenuControle implements ActionListener{
	
	/*
		O que s�o listeners e ActionListener
		O usu�rio poder� utilizar� os bot�es dispon�veis na classe Menu e atrav�s do ActionListener saberemos qual dos bot�es foi acionado, disparando uma resposta apropriada.
		-> Fonte: https://www.devmedia.com.br/java-listeners-trabalhando-com-actionlistener-e-keylistener-em-java/31850
	*/

	// Criando uma vari�vel objeto do tipo TelaMenu
	private static TelaMenu telaMenu;
	
	/*
		Construtor
		Dentro do construtor recebemos um objeto do tipo Menu para podermos ter controle sobre ele
	*/
	public TelaMenuControle(TelaMenu telaMenu) {
		TelaMenuControle.telaMenu = telaMenu;
	}
	
	// M�todo respons�vel por voltar ao MENU
	public static void mostrarMenu() {
		telaMenu.setVisible(true);
	}

	// Construtor da actionPerformed para os bot�es da tela de MENU
	public void actionPerformed(ActionEvent e) {

		// Verificando qual bot�o foi clicado
		if (e.getSource() == telaMenu.getNovoJogo()) {
			// Inicia novo jogo();
			new TelaJogo();
			telaMenu.setVisible(false);
		}
		else if (e.getSource() == telaMenu.getInstrucoes()) {
			// Iniciando a tela Instru��es e fechando a tela Menu
			new TelaInstrucoes();
			telaMenu.setVisible(false);
		}
		else if (e.getSource() == telaMenu.getSair()) {
			// Sa�da do jogo
			System.exit(0);
		}
		
	}

}
