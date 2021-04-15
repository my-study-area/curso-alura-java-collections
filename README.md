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


### Aula 05.02 - Características de conjuntos
- Um `Set` garante que nenhum elemento se repete. Por isso o método `add(..)` devolve um booleano que indica o sucesso da inserção.
- Há métodos que fazem busca por um objeto, como `contains(..)` ou `remove(..)`, que são muito mais rápidos se comparado com uma lista.
- Diferentemente de uma lista, um conjunto não define uma ordem. Isso significa que não recebemos os elementos na mesma ordem da inserção.

### Aula 05.03 - Interface mãe
- Ambos, `List` e `Set` estendem a interface Collection.
- a interface `Iterable` é a mãe de `Collections`.

### Aula 05.04 - Imprimindo conjunto
- Como a uma coleção `Set` não possui uma sequência de elementos ela não possui os métodos `lista.get(1)` ou `lista.remove(2)`.  Como não há uma sequência de elementos, não existe uma posição definida. Imagine que o `Set` é um saco no qual você não conhece o próximo elemento que sai.

### Aula 05.05 - Elementos duplicados
- `Set` não aceita elementos duplicados

### Aula 05.06 - Velocidade de busca das listas e conjuntos
- No caso do `ArrayList`, a inserção é bem rápida e a busca muito lenta.
- No caso do `HashSet`, a inserção ainda é rápida, embora um pouco mais lenta do que a das listas. Mas a busca é muito rápida.

## Módulo 06 - Aplicando o Set no modelo
### Aula 06.01 - Aplicando o Set no modelo
### Aula 06.02 - Criação da classe aluno
### Aula 06.03 - Encapsulando o Set
### Aula 06.04 - Collections.unmodifiableSet(..)
### Aula 06.05 - Collections.emptySet()
- `Collections.emptySet()` é utilizado para pegar um Set vazio e imutável.
- Quando realizamos operações numa referência de `Collections.emptySet()` recebemos uma `UnsupportedOperationException`.

### Aula 06.06 - Para saber mais: Coleções threadsafe
Sobre `Collections.synchronizedSet(Set<T> s)`:
- Uma das características mais interessantes de JVM é que ela sabe trabalhar em paralelo. Internamente isso é feito por meio de Threads que funcionam como pequenos processos dentro da JVM.

- O problema é que as coleções que estamos usando até agora não foram feitas para serem manipuladas em paralelo. No entanto, nada impede que usemos um método da classe Collections para transformar uma coleção comum em uma coleção para threads. É justamente isso que o método faz, retorna um nova coleção que pode ser compartilhada entre threads sem perigos.

## Módulo 07 - Equals e hashcode
### Aula 07.01 - Equals e hashcode
### Aula 07.02 - Considerando hashCode e Equals
- A  classe String já possui um método para gerar um hashCode a partir do seu conteúdo. Este método é bem eficiente e confiável.
- Apesar de ser perigoso, se estamos verificando se um elemento pertence a uma implementação de List, só precisamos reescrever o método equals(), já que o método .contains() de List só utiliza o equals para comparação.

### Aula 07.03 - Verificando se está matriculado
- Devemos implementar o equals e o hashcode em coleção do tipo Set.
O método equals deve ficar assim:
```java
@Override
public boolean equals(Object obj) {
    Aluno outroAluno = (Aluno) obj;
    return this.nome.equals(outroAluno.nome);
}
```
E o hashCode desta maneira:
```java
@Override
public int hashCode(){
    return this.nome.hashCode();
}
```

### Aula 07.04 - Programando defensivamente
- Programar defensivamente é quando realizamos verificações em nosso código antes que os erros aconteçam, como por exeplo, quando um objeto faz uma chamada de um método com valor nulo podemos receber um `NullPointerException`.
```java
public Aluno(String nome, int numeroMatricula) {
    if (nome == null) {
        throw new NullPointerException("Nome não pode ser nulo");
    }
    this.nome = nome;
    this.numeroMatricula = numeroMatricula;
}
```

### Aula 07.05 - Para saber mais: O contrato do método equals
- o método equals deve seguir alguma condições de acordo com a [documentação](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#equals-java.lang.Object-)
- utilize o `equals` gerado em sua IDE.

## Módulo 08 - Outros sets e iterators
### Aula 08.01 - Outros sets e iterators
- Conseguimos manter a ordem de um Set usando `LinkedHashSet`, mas não conseguimos utilizar o método `.get(int posicao)` para acessar os elementos.
- `TreeSet` mantém a ordem natural, porém somente funciona com coleções que implementam `Comparable`
- Para iterar o elementos dos `Set` antes do java 8 usamos for enhanced. Exemplo:
```java
Set<Aluno> alunos = curso.getAlunos();
for (Aluno aluno : alunos) {
  System.out.println(aluno);
}
```
- Para iterar os elementos antes do java 5 usavamos o Iterator. Exemplo:
```java
Set<Aluno> alunos = javaColecoes.getAlunos();
Iterator<Aluno> iterador = alunos.iterator();

while (iterador.hasNext()) {
    System.out.println(iterador.next());
}
```
- Se utilizarmos um iterator após percorrer os seus elementos recebemos uma `java.util.NoSuchElementException`.
- Antes da `Collections` usamos a classe `Vector` que atualmente implementa `List` e pode ser utilizada por várias threads simultaneamente, chamado de thread safe. Mas atualmente não é recomendada a sua utilização, já que existem outras formas de se trabalhar com coleções de maneira thread safe.

### Aula 08.02 - HashSet é poderoso, mas se eu precisar de acesso ordenado?
- A estrutura de dados que usa o poder do hash e que podemos acessar os elementos de maneira previsível, isto é, se adicionarmos os elementos `A, B e C` teremos certeza que `A` é o primeiro, `B` é o segundo e por último `C` é o `LinkedHashSet`.
- O `LinkedHashSet` nos dá a performance de um HashSet, mas com acesso previsível e ordenado.

### Aula 08.03 - TreeSet
- Para adicionarmos um objeto em um TreeSet ele precisa implementar a interface Comparable. Mas o que fazer se estamos trabalhando com uma instância de uma classe que não temos acesso ou não podemos modificar para implementar Comparable? Nesse caso, o construtor do TreeSet recebe como parâmetro um objeto que implementa Comparator. Dessa forma, o critério de comparação pode ser criado em separado da classe na qual opera.

Exemplo usando Comparable:
```java
//Recibo
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

//TestaRecibo
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
```
Exemplo usando Comparator:
```java
package br.com.alura;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestaAlunoTreeSet {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Carlos", 5678);
		Aluno aluno2 = new Aluno("Adriano", 9234);
		
		Set<Aluno> listaDeAlunos = new TreeSet<>(Comparator.comparing(Aluno::getNome));
		
		listaDeAlunos.add(aluno2);
		listaDeAlunos.add(aluno1);
		listaDeAlunos.forEach(System.out::println);

	}

}
```

### Aula 08.04 - Recordar e viver
- Java 8 usando foreach:
```java
Set<String> conjunto = new HashSet<>();
conjunto.add("A");
conjunto.add("A"); // não adiciona, já existe
conjunto.add("B");

conjunto.forEach(letra -> {
    System.out.println(letra);
});
```

- Antes do Java 8:
```java
for(String letra: conjunto) {
    System.out.println(letra);
}
```

- Antes do Java 5:
```java
Set<Aluno> alunos = javaColecoes.getAlunos();
Iterator<Aluno> iterador = alunos.iterator();

while (iterador.hasNext()) {
    System.out.println(iterador.next());
}
```

### Aula 08.05 - Acesso sincronizado
- `Vector` é uma Collection que é thread-safe.
- A classe `Vector` possui as mesmas características que um ArrayList, com a diferença de que o primeiro possui acesso sincronizado e o segundo não.


### Aula 08.06 - Refazendo à moda antiga
```java
List<String> letras = new LinkedList<>();
letras.add("A");
letras.add("B");
letras.add("C");

Iterator<String> iterator = letras.iterator();
        
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
```

### Aula 08.07 - TreeSet e Comparator
```java
import java.util.Comparator;

public class OrdenaPorIdade implements Comparator<Funcionario>{

    @Override
    public int compare(Funcionario funcionario, Funcionario outroFuncionario) {
        return funcionario.getIdade() - outroFuncionario.getIdade();
    }

}

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Teste {

    public static void main(String args[]) {

        Funcionario f1 = new Funcionario("Barney", 12);
        Funcionario f2 = new Funcionario("Jonatan", 9);
        Funcionario f3 = new Funcionario("Guaraciara", 13);

        Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);

        Iterator<Funcionario> iterador = funcionarios.iterator();

        while (iterador.hasNext()) {
            System.out.println(iterador.next().getNome());
        } 
    }
}
```
## Módulo 09 - Qual Collection usar
### Aula 09.01 - Qual Collection usar
- Uma coleção é todo mundo que implementa a interface `Collection`.
- Na `Collection` posuímos os métodos: add, contains, remove, size e etc.
- Para trabalhar com um punhado de objetos repetidos que estarão em uma sequência de ordem que nós usamos `List`.
- usamos o `Set` para trabalhar com objetos que não possuem uma ordenação e não podemos conter objetos repetidos.
- podemos utilizar a interface mãe `Collection` em casos que não temos nenhuma restrição quanto ao punhado de objetos.

### Aula 09.02 - List vs Set
- List é uma sequência e aceita elementos duplicados. Set não aceita duplicados e não define ordem.


### Aula 09.03 - A implementações de Collection
Exemplos de instânciação:
- `List<Aluno> alunos = new ArrayList<>();`
- `ArrayList<Aluno> alunos = new ArrayList<>();`
- `Collection<Aluno> alunos = new HashSet<>();`

### Aula 09.04 - Qual usar?
Provavelmente, caso a modelagem do sistema ainda não esteja bem definida, o desenvolvedor irá utilizar a interface `Collection<E>`. Dessa maneira, terá acesso aos métodos básicos de todas as implementações, como `size()`, `add()`, `remove()` e `contains()`. Conforme for sentindo necessidade em algo específico, o desenvolvedor fará poucas mudanças em seu código.

Caso sinta necessidade de fazer uma requisição a um elemento específico através da sua posição, trocará de `Collection<E>` para `List<E>`. Caso perceba que ordem não importa, porém é necessária uma busca bem rápida (e sem repetições), um `Set<E>` é mais apropriado.

Enquanto não sentir essa necessidade, provavelmente a `Collection<`E> será a melhor escolha.

### Aula 09.05 - Qual coleção?
- A implementação `TreeSet` já ordena os seus elementos na hora da inserção. O critério da ordenação depende e pode ser definido através de um Comparator.

## Módulo 10 - Mapas
### Aula 10.01 - Mapas
- A interface Map.
- As implementações HashMap e LinkedHashMap.
- Vantagens e desvantagens do uso do Map.

### Aula 10.02 - Características dos mapas
- Se repetimos uma chave, a chave repetida é sobrescrita pela nova. Se uma chave for repetida, a antiga permanece, porém, o valor é sobrescrito pelo novo valor contido na chave passada, sendo o antigo valor "esquecido" pelo `Map`.
- O valor de um `Map` pode ser repetido, diferente de uma chave.
- A interface Map mapeia valores para chaves, ou seja, através da chave conseguimos acessar o valor.
- A interface `Map` **não implementa** a interface `Collection`, apesar de fazer parte da API de `Collections`.


### Aula 10.03 - Adicionando elementos em um mapa
O método utilizado para adicionar um elemento em um `Map` é o método `put`. Ele recebe dois parâmetros, a chave e o valor. Os tipos desses parâmetros dependem do que definimos na hora da instância do objeto. Por exemplo, abaixo criamos um Map que recebe como chave a matrícula do aluno e como valor o seu nome:
```java
Map<Integer, String> matriculaParaAluno = new HashMap<>();
matriculaParaAluno.put(123456, "Leonardo Cordeiro");
```
Então no `put`, nós temos que receber como parâmetro um inteiro, que representa a matrícula, e uma String, que representa o nome do aluno.

### Aula 10.04 - Iterando sobre um mapa
```java
Map<Integer, String> pessoas = new HashMap<>();

pessoas.put(21, "Leonardo Cordeiro");
pessoas.put(27, "Fabio Pimentel");
pessoas.put(19, "Silvio Mattos");
pessoas.put(23, "Romulo Henrique");

pessoas.keySet().forEach(idade -> {
    System.out.println(pessoas.get(idade));
});
```

### Aula 10.05 - Garantindo a ordem de inserção de um mapa
- Para garantir a ordem de inserção em um `Map` podemos utilizar o `LinkedHashMap`. O `LinkedHashMap` continua nos dando a performance de um `HashMap`, mas com acesso previsível e ordenado, seguindo a inserção dos seus elementos.

### Aula 10.06 - Criando o mapa de alunos
- utilizamos o método `.get(Object value)` de um `Map` para acessar o seu valor.
```java
Map<Integer, String> pessoas = new HashMap<>();
pessoas.put(21, "Leonardo Cordeiro");
System.out.println(pessoas.get(21));
```

### Aula 10.07 - Para saber mais: Chaves e Valores
- Usamos o método `keySet()` do `Map` para acessar um `Set` com as chaves do mapa.
- Usamos o método `values()` do `Map` para acessar uma `Collection` com os valores do mapa.
```java
Map<String, Integer> nomesParaIdade = new HashMap<>();
nomesParaIdade.put("Paulo", 31);
nomesParaIdade.put("Adriano", 25);
nomesParaIdade.put("Alberto", 33);
nomesParaIdade.put("Guilherme", 26);

//acessa as chaves
nomesParaIdade.keySet().forEach(System.out::println);
//acessa os valores
nomesParaIdade.values().forEach(System.out::println);
//acessa as chaves e valores
nomesParaIdade.entrySet().forEach(System.out::println);
```

### Aula 10.08 - Como continuar?
### Aula 10.09 - Projeto pronto
