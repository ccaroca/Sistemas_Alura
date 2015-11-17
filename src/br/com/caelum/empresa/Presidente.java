package br.com.caelum.empresa;

public class Presidente extends Funcionario{

	public Presidente(String nome, double salario) {
		super(nome, salario);
		
	}

	@Override
	double getBonificacao() {
		return this.salario * 0.5;
	}

}
