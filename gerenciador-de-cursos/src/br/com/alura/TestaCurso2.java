package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		
		Curso curso = new Curso("Dominando as coleções do Java", "José Carlos");
		List<Aula> aulasImutaveis = curso.getAulas();
		
		System.out.println(aulasImutaveis);
		
		curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
		curso.adiciona(new Aula("Listas de objetos", 20));
		System.out.println(aulasImutaveis);
		
		ArrayList<Aula> aulas = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println(curso.getTempoTotal());
		
		System.out.println(curso);
	}

}
