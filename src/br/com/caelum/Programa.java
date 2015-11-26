package br.com.caelum;

import java.io.PrintStream;

import br.com.caelum.banco.Conta;
import br.com.caelum.banco.ContaCorrente;
import br.com.caelum.banco.ValorInvalidoException;

public class Programa {

	public static void main(String[] args) {

		/*
		 * System.out.println("_____________Aplicação EMPRESA______________\n");
		 * 
		 * ControleDeBonificacoes cdb = new ControleDeBonificacoes();
		 * Funcionario f = new Gerente("Caio", 2000); Funcionario f2 = new
		 * Presidente("Fabiano", 2000); Funcionario f3 = new Diretor("Thiago",
		 * 2000); cdb.registra(f); // faz sentido? cdb.registra(f2);
		 * cdb.registra(f3); System.out.println(cdb.getTotalDeBonificacoes());
		 * 
		 * System.out.println("_____________Aplicação ÁREAS______________\n");
		 * AreaCalculavel a = new Retangulo(3, 2); AreaCalculavel b = new
		 * Quadrado(3); AreaCalculavel c = new Circulo(3);
		 * System.out.println(a.calculaArea());
		 * System.out.println(b.calculaArea());
		 * System.out.println(c.calculaArea());
		 */

		System.out.println("_____________Aplicação BANCO______________\n");

		Conta minhaConta = new ContaCorrente();
		Conta conta1 = new ContaCorrente();
		minhaConta.deposita(200);
		conta1.deposita(100);
		
		String nome = "Socorram-me, subi no ônibus em Marrocos";
		
		imprimeInvertido(nome);

	}

	static void imprimeInvertido(String s){
		String[] v = s.split(" ");
		
		for (int i = v.length - 1; i>=0; i--) {
			System.out.print(v[i] + " ");
		}
		
		
	}

}
