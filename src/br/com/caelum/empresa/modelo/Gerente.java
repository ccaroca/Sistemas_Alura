package br.com.caelum.empresa.modelo;

import java.util.Calendar;

import br.com.caelum.empresa.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {

	public Gerente(String nome, double salario) {
		super(nome, salario);

	}

	public Gerente(String nome, int i, Calendar nascimento) {
		super(nome, i, nascimento);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numeroDeFuncionariosGerenciados;
		result = prime * result + senha;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gerente other = (Gerente) obj;
		if (numeroDeFuncionariosGerenciados != other.numeroDeFuncionariosGerenciados)
			return false;
		if (senha != other.senha)
			return false;
		return true;
	}

	int senha;
	int numeroDeFuncionariosGerenciados;

	public boolean autentica(int senha) {
		// verifica aqui se a senha confere com a recebida como parametro
		// no caso do gerente verifica também se o departamento dele
		// tem acesso
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(
			int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	@Override
	public double getBonificacao() {
		return this.salario * 0.2;
	}

}