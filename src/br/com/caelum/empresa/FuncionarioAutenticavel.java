package br.com.caelum.empresa;

import br.com.caelum.empresa.modelo.Funcionario;

public class FuncionarioAutenticavel extends Funcionario {

	public FuncionarioAutenticavel(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

	public boolean autentica(int senha) {
		return false;
		// faz autenticacao padrão
	}

	@Override
	public
	double getBonificacao() {
		return this.salario * 0.3;
	}

	// outros atributos e métodos

}