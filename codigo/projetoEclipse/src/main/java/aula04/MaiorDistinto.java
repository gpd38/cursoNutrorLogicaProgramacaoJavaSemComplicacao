package aula04;

public class MaiorDistinto {

	public static void main(String[] args) {

		int valorA = 5;
		int valorB = 7;
		int valorC = 9;

		if (valorA > valorB && valorA > valorC) {
			System.out.println("O maior valor � " + valorA);
		} else if (valorB > valorA && valorB > valorC) {
			System.out.println("O maior valor � " + valorB);
		} else if (valorC == valorA && valorC == valorB) {
			System.out.println("Os valores s�o iguais!");
		} else {
			System.out.println("O maior valor � " + valorC);
		}

	}

}
