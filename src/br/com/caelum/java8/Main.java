package br.com.caelum.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
<<<<<<< HEAD
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		
		cursos.forEach(System.out::println);
		
		cursos.stream()
				.filter(c -> c.getAlunos() > 100)
				.forEach(System.out::println);

	}

}
package br.com.caelum.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
=======
>>>>>>> branch 'master' of https://github.com/ccaroca/Sistemas_Alura.git
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		cursos.forEach(s -> System.out.println(s));

		// cursos.sort(Comparator.comparingInt(c -> c.getAlunos())); ou
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));

		// cursos.forEach(s -> System.out.println(s)); ou
		cursos.forEach(System.out::println);

		System.out
				.println("\n------ Streams: trabalhando com coleções no java 8  ---------\n");

		cursos.stream()
				.filter(c -> c.getAlunos() > 100)
				.forEach(System.out::println);

		cursos.stream()
				.filter(c -> c.getAlunos() > 100)
				.map(Curso::getAlunos)
				.forEach(x -> System.out.println(x));

		System.out.println("\n------ Streams: trabalhando com Stream Optional  ---------\n");

		Optional<Curso> optional = cursos.stream()
				.filter(c -> c.getAlunos() > 100)
				.findAny();

		System.out.println(optional.get());
		System.out.println(optional.orElse(null));
		optional.ifPresent(c -> System.out.println(c.getNome()));

		System.out.println("\n------ Streams: calculando média de quantidade de alunos  ---------\n");

		cursos.stream()
			.mapToInt(Curso::getAlunos)
			.average()
			.ifPresent(System.out::println);

		System.out.println("\n------ Streams: coletando o resultado do stream em uma List  ---------\n");

		List<Curso> novaLista = cursos.stream()
				.filter(c -> c.getAlunos() > 50)
				.collect(Collectors.toList());
						
		novaLista.forEach(System.out::println);

	}
}
