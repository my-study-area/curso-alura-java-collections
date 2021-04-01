package br.com.alura;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso curso = new Curso("Dominando as coleções do Java", "José Carlos");
		
		curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
		curso.adiciona(new Aula("Listas de objetos", 20));
		
		Aluno aluno1 = new Aluno("Adriano", 123);
		Aluno aluno2 = new Aluno("André", 456);
		Aluno aluno3 = new Aluno("Carlos", 789);
		
		curso.matricula(aluno1);
		curso.matricula(aluno2);
		curso.matricula(aluno3);
		
		curso.getAlunos().forEach(System.out::println);
		
		System.out.println("Aluno está matriculado?");
		Aluno adriano = new Aluno("Adriano", 123);
		System.out.println(curso.estaMatriculado(adriano));
	}

}
