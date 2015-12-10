package br.com.caelum.banco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {

	private List<Conta> contas = new ArrayList<>();
	// cria o mapa
	Map<String, Conta> mapaDeContas = new HashMap<>();

	public void adicionaArray(Conta c) {
		if (c != null){
			contas.add(c);
			
		}
		
	}
	
	public void adicionaMap(Conta c) {
		if (c != null){
			mapaDeContas.put(c.getDono(), c);
		}
		
	}

	public Conta pega(int f) {
		if (contas.get(f) != null)
			return contas.get(f);
		return null;

	}

	public int pegaQuantidadeDeContas() {
		return contas.size();

	}

	public void mostraContas() {

		for (Conta c : contas) {
			if (c == null)
				break;
			System.out.println("Dono:" + c.getDono() + ", saldo: "
					+ c.getSaldo());
		}
	}

	public Conta buscaPorNomeArray(String nome) {
		long inicio = System.currentTimeMillis();
		for (Conta c : contas) {
			if (c.dono.equals(nome)) {
				long fim = System.currentTimeMillis();
				long tempo = fim - inicio;
				System.out.println("Tempo gasto: " + tempo);
				return c;
			}
		}
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
		return null;
	}
	
	public Conta buscaPorNomeMap(String nome) {
		long inicio = System.currentTimeMillis();
		if(mapaDeContas.get(nome)!=null){
			long fim = System.currentTimeMillis();
			long tempo = fim - inicio;
			System.out.println("Tempo gasto: " + tempo);
			return mapaDeContas.get(nome);
		}
		return null;
	}

}
