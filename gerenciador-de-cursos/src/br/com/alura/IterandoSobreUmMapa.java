package br.com.alura;

import java.util.HashMap;
import java.util.Map;

public class IterandoSobreUmMapa {

	public static void main(String[] args) {
        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");
        
        pessoas.keySet().forEach( idade -> System.out.println(pessoas.get(idade)));
        
        pessoas.forEach((k, v) -> System.out.println(v));
        
        pessoas.keySet().forEach(System.out::println);
        
        pessoas.entrySet().forEach(System.out::println);
       
	}

}
