
public class Carro {
	String marca;
	String modelo;
	int ano;
	String cor;
	double pre�o;

	String exibir() {
		return mar ca+"-" +modelo + "-" + ano + "-" + cor + "-" +pre�o; 
	}

void aplicarDesconto(double percentual) {
	pre�o= pre�o - pre�o * percentual / 100;
	System.out.println("Desconto = " c.aplicarDesconto);
}
double calcularIpva() {
	double valorIpva;
	valorIpva = pre�o *0.02;  
	return valorIpva; 
	
}
}