package Capitulo_14._01_UtilizandoInterface;

	/*
		Esta � a 1� classe concreta que implementa a classe OperacaoAritimetica
		deve-se implementar o m�doto 'execute'
	*/
public class Soma implements OperacaoAritimetica{
	
	public double execute(double value1, double value2) {
		double result = value1 + value2;
		return result;
	}

}
