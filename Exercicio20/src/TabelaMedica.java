import java.util.Scanner;

public class TabelaMedica {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double altura, peso;
		int sexo;

		System.out.println("Informe a altura do paciente:");
		altura = teclado.nextDouble();

		System.out.println("Informe o sexo: digite 1 para masculino e 2 para feminino");
		sexo = teclado.nextInt();

		if (sexo == 1) {
			peso = (72.7 * altura) - 58;

		} else {
			peso = (62.1 * altura) - 44.7;
		}

		System.out.printf("O peso ideal para este paciente é %.2d kg." + peso);

	}

}
