import java.util.Scanner;

public class TestandoWorkSpace {
	public static void main(String[] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);

		int idade, dias;
		System.out.println("Informe sua idade:");
		idade = teclado.nextInt();

		dias = idade * 365;

		System.out.println("Você já viveu %t dias." + dias);

	}

}
