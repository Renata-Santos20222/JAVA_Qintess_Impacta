package SWING._06_JLabels_Imagens;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Icon; 
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Rotulo extends JFrame{
	private JLabel label;

	public Rotulo(){
		super("Usando r�tulos em JFrame");

		Icon xicara = new ImageIcon("src/SWING/xicara.png");
		
		/*
 			Para usar JLabel com Icon e String, precisamos usar o conceito de alinhamento.
			Existem dois tipos: o horizontal e o vertical.
			Todos essas posi��es s�o n�meros inteiros, mas n�o precisamos nos preocupar com tais valores.
			
			Para isso, vamos usar as constantes da SwingConstants:
			import javax.swing.SwingConstants; 
			
			Na horizontal, existem as posi��es:
			SwingConstants.LEFT, SwingConstants.CENTER e SwingConstants.RIGHT
			
			Na vertical, existem as posi��es:
			SwingConstants.TOP, SwingConstants.CENTER e SwingConstants.BOTTOM
			
			O construtor do JLabel recebe um inteiro que representa o alinhamento horizontal.
			Ou seja, se o Label vai ficar na esquerda, no centro ou na direita.
			
			O outro tipo de alinhamento � o vertical, que vai definir de se o JLabel vai ficar em cima, no meio ou na parte de baixo do frame.
			Para mudarmos o alinhamento vertical, usamos o m�todo: setVerticalAlignment
			Esse m�todo recebe uma das tr�s constantes: SwingConstants.TOP, SwingConstants.CENTER e SwingConstants.BOTTOM
			
			Um outro conceito que devemos saber � o da posi��o da String e da Imagem.
			Se voc� pensar, pode ser que queiramos a imagem em cima do texto, embaixo ou ao lado.
			
			Para ter controle desse posicionamento, existem dois m�todo: 
			setHorizontalTextPosition -> define a posi��o do texto, na horizontal (se vai ficar a esquerda ou direita da imaagem)
			setVerticalTextPosition -> define a posi��o do texto, na vertical (se o texto vai ficar abaixo ou acima da imagem)
			
			Para definir o alinhamento horizontal no centro, podemos passar a constante j� no construtor:
			label = new JLabel("S�mbolo do Java", xicara, SwingConstants.CENTER);
			
			Para que a posi��o do texto seja centralizada, fazemos:
			label.setHorizontalTextPosition( SwingConstants.CENTER );
			
			E finalmente, se eu quiser que o texto fiquei abaixo da imagem, fazemos:
			label.setVerticalTextPosition(SwingConstants.BOTTOM);
		*/
		
		label=new JLabel("S�mbolo do Java", xicara, SwingConstants.CENTER);
		label.setHorizontalTextPosition( SwingConstants.CENTER );
		label.setVerticalTextPosition( SwingConstants.BOTTOM );

		add(label);

	}
}