import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int x, resultado;

		System.out.println("Digite um número:");
		x = teclado.nextInt();

		for (int contador = 1; contador <= x; contador=contador + 2) {
			resultado = x + contador;
			System.out.println("Resultado =" + contador);
		}
	}

}
