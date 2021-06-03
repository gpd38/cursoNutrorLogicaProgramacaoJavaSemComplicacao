package aula04;

public class MaiorDistinto {

	public static void main(String[] args) {

		int valorA = 5;
		int valorB = 7;
		int valorC = 9;

		if (valorA > valorB && valorA > valorC) {
			System.out.println("O maior valor é " + valorA);
		} else if (valorB > valorA && valorB > valorC) {
			System.out.println("O maior valor é " + valorB);
		} else if (valorC == valorA && valorC == valorB) {
			System.out.println("Os valores são iguais!");
		} else {
			System.out.println("O maior valor é " + valorC);
		}

	}

}
