package aula07;

public class Fibonacci {

	public static void main(String[] args) {

		int fibonacci = 0;
		int anterior = 1;

		for (int i = 1; i < 31; i++) {
			fibonacci = fibonacci + anterior;
			anterior = fibonacci - anterior;
			System.out.println(fibonacci);
		}

	}

}
