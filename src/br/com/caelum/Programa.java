package br.com.caelum;

import br.com.caelum.banco.Conta;
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

		Conta minhaConta = new Conta();
		minhaConta.deposita(-100);
		
		minhaConta.setLimite(100);
		if (!minhaConta.saca(1000)) {
			System.out.println("Não saquei");
		}
		// o saldo é -900? É 100? É 0? A chamada ao método saca funcionou?
		System.out.printf("O saldo é: %.2f", minhaConta.getSaldo());

		

	}

	

}
