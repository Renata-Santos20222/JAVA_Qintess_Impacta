package Capitulo_15._01_TiposGenericos;

public class CacheGenerico<T> {
	
	/*
		Indica um atributo gen�rico, T � um par�metro de generaliza��o
		E�> Element; K�> Key; N�> Number; T�> Type e V�> Value.
	 */
	private T valor;
	
	// M�todos acessores
	public T getValor() {
		return valor;
	}
	
	public void setValor(T valor) {
		this.valor = valor;
	}

}
