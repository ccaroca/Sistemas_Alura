package br.com.caelum.empresa;

import br.com.caelum.empresa.modelo.Funcionario;

public class ControleDeBonificacoes {

	private double totalDeBonificacoes = 0;

	public void registra(Funcionario f) {
		System.out.println("Adicionando bonifica��o do funcionario: " + f.nome);
		this.totalDeBonificacoes += f.getBonificacao();
	}

	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}
}
