package br.com.caelum.empresa.modelo;

import java.util.Calendar;

import br.com.caelum.empresa.Data;

public abstract class Funcionario {

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
		this.identificador = Funcionario.totalFuncionarios;
	}

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		Funcionario.totalFuncionarios += 1;
		this.identificador = Funcionario.totalFuncionarios;
	}

	public Funcionario(String nome, double salario, Data data) {
		this.nome = nome;
		this.salario = salario;
		this.dataEntradaBanco = data;
		Funcionario.totalFuncionarios += 1;
		this.identificador = Funcionario.totalFuncionarios;
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
