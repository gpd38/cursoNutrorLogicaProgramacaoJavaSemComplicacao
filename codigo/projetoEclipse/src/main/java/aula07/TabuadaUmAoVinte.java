package aula07;

public class TabuadaUmAoVinte {

	public static void main(String[] args) {

		for (int tabuada = 1; tabuada < 21; tabuada++) {
			System.out.println("Tabuada do " + tabuada);
			for (int i = 1; i < 11; i++) {
				System.out.println("\t" + tabuada + " x " + i + " = " + tabuada * i);
			}
		}

	}

}
