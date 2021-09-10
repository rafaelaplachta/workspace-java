import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int opcao;
		double valor;
		Conta conta;
		conta = new Conta(2399, 4, "Ana Carolina Dias", "08567429402", 0.0);
		System.out.println("Bem-vindo ao Banco IsiItau!");

		do {

			System.out.println("Escolha 1 para saldo; 2 para depósito; 3 para saque; 0 para encerrar:");

			opcao = teclado.nextInt();

			switch (opcao) {
			case 1:
				System.out.println(conta.imprimir());
				break;
			case 2:
				System.out.println("Informe o valor do depósidot:");
				valor = teclado.nextDouble();
				conta.depositar(valor);
				System.out.println("Saldo atual=" + conta.getSaldo());
				break;
			case 3:
				System.out.println("Informe o valor do saque:");
				valor = teclado.nextDouble();
				conta.sacar(valor);
				
				if (conta.sacar(valor)) {
					System.out.println("Saque efetuado!");
				} else {
					System.out.println("Saldo insuficiente!");
				}
				System.out.println("Saldo atual=" + conta.getSaldo());
				break;
			case 0:
				System.out.println("Agradecemos a preferência");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}

		} while (opcao != 0);

	}
}
