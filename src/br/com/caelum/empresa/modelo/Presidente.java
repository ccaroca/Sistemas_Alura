package br.com.caelum.empresa.modelo;

public class Presidente extends Funcionario{

	public Presidente(String nome, double salario) {
		super(nome, salario);
		
	}

	@Override
	public
	double getBonificacao() {
		return this.salario * 0.5;
	}

}
