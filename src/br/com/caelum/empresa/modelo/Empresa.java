package br.com.caelum.empresa.modelo;

public class Empresa {

	String nome;
	String cnpj;
	Funcionario[] empregados;
	int posicao = 0;
	
	
	
	 public Empresa(int tamanho) {
		this.empregados = new Funcionario[tamanho];
	}

	void adiciona(Funcionario f) {
	        if(posicao < empregados.length){
	        	this.empregados[posicao] = f;
	        	posicao++;
	        }		 
	    }
	 
	 void mostraEmpregados() {
		 
		 for (Funcionario funcionario : empregados) {
				if(funcionario == null)
					break;
	        	funcionario.mostra();
			}		 
	    }
	 
	 boolean contem(Funcionario f){
		 for (int i = 0; i < this.posicao; i++) {
				if(empregados[i].nome.equals(f.nome))
					return true;
		 }
	     return false;					 
	 }
		 
	        
	 
}
