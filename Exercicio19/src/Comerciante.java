import java.util.Scanner;

public class Comerciante {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double produto, produtoFinal;

		System.out.println("Informe o valor do produto:");
		produto = teclado.nextDouble();

		if (produto <= 20) {
			produtoFinal = produto * 1.40;
		} else {
			produtoFinal = produto * 1.30;

		}
		System.out.println("Ovalor de venda do produto será R$" + produtoFinal);
	}

}
