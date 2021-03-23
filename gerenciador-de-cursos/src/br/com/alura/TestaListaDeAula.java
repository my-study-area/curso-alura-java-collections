package br.com.alura;

import java.util.ArrayList;

public class TestaListaDeAula {

	public static void main(String[] args) {
		Aula aula1 = new Aula("Revistando as ArrayLists", 21);
		
		Aula aula2 = new Aula("Listas de objetos", 20);
		Aula aula3 = new Aula("Relacionamento de listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
	}

}
