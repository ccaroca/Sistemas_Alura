package br.com.caelum.empresa.modelo;

import java.util.Calendar;

import br.com.caelum.empresa.Data;

public abstract class Funcionario {

	@Override
	public int hashCode() {
		
		
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((dataEntradaBanco == null) ? 0 : dataEntradaBanco.hashCode());
		
		result = prime * result
				+ ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		
		result = prime * result
				+ ((departamento == null) ? 0 : departamento.hashCode());
		
		result = prime * result + identificador;
		
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		
		result = prime * result + ((rg == null) ? 0 : rg.hashCode());
		
		long temp;
		temp = Double.doubleToLongBits(salario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (dataEntradaBanco == null) {
			if (other.dataEntradaBanco != null)
				return false;
		} else if (!dataEntradaBanco.equals(other.dataEntradaBanco))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (departamento == null) {
			if (other.departamento != null)
				return false;
		} else if (!departamento.equals(other.departamento))
			return false;
		if (identificador != other.identificador)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		if (Double.doubleToLongBits(salario) != Double
				.doubleToLongBits(other.salario))
			return false;
		return true;
	}

	static private int totalFuncionarios;

	static public int getTotalFuncionarios() {
		return totalFuncionarios;
	}

	private int identificador;

	public int getIdentificador() {
		return identificador;
	}

	public String nome;
	protected String departamento;
	protected double salario;
	protected Data dataEntradaBanco = new Data(02, 07, 1985);
	protected String rg;

	public abstract double getBonificacao();

	private Calendar dataNascimento;

	public Funcionario(String nome, int matricula, Calendar dataNascimento) {
		this.nome = nome;
		this.identificador = matricula;
		this.dataNascimento = dataNascimento;
		Funcionario.totalFuncionarios += 1;
		
	}

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		Funcionario.totalFuncionarios += 1;
		
	}

	public Funcionario(String nome, double salario, Data data) {
		this.nome = nome;
		this.salario = salario;
		this.dataEntradaBanco = data;
		Funcionario.totalFuncionarios += 1;
		
	}

	void recebeAumento(double valor) {
		this.salario += valor;
	}

	double calculoGanhoAnual() {
		return salario * 12;
	}

	void mostra() {
		System.out.println("Identificador:" + this.identificador);
		System.out.println("Nome:" + this.nome);
		System.out.println("Departamento:" + this.departamento);
		System.out.println("Salário: R$" + this.salario);
		System.out.println("Data de Entrada no Banco: "
				+ this.dataEntradaBanco.getFormatada());
		System.out.println("RG:" + this.rg);

	}

	public String getNome() {
		return this.nome;
	}
}
