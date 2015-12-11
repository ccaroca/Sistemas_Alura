package br.com.caelum;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import br.com.caelum.empresa.modelo.Funcionario;
import br.com.caelum.empresa.modelo.Gasto;
import br.com.caelum.empresa.modelo.Gerente;

public class Programa {

	public static void main(String[] args) {

		Locale locale1 = Locale.US;
		TimeZone tz1 = TimeZone.getTimeZone("GMT");
		Calendar hoje = Calendar.getInstance(tz1, locale1);
		GregorianCalendar nascimento = new GregorianCalendar(1989, 3, 14);
		GregorianCalendar nascimento2 = new GregorianCalendar(1985, 7, 2);
		
		Funcionario funcionario = new Gerente("Vinícius", 9, nascimento);
		Funcionario funcionario1 = new Gerente("Caio", 10, nascimento2);
		Funcionario funcionario11 = new Gerente("Joao", 11, nascimento);

		Gasto gasto = new Gasto(40.0, "taxi", funcionario, hoje);
		Gasto gasto1 = new Gasto(4.0, "onibus", funcionario1, nascimento2);
		Gasto gasto11 = new Gasto(400.0, "aviao", funcionario11, nascimento);

		System.out.println(gasto);
		System.out.println(gasto1);
		System.out.println(gasto11);
	}
}
