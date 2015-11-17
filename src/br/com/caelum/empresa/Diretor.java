package br.com.caelum.empresa;

public class Diretor extends Funcionario implements Autenticavel {

	public Diretor(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	double getBonificacao() {
		return this.salario * 0.3;
	}



	public boolean autentica(int senha) {
		return false;
        // verifica aqui se a senha confere com a recebida como parametro
    }

}
