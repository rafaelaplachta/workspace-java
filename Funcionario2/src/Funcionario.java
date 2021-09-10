
public class Funcionario {

	private String nome;
	private String cargo;
	private double salario;
	

//para criar o codigo abaixo: alt s; aperta letra a; clica em generate. 	
	public Funcionario(String nome, String cargo, double salario) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}

	//para criar o codigo dos seters and geters:
	//alt s; aperta letra r;aperta tab até chegar em select all;talvez alt + r.
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
		public String exibir() {
			return nome + "-" + cargo + "-" + salario;
	}

}
