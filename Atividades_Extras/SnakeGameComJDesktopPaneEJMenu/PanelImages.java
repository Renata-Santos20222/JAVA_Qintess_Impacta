package Atividades_Extras.SnakeGameComJDesktopPaneEJMenu;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelImages extends JPanel{

	private static final long serialVersionUID = 1L;
	
	TelaInstrucoes telaInstrucoes;
	private Image imagem;
	
	// Construtor
	public PanelImages() {
		imagem = null;
	}
	
	public PanelImages(String nomeImagem) {
		if (nomeImagem != null){
			imagem = new ImageIcon(getClass().getResource(nomeImagem)).getImage();
		}
	}
	
	public void setImage(String nomeImagem) {
		if (nomeImagem != null){
			imagem = new ImageIcon(getClass().getResource(nomeImagem)).getImage();
		}
		else {
			imagem = null;
		}
		repaint();
	}
	
	public void paint(Graphics g) {
		if (imagem != null){
			// setBounds(x, y, width, height)
			JLabel lb1 = new JLabel("Tela de Instru��es");
			lb1.setFont(new Font("Arial", Font.BOLD, 40));
			lb1.setBounds(200, 25, 390, 40);
			
			JLabel lb2 = new JLabel("Instru��es: ");
			lb2.setFont(new Font("Arial", Font.BOLD, 20));
			lb2.setBounds(12, 130, 170, 22);
			
			JLabel lb3 = new JLabel("O objetivo do jogo � fazer a snake comer o m�ximo de frutas poss�veis. ");
			lb3.setFont(new Font("Arial", Font.PLAIN, 12));
			lb3.setBounds(12, 155, 522, 15);	
			
			JLabel lb4 = new JLabel("A snake n�o deve tocar nas bordas da janela ou em si mesma.");
			lb4.setFont(new Font("Arial", Font.PLAIN, 12));
			lb4.setBounds(12, 175, 522, 15);
			
			JLabel lb5 = new JLabel("Movimentos: ");
			lb5.setFont(new Font("Arial", Font.BOLD, 20));
			lb5.setBounds(12, 280, 170, 15);
			
			JLabel lb6 = new JLabel("Mova a snake utilizando as setas do teclado.");
			lb6.setFont(new Font("Arial", Font.PLAIN, 12));
			lb6.setBounds(12, 300, 240, 15);

			// Adicionando os bot�es
			add(lb1);
			add(lb2);
			add(lb3);
			add(lb4);
			add(lb5);
			add(lb6);
			
			g.drawImage(imagem, 400, 380, 260, 180, this);
			this.setOpaque(false);
		}
		else {
			setOpaque(true);
		}
		super.paint(g);
	}

}
