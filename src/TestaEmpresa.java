
public class TestaEmpresa {

	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		empresa.empregados = new Funcionario[10]; 

		Funcionario f1 = new Funcionario();
		f1.nome = "David";
		f1.departamento = "Tatuagem";
		f1.salario = 5000;
		empresa.adcionar(f1);
		
		Funcionario f2 = new Funcionario();
		f2.nome = "Ingrid";
		f2.departamento = "Piercings";
		f2.salario = 5000;
		empresa.adcionar(f2);
		
		Funcionario f3 = new Funcionario();
		f3.nome = "Wesley";
		f3.departamento = "Desenvolvimento";
		f3.salario = 5000;
		f3.dataEntrada = new Data();
		empresa.adcionar(f3);
		
		/*for (int i = 3; i < empresa.empregados.length; i++) {
			Funcionario f = new Funcionario();
			f.salario = 1000 + i * 100;
			f.nome = "ABC" + i;
			empresa.adcionar(f);
		}*/
		
		/*for (int i = 0; i < empresa.empregados.length; i++) {
			empresa.empregados[i].mostra();
		}*/
	
		empresa.mostraTodasInformacoes();
	}

}
