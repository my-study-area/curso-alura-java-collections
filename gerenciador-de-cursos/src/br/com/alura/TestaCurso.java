package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso curso = new Curso("Dominando as coleções do Java", "José Carlos");
		List<Aula> aulas = curso.getAulas();
		
		System.out.println(aulas);
		
		curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
		curso.adiciona(new Aula("Listas de objetos", 20));
		System.out.println(aulas);
	}

}
