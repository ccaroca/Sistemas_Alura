package br.com.caelum.banco;

public class Conta {

	int numero;
	String dono;
	protected double saldo;
	double limite;
	double salario;
	public Cliente titular;

	@Override
	public boolean equals(Object obj) {
		Conta outraConta = (Conta) obj;

		return this.numero == outraConta.numero;
	}

	@Override
	public String toString() {

		return "esse objeto é uma conta com saldo R$" + this.saldo;
	}

	public boolean saca(double quantidade) {
		// posso sacar até saldo+limite
		if (quantidade > this.saldo + this.limite) {
			System.out.println("Não posso sacar fora do limite!");
			return false;
		} else {
			this.saldo = this.saldo - quantidade;
			return true;
		}
	}

	void atualiza(double taxa) {
		this.saldo = this.saldo + this.saldo * taxa;
	}

	boolean transferePara(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if (retirou == false) {
			// não deu pra sacar!
			return false;
		} else {
			destino.deposita(valor);
			return true;
		}
	}

	public void deposita(double quantidade) {
		if (quantidade < 0)
			try {
				throw new ValorInvalidoException(quantidade);
			} catch (ValorInvalidoException e) {
				System.out.println(e.getMessage());
			}
		this.saldo += quantidade;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}
