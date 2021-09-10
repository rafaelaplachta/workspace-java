
public class Funcionario {

	String nome;
	String cargo;
	double salario;

	String exibir() {
		return nome + "-" + cargo + "-" + salario;
	}
//retorna void quando modifica o atributo; quando não modifica o atributo e apenas calcula o ipva, por exemplo, dai retorna algo.
	void aumentarSalario(double percentual) {

		salario = salario + salario * percentual / 100;
		
	}

}
