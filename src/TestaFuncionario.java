
public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();

		f1.nome = ("Wesley");
		f1.departamento = ("ti");
		f1.salario = (1500);

		f1.dataEntrada = new Data();
		f1.dataEntrada.preencheData(13,3,1996);

		f1.rg = ("39.895.888-8");

		f1.mostra();

	}

}