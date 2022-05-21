package snakeGame;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

	/*
		Esta tela ser� respons�vel por apresentar o status do jogo pontua��o atingida.
		Nesta tela ser� exibido um bot�o para voltar ao MENU.
	*/

public class TelaJogoStatus extends JPanel {

	private static final long serialVersionUID = 1L;
	
	TelaJogoPanel telajogopanel;
	
	// Declarando o bot�o reiniciar jogo
	private JButton reiniciarJogo;
	
	// Declarando o bot�o voltar
	private JButton voltar;
	
	// Declarando uma vari�vel que contar� quantas frutas a cobra alcan�ou e uma imagem da comida.
	private JLabel comida;
	private JLabel contador;
	private JLabel pontuacao;
	
	// Construtor
	public TelaJogoStatus() {
		
		// Setando a janela com nenhum layout porque esta tela n�o herda de BoardBase onde j� temos setado o setLayout(null)
		setLayout(null);
		
		// Instanciando o contador, o bot�o e a imagem
		comida = new JLabel();
		comida.setIcon(new ImageIcon("snakeGame/img/snakeStatus.png"));
		// setBounds(x, y, width, height)
		comida.setBounds(15, 165, 141, 99);
		
		reiniciarJogo = new JButton("Novo Jogo");
		reiniciarJogo.setBounds(10, 100, 120, 30);
		
		voltar = new JButton("Voltar");
		voltar.setBounds(30, 300, 80, 30);
		
		add(comida);
		add(reiniciarJogo);
		add(voltar);
	
}

	// M�todos acessores	
	public JButton getReiniciarJogo() {
		return reiniciarJogo;
	}

	public void setReiniciarJogo(JButton reiniciarJogo) {
		this.reiniciarJogo = reiniciarJogo;
	}

	public JButton getVoltar() {
		return voltar;
	}

	public void setVoltar(JButton voltar) {
		this.voltar = voltar;
	}
	
	public JLabel getComida() {
		return comida;
	}

	public void setComida(JLabel comida) {
		this.comida = comida;
	}

	public JLabel getContador() {
		return contador;
	}

	public void setContador(JLabel contador) {
		this.contador = contador;
	}

	public JLabel getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(JLabel pontuacao) {
		this.pontuacao = pontuacao;
	}

}
