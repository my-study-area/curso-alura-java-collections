package br.com.alura;

import java.math.BigDecimal;
import java.util.Set;
import java.util.TreeSet;

public class TestaRecibo {

	public static void main(String[] args) {
		
		Recibo recibo1 = new Recibo("Carlos", BigDecimal.valueOf(1000.00));
		Recibo recibo2 = new Recibo("Miguel", BigDecimal.valueOf(2000.00));
		Recibo recibo3 = new Recibo("Maria", BigDecimal.valueOf(3000.00));
		
		Set<Recibo> listaDeRecibos = new TreeSet<>();
		listaDeRecibos.add(recibo1);
		listaDeRecibos.add(recibo2);
		listaDeRecibos.add(recibo3);
		
		listaDeRecibos.forEach(System.out::println);
		
	}

}
