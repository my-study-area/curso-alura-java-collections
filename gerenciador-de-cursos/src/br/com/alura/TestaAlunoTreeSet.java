package br.com.alura;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestaAlunoTreeSet {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Carlos", 5678);
		Aluno aluno2 = new Aluno("Adriano", 9234);
		
		Set<Aluno> listaDeAlunos = new TreeSet<>(Comparator.comparing(Aluno::getNome));
		
		listaDeAlunos.add(aluno2);
		listaDeAlunos.add(aluno1);
		listaDeAlunos.forEach(System.out::println);

	}

}
