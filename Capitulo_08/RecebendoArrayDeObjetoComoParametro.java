package Capitulo_08;

public class RecebendoArrayDeObjetoComoParametro {

	public static void main(String[] args) {

		PassandoArrayDeObjetoComoParametroNoArray usuarioInfo = new PassandoArrayDeObjetoComoParametroNoArray("Jo�o");
		
		PassandoArrayDeObjetoComoParametroNoArray novosUsuarios[] = {usuarioInfo, new PassandoArrayDeObjetoComoParametroNoArray("Maria"), new PassandoArrayDeObjetoComoParametroNoArray("Jos�")};
		
		for (PassandoArrayDeObjetoComoParametroNoArray x : novosUsuarios) {
			System.out.print(x.getNome() + " || ");
		}

	}

}
