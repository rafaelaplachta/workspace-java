import java.util.Scanner;

public class Poupan�a {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double valor;

		System.out.println("Informe o valor a ser calculado para a poupan�a:");

		valor = teclado.nextDouble();

		valor *= 0.3012 / 100;
		System.out.printf("Na poupan�a, esse valor render� por m�s R$ %2.2f%n", valor);

		System.out.println("Informe um valor para c�lculo da SELIC:");
		
		valor = teclado.nextDouble();
		valor *= 0.4375 / 100;
		System.out.printf("Investindo na SELIC esse valor render� R$ %2.2f ao m�s.%n", valor);
		
		System.out.println("Informe um valor para rendimento mensal no tesouro direto:");
		valor = teclado.nextDouble();
		valor *= 0.9 /100;
		
		System.out.printf("Por m�s, o tesouro direto prefixado render� R$%2.2f.",valor);
		
	}
}
