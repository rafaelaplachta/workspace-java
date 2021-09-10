
public class Carro {
	String marca;
	String modelo;
	int ano;
	String cor;
	double preço;

	String exibir() {
		return mar ca+"-" +modelo + "-" + ano + "-" + cor + "-" +preço; 
	}

void aplicarDesconto(double percentual) {
	preço= preço - preço * percentual / 100;
	System.out.println("Desconto = " c.aplicarDesconto);
}
double calcularIpva() {
	double valorIpva;
	valorIpva = preço *0.02;  
	return valorIpva; 
	
}
}