import java.util.Scanner;

public class ExercicioUm {
	public static void main(String[] args) {

		double distancia, velocidade, tempo, consumo;

		Scanner teclado;
		teclado = new Scanner(System.in);

		distancia = velocidade * tempo;
		consumo = distancia / 12;

		System.out.println("Informe a velocidade m�dia:");
		velocidade = teclado.nextDouble();

		System.out.println("Informe o tempo gasto no percurso:");
		tempo = teclado.nextDouble();

		System.out.println("O consumo de combust�vel deste percurso � de " + consumo);
		
}

}
