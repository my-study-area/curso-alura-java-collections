package br.com.alura;

public class Aula implements Comparable<Aula> {
	
	private String tipo;
	private int tempo;
	
	public Aula(String tipo, int tempo) {
		super();
		this.tipo = tipo;
		this.tempo = tempo;
	}

	public String getTipo() {
		return tipo;
	}

	public int getTempo() {
		return tempo;
	}

	@Override
	public String toString() {
		return "Aula [tipo=" + tipo + ", tempo=" + tempo + "]";
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.tipo.compareTo(outraAula.getTipo());
	}
	
}
