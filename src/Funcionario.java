public class Funcionario {

	String nome;
	String departamento;
	double salario;
	Data dataEntrada = new Data();
	String rg;

	public void recebeAumento(double valor) {
		this.salario += valor;
	}

	public double calculaGanhoAnual() {
		this.salario *= 12;
		return salario;
	}

	public void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salario:" + this.salario);

		System.out.println("Data de entrada: " + this.dataEntrada.getFormatada());
		System.out.println("RG: " + this.rg + "\n");
		/*System.out.println("Dia: " + this.dataEntrada.dia);
		System.out.println("Mes: " + this.dataEntrada.mes);
		System.out.println("Ano: " + this.dataEntrada.ano);*/
	}
	

	
}
