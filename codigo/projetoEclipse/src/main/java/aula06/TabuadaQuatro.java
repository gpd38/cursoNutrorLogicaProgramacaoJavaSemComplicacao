package aula06;

public class TabuadaQuatro {

	public static void main(String[] args) {

		// Op��o 1 de fazer
		int tabuada = 4;
		for (int i = 10; i > 0; i--) {
			System.out.println(tabuada + " x " + i + " = " + tabuada * i);
		}

		// Op��o 2 de fazer
		int valor = 4;
		tabuada(valor);

	}

	private static void tabuada(int valor) {
		for (int i = 10; i > 0; i--) {
			System.out.println(valor + " x " + i + " = " + valor * i);
		}
	}
}
