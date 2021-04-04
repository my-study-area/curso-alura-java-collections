package br.com.alura;

import java.math.BigDecimal;

public class Recibo implements Comparable<Recibo>{
	
	private String pagador;
	private BigDecimal valor;

	public Recibo(String pagador, BigDecimal valor) {
		this.pagador = pagador;
		this.valor = valor;
	}

	public String getPagador() {
		return pagador;
	}

	public BigDecimal getValor() {
		return valor;
	}
	
	@Override
	public String toString() {
		return "Recibo [pagador=" + pagador + ", valor=" + valor + "]";
	}

	@Override
	public int compareTo(Recibo o) {
		return valor.compareTo(o.valor);
	}
	
}
