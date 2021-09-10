import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numero, resultado;

		System.out.println("Informe a tabuada:");

		numero = teclado.nextInt();

		for (int contador = 0; contador <= 10; contador++) {

			resultado = numero * contador;
			System.out.println("Resultado =" + resultado);
		}
	}
}
