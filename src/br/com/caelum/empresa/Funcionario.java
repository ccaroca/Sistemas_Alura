package br.com.caelum.empresa;


public abstract class Funcionario {

	static private int totalFuncionarios;
	static public int getTotalFuncionarios(){
		return totalFuncionarios;
	}
	
	private int identificador;
	public int getIdentificador(){
		return identificador;
	}
	protected String nome;
	protected String departamento;
	protected double salario;
	protected Data dataEntradaBanco = new Data (02,07,1985);
	protected String rg;
	
	abstract double getBonificacao();
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		Funcionario.totalFuncionarios +=1;
		this.identificador = Funcionario.totalFuncionarios;
	}

	void recebeAumento(double valor){
		this.salario += valor;
	}
	
	double calculoGanhoAnual(){
		return salario*12;
	}
	
	void mostra(){
		 System.out.println("Identificador:" + this.identificador);
		 System.out.println("Nome:" + this.nome);
		 System.out.println("Departamento:" + this.departamento);
		 System.out.println("Salário: R$" + this.salario);
		 System.out.println("Data de Entrada no Banco: " + this.dataEntradaBanco.getFormatada());
		 System.out.println("RG:" + this.rg);
		 
	}
}

