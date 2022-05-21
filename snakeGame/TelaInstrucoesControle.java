package snakeGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInstrucoesControle implements ActionListener{
	
	private TelaInstrucoes telaInstrucoes;

	// Construtor
	public TelaInstrucoesControle(TelaInstrucoes telaInstrucoes) {
		super();
		this.telaInstrucoes = telaInstrucoes;
	}

	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == telaInstrucoes.getVoltar()) {
			// Mostrar a tela
			TelaMenuControle.mostrarMenu();
			
			// Ap�s mostrar a tela do MENU � que podemos fechar a tela de INSTRUCOES.
			telaInstrucoes.dispose();
		}
		
	}

}
