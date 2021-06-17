package aula08;

public class Vetor {

	public static void main(String[] args) {

		int vetor[] = { 2, 8, 7, 12, 5, 6, 15, 7, 1, 10 };
		exibirResultados(vetor);

	}

	public static void exibirResultados(int[] vetor) {
		int maior = 0;
		int soma = 0;
		float media = 0f;

		for (int valor : vetor) {
			if (valor > maior) {
				maior = valor;
			}
			soma += valor;
		}
		media = soma / (float) vetor.length;

		System.out.println("O maior valor é " + maior);
		System.out.println("A soma dos valores do vetor é " + soma);
		System.out.println("A média dos elementos do vetor é  " + media);

	}
}
