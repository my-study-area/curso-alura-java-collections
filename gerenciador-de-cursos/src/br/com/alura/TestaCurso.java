package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso curso = new Curso("Dominando as coleções do Java", "José Carlos");
		List<Aula> aulas = curso.getAulas();
		
		System.out.println(aulas);
		
	}

}
