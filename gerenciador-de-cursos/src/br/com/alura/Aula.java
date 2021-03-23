package br.com.alura;

public class Aula {
	
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
	
}
