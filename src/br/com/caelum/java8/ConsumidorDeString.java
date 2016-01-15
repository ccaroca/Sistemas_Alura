package br.com.caelum.java8;

import java.util.function.Consumer;

public class ConsumidorDeString implements Consumer<String> {
	public void accept(String s) {
        System.out.println(s);
    }

}
