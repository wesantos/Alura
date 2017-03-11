public class Empresa {
	
	String nome;
	String cnpj;
	Funcionario[] empregados;
	int livre = 0;

	void adcionar(Funcionario f) {
		this.empregados[this.livre] = f;
		this.livre++;
	}
	
	void mostraDados() {
		for (int i = 0; i < this.livre; i++) {
			System.out.println("Posição do funcionario no array: " + i);
			System.out.println("Salario do funcionario: " + this.empregados[i].salario + "\n");
		}
	}
	
	void mostraTodasInformacoes() {
		for (int i = 0; i < this.livre; i++) {
			System.out.println("Funcionario na posição: " + i);
			this.empregados[i].mostra();
		}
	}
	
    boolean contem (Funcionario f) {
    	for (int i = 0; i < this.livre; i++) {
			if (f == this.empregados[i]) {
				return true;
			}
				
    	}
    	return false;
		}

}
