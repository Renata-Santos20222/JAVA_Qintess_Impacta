package SWING._05_JLabels_Texto;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Rotulo extends JFrame{
	private JLabel texto;

	public Rotulo(){
		super("Usando r�tulos em JFrame");

		texto = new JLabel("Meu primeiro JLabel!");
		add(texto);
	}
}