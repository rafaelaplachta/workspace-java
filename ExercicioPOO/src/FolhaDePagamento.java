
public class FolhaDePagamento {
	public static void main(String[] args) {
		Funcionario f1;
		f1 = new Funcionario();
		f1.nome = "Ana Cristina da Silva";
		f1.cargo = "Assistente Administrativo";
		f1.salario = 2500.23;

		System.out.println(f1.exibir());

		f1.aumentarSalario(50);

		Funcionario f2 = new Funcionario();

		f2.nome = "Maria Eduarda Barbosa de Souza";
		f2.cargo = "Analista Administrativo";
		f2.salario = 3965.78;

		System.out.println(f2.exibir());

		f2.aumentarSalario(25);

		Funcionario f3 = new Funcionario();

		f3.nome = " Paola Cristine Macedo";
		f3.cargo = "Gerente Administrativo";
		f3.salario = 4519.47;

		System.out.println(f3.exibir());

		f3.aumentarSalario(12);

		Funcionario f4 = new Funcionario();

		f4.nome = "Pedro Maciel de Moura";
		f4.cargo = "Diretor Administrativo";
		f4.salario = 5847.83;

		System.out.println(f4.exibir());

		f4.aumentarSalario(8);

		Funcionario f5;
		f5 = new Funcionario();

		f5.nome = "Quiteria Oliveira Finlandia";
		f5.cargo = "Diretora de Marketing";
		f5.salario = 6570.83;

		System.out.println(f5.exibir());

		f5.aumentarSalario(7);
		System.out.println(f5.exibir());
		
	}
}
