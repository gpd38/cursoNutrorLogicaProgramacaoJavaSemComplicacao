package aula05;

import java.util.LinkedHashMap;

public class Tempo {

	public static void main(String[] args) {

		// Usando switch- case
		String tempo = "ensolarado";

		switch (tempo) {
		case "ensolarado":
			System.out.println("Ir pra praia");
			break;
		case "chovendo":
			System.out.println("Levar guarda chuva");
			break;
		case "nevando":
			System.out.println("Ficar em casa");
			break;
		case "tempestade":
			System.out.println("Boa sorte");
			break;
		}

		// Usando hashmap
		String tempo2 = "chovendo";
		LinkedHashMap<String, String> mapTempo = new LinkedHashMap<String, String>();
		mapTempo.put("ensolarado", "Ir pra praia");
		mapTempo.put("chovendo", "Levar guarda chuva");
		mapTempo.put("nevando", "Ficar em casa");
		mapTempo.put("tempestade", "Boa sorte");

		System.out.println(mapTempo.get(tempo2));

	}
}
