import java.util.Scanner;

public class Poupança {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double valor;

		System.out.println("Informe o valor a ser calculado para a poupança:");

		valor = teclado.nextDouble();

		valor *= 0.3012 / 100;
		System.out.printf("Na poupança, esse valor renderá por mês R$ %2.2f%n", valor);

		System.out.println("Informe um valor para cálculo da SELIC:");
		
		valor = teclado.nextDouble();
		valor *= 0.4375 / 100;
		System.out.printf("Investindo na SELIC esse valor renderá R$ %2.2f ao mês.%n", valor);
		
		System.out.println("Informe um valor para rendimento mensal no tesouro direto:");
		valor = teclado.nextDouble();
		valor *= 0.9 /100;
		
		System.out.printf("Por mês, o tesouro direto prefixado renderá R$%2.2f.",valor);
		
	}
}
