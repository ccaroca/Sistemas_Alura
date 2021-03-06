package br.com.caelum.banco;
public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

	public void deposita(double quantidade) {
		this.saldo += quantidade - 0.1;
	}

	@Override
	public int compareTo(ContaPoupanca outra) {
		return this.dono.compareTo(outra.dono); 
           
	}
}
