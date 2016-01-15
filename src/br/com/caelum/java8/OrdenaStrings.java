package br.com.caelum.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");

		//-----Sem Java 8 ----
		Collections.sort(palavras);
		System.out.println(palavras);
		
		Comparator<String> comparador = new ComparadorDeStringPorTamanho();
		Collections.sort(palavras, comparador);
		System.out.println(palavras);

		//------------------------------
		
		//-----melhorias: invocando do propri List- Default methods e Lambdas---
		Collections.reverse(palavras);
		System.out.println(palavras);
		
		//palavras.sort(comparador);
		palavras.sort((s1,s2) -> 
            Integer.compare(s1.length(), s2.length())
        );
		System.out.println(palavras);
		
		Consumer<String> consumidor = new ConsumidorDeString();
		palavras.forEach(consumidor);
		palavras.forEach(s -> System.out.println(s));
		
	}

}
