import java.util.Scanner;

public class TotalDeCedulas {
	// declarando as vari�veis.

	public static void main(String[] args) {
		int saque, ced100, ced50, ced20, ced10, ced5, ced2, ced1, resto;

		System.out.println("Digite um valor:");
		Scanner teclado;
		teclado = new Scanner(System.in);

		saque = teclado.nextInt();
		ced100 = saque / 100;
		resto = saque % 100;
		ced50 = resto / 50;
		resto = resto % 50;
		ced20 = resto / 20;
		resto = resto % 20;
		ced10 = resto / 10;
		resto = resto % 10;
		ced5 = resto / 5;
		resto = resto % 5;
		ced2 = resto / 2;
		resto = resto % 2;
		ced1 = resto / 1;

		System.out.println("Valor do saque igual a" + saque);
		System.out.println("A quantidadee de notas de 100 � igual a" + ced100);
		System.out.println("A quantidadee de notas de 50 � igual a" + ced50);
		System.out.println("A quantidadee de notas de 20 � igual a" + ced20);
		System.out.println("A quantidadee de notas de 10� igual a" + ced10);
		System.out.println("A quantidadee de notas de 5 � igual a" + ced5);
		System.out.println("A quantidadee de notas de 2� igual a" + ced2);
		System.out.println("A quantidadee de notas de 1 � igual a" + ced1);

	}

}
