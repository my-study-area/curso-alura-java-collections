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

### Aula 03.03 - Declarando as diferentes implementações como List
- Em vez de declararmos a referência a uma `ArrayList<Aula>` (ou `LinkedList<Aula>`), o ideal é deixarmos mais genérico, utilizando a interface `List`. Por quê? Pelo motivo que não temos motivo para ser super específico na instância que iremos usar. Se declararmos apenas como `List`, poderemos mudar de implementação, como para uma `LinkedList`, sem problema algum de compilação, por não termos nos comprometido com uma implementação em específico.


### Aula 03.04 - Adicionando novas aulas em um Curso

### Aula 03.05 - Encapsulando o acesso às aulas

### Aula 03.06 - Encapsulando o acesso às aulas
- `ArrayList` é lenta para adicionar e remover elementos no começo da lista e é rápida para acessar os elementos
- `LinkedList` é lenta para acessar os elementos e rápida para adicionar e remover elementos no começo da lista

## Mais práticas com relacionamentos
### Aula 04.01 - Mais práticas com relacionamentos

### Aula 04.02 - Imprimindo uma unmodifiable list ordenadamente
- Se quisermos imprimir uma `unmodifiable list` de uma coleção ordenada devemos passar a `unmodifiable list` no construtor de uma `ArrayList` tradicional e utilizar o método `.sort()` de `Collections` para ordená-la.
```java
List<Aula> aulasImutaveis = javaColecoes.getAulas();
System.out.println(aulasImutaveis);

List<Aula> aulas = new ArrayList<>(aulasImutaveis);

Collections.sort(aulas);
System.out.println(aulas);
```

### Aula 04.03 - Ordenando as aulas de um curso

### Aula 04.04 - Obtendo o tempo total de aulas

### Aula 04.05 - Melhorando a exibição do curso

### Aula 04.06 - Outros métodos de Collections
Além do método sort() que vimos neste capítulo, a classe `Collections` também possui muitos outros métodos interessantes. Vamos dar uma olhada em alguns:

- `Collections.reverse()`: o método reverse() serve para inverter a ordem de uma lista. As vezes precisamos imprimir uma lista de nomes do último para o primeiro, ou uma lista de ids do maior para o menor e é nestas horas que utilizamos o reverse para inverter a ordem natural da lista para nós.

- `Collections.shuffle()`: o método shuffle() serve para embaralhar a ordem de uma lista. Por exemplo em um caso de um sistema de sorteio, em que precisamos de uma ordem aleatória na nossa lista, utilizamos o método shuffle para embaralhá-la.

- `Collections.singletonList()`: o método singletonList() nos devolve uma lista imutável que contêm um único elemento especificado. Ele é útil quando precisamos passar um único elemento para uma API que só aceita uma Collections daquele elemento.

- `Collections.nCopies()`: o método nCopies() nos retorna uma lista imutável com a quantidade escolhida de um determinado elemento. Se temos uma lista específica e precisamos obter uma outra lista imutável , contendo diversas cópias de um destes objetos, utilizamos o método nCopies(). O bom deste método é que mesmo que nós solicitemos uma lista com um número grande, como 10000 objetos, ele na verdade se referencia a apenas um, ocupando assim um pequeno espaço.

Este método também é utilizado para inicializar Listas recém criadas com Null, já que ele pode rapidamente criar diversos objetos, deste modo:
```java
List<Type> list = new ArrayList<Type>(Collections.nCopies(1000, (Type)null));
```
## Módulo 05 - O poder dos sets
### Aula 05.01 - O poder dos sets
- A interface `Set` é filha da interface `Collection`.
- O `Set` lembra muito um conjunto matemático e não adiciona os elementos em sequência. Um conjunto (diferente de uma lista, que representa uma sequência de objetos) é uma "sacola", e lá dentro está cheio de objetos, e você não sabe em que ordem eles estão.
- `HashSet` é uma implementação de `Set`.

