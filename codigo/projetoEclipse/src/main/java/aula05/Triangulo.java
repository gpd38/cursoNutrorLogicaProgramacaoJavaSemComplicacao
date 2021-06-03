package aula05;

public class Triangulo {

	public static void main(String[] args) {

		int ladoA = 5;
		int ladoB = 6;
		int ladoC = 7;

		if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
			if (ladoA == ladoB && ladoA == ladoC) {
				System.out.println("Triângulo Equilátero");
			} else if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
				System.out.println("Triâgulo Escaleno");
			} else if ((ladoA == ladoB && ladoA != ladoC) 
					|| (ladoA == ladoC && ladoA != ladoB)
					|| (ladoB == ladoC && ladoB != ladoA)) {
				System.out.println("Triângulo Isósceles");
			}
		} else {
			System.out.println("Os valores não correspondem a um triângulo");
		}

	}

}
