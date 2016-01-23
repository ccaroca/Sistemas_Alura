package br.com.caelum.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TesteData {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);

		LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE, 5);
		System.out.println(olimpiadasRio);

		int dias = olimpiadasRio.getDayOfYear() - hoje.getDayOfYear();
		System.out.println(dias + " dias para as Olímpiadas no Rio!");

		Period periodo = Period.between(hoje, olimpiadasRio);
		System.out.println(periodo.getMonths() + " meses e "
				+ periodo.getDays() + " dias.");

		DateTimeFormatter formatador = DateTimeFormatter
				.ofPattern("dd/MM/yyyy");
		String valorFormatado = olimpiadasRio.format(formatador);
		System.out.println(valorFormatado);

		System.out.println(" --- Medida de tempo ---");
		
		
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora);
		System.out.println(agora.format(formatadorComHoras));
		
		LocalTime intervalo = LocalTime.of(12, 30);
		System.out.println(intervalo);
		
		
	}

}























