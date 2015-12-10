package br.com.caelum.banco;
public class ContaCorrente extends Conta implements Tributavel, Comparable<ContaCorrente>{

	public ContaCorrente(int i, String string) {
		super( i, string);
	}

	public ContaCorrente() {
		super();
	}
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}

	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}

	@Override
	public int compareTo(ContaCorrente outra) {
		if (this.saldo < outra.saldo) {
            return -1;
          }

          if (this.saldo > outra.saldo) {
            return 1;
          }

          return 0;
	}
}
