import java.util.Scanner;

public class Escola {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double n1, n2, media;

		System.out.println("Digite a nota 1:");
		n1 = teclado.nextDouble();

		System.out.println("Digite a nota 2:");
		n2 = teclado.nextDouble();

		media = (n1 + n2) / 2;

		System.out.println("A médi é" + media);

		if (media >= 9) {
			System.out.println("Conceito A");
		} else if (media >= 8 && media < 9) {
			System.out.println("Conceito B");
		} else if (media >= 7 && media < 8) {
			System.out.println("Conceito C");
		} else if (media >= 6 && media < 7) {
			System.out.println("Conceito D");
		} else {
			System.out.println("Reprovado");
		}
	}

}
