package aula08;

public class Matriz {

	public static void main(String[] args) {

		String matriz[][] = { { "Joao", "Jose", "Ana" }, { "Masculino", "Masculino", "Feninino" } };

		for (int i = 0; i < matriz[0].length; i++) {
			System.out.println("Nome " + matriz[0][i]);
			System.out.println("Sexo " + matriz[1][i]);
		}

	}

}
