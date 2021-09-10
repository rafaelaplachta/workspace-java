import java.util.Scanner;

public class Leitura {
	public static void main(String[] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);

		int valor1;
		double valor2;

		System.out.println("Digite um valor inteiro.");
		valor1 = teclado.nextInt();
		System.out.println("Digite um valor real.");

		valor2 = teclado.nextDouble();
		System.out.println("Você digitou" + valor1);
		System.out.println("Você digitou" + valor2);

	}

}
