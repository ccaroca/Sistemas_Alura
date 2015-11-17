package br.com.caelum;
import br.com.caelum.banco.ContaCorrente;
import br.com.caelum.banco.GerenciadorDeImpostoDeRenda;
import br.com.caelum.banco.SeguroDeVida;
import br.com.caelum.empresa.ControleDeBonificacoes;
import br.com.caelum.empresa.Diretor;
import br.com.caelum.empresa.Funcionario;
import br.com.caelum.empresa.Gerente;
import br.com.caelum.empresa.Presidente;
import br.com.caelum.figuras.AreaCalculavel;
import br.com.caelum.figuras.Circulo;
import br.com.caelum.figuras.Quadrado;
import br.com.caelum.figuras.Retangulo;

public class Programa {

	public static void main(String[] args) {

		System.out.println("_____________Aplicação EMPRESA______________\n");

		ControleDeBonificacoes cdb = new ControleDeBonificacoes();
		Funcionario f = new Gerente("Caio", 2000);
		Funcionario f2 = new Presidente("Fabiano", 2000);
		Funcionario f3 = new Diretor("Thiago", 2000);
		cdb.registra(f); // faz sentido?
		cdb.registra(f2);
		cdb.registra(f3);
		System.out.println(cdb.getTotalDeBonificacoes());

		System.out.println("_____________Aplicação ÁREAS______________\n");
		AreaCalculavel a = new Retangulo(3, 2);
		AreaCalculavel b = new Quadrado(3);
		AreaCalculavel c = new Circulo(3);
		System.out.println(a.calculaArea());
		System.out.println(b.calculaArea());
		System.out.println(c.calculaArea());

		System.out.println("_____________Aplicação BANCO______________\n");
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();

		SeguroDeVida sv = new SeguroDeVida();
		gerenciador.adiciona(sv);

		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000);
		gerenciador.adiciona(cc);
		System.out.printf("O saldo é: %.2f", cc.getSaldo());

		System.out.println(gerenciador.getTotal());

	}

}
