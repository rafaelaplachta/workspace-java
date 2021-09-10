
public class Funcionarios {
	private int funcional;
	private String nome;
	private String email;
	private double salario;

	public CalcFolhaPagamento(int funcional, String nome, String email, double salario) {
		super();
		this.funcional = funcional;
		this.nome = nome;
		this.email = email;
		this.salario = salario;
	}

	public int getFuncional() {
		return funcional;
	}

	public void setFuncional(int funcional) {
		this.funcional = funcional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String imprimir() {
		return "Funcional:" + funcional + "-" + "Nome:" + nome + "-" + "E-mail:" + email + "-" + "R$"
				+ String.format("%.2f", salario);
	}

	public void reajuste(percentual) {
		salario += *percentual / 100;
	}

	


	
		
		
		
	



}
