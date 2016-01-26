package br.com.caelum.designPatterns;

public class TesteDeImpostos {

	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Imposto iccc = new ICCC();

		Orcamento orcamento = new Orcamento(3500.0);

		CalculadorDeImpostos calculador = new CalculadorDeImpostos();

		// Calculando o ISS
		calculador.realizaCalculo(orcamento, iss);

		// Calculando o ICMS
		calculador.realizaCalculo(orcamento, icms);

		// Calculando o ICCC
		calculador.realizaCalculo(new Orcamento(4000.0), iccc);
		calculador.realizaCalculo(new Orcamento(3000.0), iccc);
		calculador.realizaCalculo(new Orcamento(2000.0), iccc);
		calculador.realizaCalculo(new Orcamento(1000.0), iccc);
		calculador.realizaCalculo(new Orcamento(500.0), iccc);
	}

}
