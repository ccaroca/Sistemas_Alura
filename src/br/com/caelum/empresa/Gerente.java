package br.com.caelum.empresa;

public class Gerente extends Funcionario implements Autenticavel {

	public Gerente(String nome, double salario) {
		super(nome, salario);

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