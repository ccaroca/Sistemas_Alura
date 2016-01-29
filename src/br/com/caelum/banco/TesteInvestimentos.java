package br.com.caelum.banco;

public class TesteInvestimentos {

	public static void main(String[] args) {
		Conta c = new Conta();
		c.setSaldo(100);
		
		RealizadorDeInvestimentos invest = new RealizadorDeInvestimentos();
		invest.realiza(c, new Conservador());
		invest.realiza(c, new Moderado());
		invest.realiza(c, new Arrojado());

	}

}
