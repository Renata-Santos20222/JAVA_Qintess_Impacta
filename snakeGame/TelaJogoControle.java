package snakeGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

	/*
		Esta classe controla o layout da tela do jogo, dividida em TelaJogoPanel (onde o jogo ocorrer�) e TelaJogoStatus (onde exibiremos a pontua��o do jogo).
	*/

public class TelaJogoControle implements KeyListener, ActionListener{
	
	// Variavel referente a tela que esta classe ir� controlar
	private TelaJogo telaJogo;
	
	// Constructor
	public TelaJogoControle (TelaJogo telaJogo) {
		super();
		this.telaJogo = telaJogo;
		
		// Adicionando o evento VOLTAR MENU � TELA
		this.telaJogo.getStatusPanel().getVoltar().addActionListener(this);
		this.telaJogo.getStatusPanel().getReiniciarJogo().addActionListener(this);
	}
	
	// M�todo voltar para MENU
	private void voltarMenu() {
		
		// Primeiro paramos o jogo
		stop();
		
		// Depois voltamos para o MENU
		TelaMenuControle.mostrarMenu();
		
		// Setando a TELA DO JOGO invis�vel
		this.telaJogo.setVisible(false);
		
		// E por �ltimo fechamos a TELA DO JOGO
		this.telaJogo.dispose();
	}
	
	// M�todo para pausar o jogo
	public void stop(){
		// https://www.youtube.com/watch?v=vnaWcW3FjCk&list=PLkuVnkpH5-p9UnZqbQvi8alnO6gbKBUu4&index=10
		// Tempo 13:19
	}

	/*
	   Quando o usu�rio pressiona uma tecla ( em nosso caso as setas direcionais ).
	   Fonte -> https://docs.oracle.com/javase/7/docs/api/java/awt/event/KeyListener.html
	         -> https://www.guj.com.br/t/como-utilizar-o-keypressed/80324/3
	*/
	@Override
	public void keyPressed(KeyEvent e) {
	}

	// NA� UTILIZAREMOS (Usu�rio fazendo uma digita��o)
	@Override
	public void keyTyped(KeyEvent e) {}

	// N�O UTILIZAREMOS (Soltou a tecla)
	@Override
	public void keyReleased(KeyEvent e) {}

	/*
		Quando o bot�o 'Voltar' for acionado este ser� detectado e o m�todo VOLTARMENU ser� acionado.
		OU
		Quando acionado o bot�o 'Novo Jogo' a classe TelaJogo ser� reiniciada.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() ==  this.telaJogo.getStatusPanel().getVoltar()) {
			voltarMenu();
		}
		if(e.getSource() ==  this.telaJogo.getStatusPanel().getReiniciarJogo()) {
			new TelaJogo();
		}
	}

}
