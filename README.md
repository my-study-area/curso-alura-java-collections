# curso-alura-java-collections
Anotações do Curso Java Collections: Dominando Listas, Sets e Mapas

## Módulo 01 - Trabalhando com ArrayList
### Aula 01.01 - Trabalhando com ArrayList
- [documentação java](https://docs.oracle.com/javase/8/docs/api/)
- `ArrayList` é uma implementação da interface `List`, que por sua vez extende da interface `Collections`.
- Na classe `ArrayList` encontramos os métodos `add`, `remove`, `get`, `forEach` e outros.
- Podemos percorrer os elementos de uma lista com o `enhanced for`, ou popularmente chamado de `foreach`.
```java
for (String elemento : lista) {
    System.out.println("Elemento: " + elemento);
}
```
- Para percorrer uma lista no Java 8 podemos utilizar o método `forEach`:
```java
aulas.forEach(aula -> {
    System.out.println("Percorrendo:");
    System.out.println("Aula " + aula);
});
```
- Podemos ordenar uma lista com a classe `java.util.Collections`, utilizando o método `sort`:
```java
String aula1 = "Modelando a classe Aula";
String aula2 = "Conhecendo mais de listas";
String aula3 = "Trabalhando com Cursos e Sets";

ArrayList<String> aulas = new ArrayList<>();
aulas.add(aula1);
aulas.add(aula2);
aulas.add(aula3);

Collections.sort(aulas);
```
> Obs: como é uma lista String, ela é ordenada usando a ordem natural da String, que é, a ordem lexografica, ou seja, ordem alfabética
