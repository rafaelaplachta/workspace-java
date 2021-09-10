import java.util.Scanner;

public class Tabuada {
public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	int numero, contador, resultado;
	
	System.out.println("Informe a tabuada:");
	
	numero = teclado.nextInt();
	
	contador = 0;
	
	while (contador <= 10) {
		resultado = contador * numero;
		contador = contador + 1;
		System.out.println("Resultado = "+resultado);
	}
	
	
	
}
}
