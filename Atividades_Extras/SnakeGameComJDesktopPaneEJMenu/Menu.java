package Atividades_Extras.SnakeGameComJDesktopPaneEJMenu;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

	/*
		Nossa aplica��o ser� do tipo mdi.
		Aplica��es MDI abrem todas as telas do sistema dentro de uma �nica janela, tornando a aplica��o mais organizada.
		Para isso utilizaremos, al�m do JFrame, o JDesktopPane e o JInternalFrame.
		Fonte -> https://www.vivaolinux.com.br/artigo/Java-Usando-JInternalFrame-de-forma-elegante
	 */

public class Menu extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	//cria barra de menu                            
	private JMenuBar     jmPrincipal   = new JMenuBar();

	private TelaInstrucoes telaInstrucoes;
	private TelaJogo telaJogo;

	// Cria menu "cadastro" na barra de menu
	private JMenu        jmJogo        = new JMenu("Snake Game");
	private JMenu        jmInstrucoes  = new JMenu("Instru��es");
	private JMenu        jmSair        = new JMenu("Sair");

	//cria item "cliente" dentro do menu "cadastro"
	private JMenuItem    jmNovoJogo    = new JMenuItem("Novo Jogo");
	private JMenuItem    jmRegras      = new JMenuItem("Regras do jogo");
	private JMenuItem    jmSairSistema = new JMenuItem("Sair do Sistema");

	// Setando o background da Janela Menu
	ImageIcon icon = new ImageIcon(this.getClass().getResource("fundo.jpg"));
	Image img = icon.getImage();

	//cria objeto jdPane, do tipo JDesktopPane. Ele vai dentro d JFrame
	public JDesktopPane jdPane = new JDesktopPane() {

		private static final long serialVersionUID = 1L;

		public void paintComponent(Graphics g) {
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
	};

	//m�todo main instancia o objeto menu A inicializa��o fica com o construtor da classe
	public static void main(String args[]) {
		Menu menu = new Menu();
	}

	// Construtor
	public Menu() {
		// Pega o conte�do do painel - adiciona o jDesktopPane ao JFrame (janela principal)
		getContentPane().add(jdPane);

		//adiciona o MENU cadastro � barra de menus (jmPrincipal)
		jmPrincipal.add(jmJogo);
		jmPrincipal.add(jmInstrucoes);
		jmPrincipal.add(jmSair);

		//adiciona o ITEM cliente ao menu cadastro
		jmJogo.add(jmNovoJogo);
		jmInstrucoes.add(jmRegras);
		jmSair.add(jmSairSistema);

		//"ajusta" a barra de menu dentro da janela principal
		setJMenuBar(jmPrincipal);

		//adiciona actionlistener aos itens de menu para que os eventos sejam tratados.
		jmNovoJogo.addActionListener(this);
		jmRegras.addActionListener(this);
		jmSairSistema.addActionListener(this);

		// Configurando as propriedades da Janela
		setTitle("Snake Game");
		setSize(800,600);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/*
		ALTERANDO O �CONE DA JANELA
		-> https://www.programcreek.com/java-api-examples/?class=javax.swing.JFrame&method=setIconImage
		-> http://www.java2s.com/Code/JavaAPI/javax.swing/JFramesetIconImageImageimage.htm
		 */
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));

		//

		// Ser� habilitado por ultimo. Assim ele s� mostrar� a tela quando terminar de cri�-la, evitando muitos erros e comportamentos indesej�veis.
		setVisible(true);

	}

	/* M�todo para centralizar as jInternalFrameSize
 		Fonte -> http://javaaberto.blogspot.com/2013/09/como-centralizar-um-jinternalframe-em.html
	*/
	
	private void centralizaForm(JInternalFrame frame) {
		Dimension desktopSize = jdPane.getSize();
		Dimension jInternalFrameSize = frame.getSize();
		frame.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
				(desktopSize.height - jInternalFrameSize.height) / 2);
	}

	@Override
	//tratamento dos eventos de menu
	public void actionPerformed(ActionEvent evt) {

		/*
		 	Realiamos um teste l�gico para descobrir invocada ainda n�o foi criada (se seu valor for null, ela ainda n�o existe).
		 	Caso a tela n�o exista, ela � criada atrav�s da instancia��o de um objeto, mas se a tela j� existir, ela � apenas movida
		 	para frente, com o uso da fun��o 'jdPane.moveToFront()'.
		 */

		// Se o evento capturado for uma chamada vinda do item "Novo Jogo"...
		if (evt.getSource() == jmNovoJogo) {
			//se n�o for null, a tela j� est� vis�vel, tendo apenas que ser "levada pra frente"
			if (telaJogo == null) {
				//instancia a tela de cadastro de clientes
				telaJogo = new TelaJogo("Novo Jogo", this);
			}
			//independente da tela estar vis�vel ou n�o, a tela � movida para frente
			jdPane.moveToFront(telaJogo);
			centralizaForm(telaJogo);
		}

		// Se o evento capturado for uma chamada vinda do item "Instru��es"...
		if (evt.getSource() == jmRegras) {
			//se n�o for null, a tela j� est� vis�vel, tendo apenas que ser "levada pra frente"
			if (telaInstrucoes == null) {
				//instancia a tela de cadastro de Instru��es
				telaInstrucoes = new TelaInstrucoes("Tela instru��es", this);
			}
			jdPane.moveToFront(telaInstrucoes);
			centralizaForm(telaInstrucoes);
		}

		// Se o evento capturado for uma chamada vinda do item "Sair"...
		if (evt.getSource() == jmSairSistema) {
			// Saindo do sistema
			System.exit(0);
		}
	}

}
