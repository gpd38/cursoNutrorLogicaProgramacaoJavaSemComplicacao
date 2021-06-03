package aula05;

public class Triangulo {

	public static void main(String[] args) {

		int ladoA = 5;
		int ladoB = 6;
		int ladoC = 7;

		if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
			if (ladoA == ladoB && ladoA == ladoC) {
				System.out.println("Tri�ngulo Equil�tero");
			} else if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
				System.out.println("Tri�gulo Escaleno");
			} else if ((ladoA == ladoB && ladoA != ladoC) 
					|| (ladoA == ladoC && ladoA != ladoB)
					|| (ladoB == ladoC && ladoB != ladoA)) {
				System.out.println("Tri�ngulo Is�sceles");
			}
		} else {
			System.out.println("Os valores n�o correspondem a um tri�ngulo");
		}

	}

}
