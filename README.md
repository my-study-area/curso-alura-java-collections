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

### Aula 01.02 - Preparando Ambiente em todos SOs
No Linux:
```bash
sudo add-apt-repository ppa:openjdk-r/ppa
sudo apt-get update
sudo apt-get install openjdk-8-jdk

javac -version

java -version
```

### Aula 01.03 - Preparando Ambiente em todos SOs

### Aula 01.04 - Removendo elementos de uma lista

### Aula 01.05 - Acessando elementos da lista

### Aula 01.06 - Tentando acessar índices que não existem na lista
- Ao acessarmos um elemento de um ArrayList recebemos a exception `IndexOutOfBoundsException`

### Aula 01.07 - Ordenando uma lista

## Módulo 02 - Listas de objetos
### Aula 02.01 - Listas de objetos
- O que aprendemos neste capítulo:
- A utilidade em reescrever o método toString.
- Collections.sort e o método compareTo.
- Comparator e recursos do Java 8.

### Aula 02.02 - Criando listas a partir de objetos próprios
- Classes que não sobrescrevem o método `toString` utilizam o método `toString` da classe `Object`.

### Aula 02.03 - Reescrevendo o toString da classe Aula

### Aula 02.04 - Definindo um critério de comparação na classe Aula
- somente conseguimos ordenar uma coleção com `Collections.sort` se o objeto for uma instância de uma classe que implementa `Comparable`
```java
public class Aula implements Comparable<Aula> {

    private String titulo;

    //... restante do código

    @Override
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.titulo);
    }
}
```

### Aula 02.05 - Ordenando com Java 8
```java
aulas.sort(Comparator.comparing(Aula::getTempo));
```

## Módulo 03 - Relacionamentos com coleções

### Aula 03.01 - Relacionamentos com coleções
- A implementação LinkedList.
- Encapsulamento e princípios de Orientação a Objeto.
- Programação defensiva.


### Aula 03.02 - Criando relacionamentos com coleções

