
public class Conta {
	private int numConta;
	private int digitoVerifica;
	private String nome;
	private String cpf;
	private double saldo;

	public Conta(int numConta, int digitoVerifica, String nome, String cpf, double saldo) {
		super();
		this.numConta = numConta;
		this.digitoVerifica = digitoVerifica;
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = saldo;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public int getDigitoVerifica() {
		return digitoVerifica;
	}

	public void setDigitoVerifica(int digitoVerifica) {
		this.digitoVerifica = digitoVerifica;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public String imprimir() {
		return "Conta Corrente:" + numConta + "-" + digitoVerifica + "-" + "Nome:" + nome + "-" + "CPF" + cpf + "-" + "R$" + String.format("%.2f", saldo);
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public boolean sacar(double valor) {
		if (valor > saldo) {
			return false;
		} else {
			saldo = saldo - valor;
		}
		return true;

	}
}
