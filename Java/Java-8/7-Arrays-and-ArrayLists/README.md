## Arrays e ArrayLists

| Nome | Descrição |
| ------ | ------ |
|[BarChart](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/7-Arrays-and-ArrayLists/chapter-07/src/BarChart.java)| Programa de impressão de gráfico de barras. |
|[Card](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/7-Arrays-and-ArrayLists/chapter-07/src/Card.java)| Classe Card representa uma carta de baralho. |
|[DeckOfCards](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/7-Arrays-and-ArrayLists/chapter-07/src/DeckOfCards.java)| Classe DeckOfCards representa um baralho. |
|[DeckOfCardsTest](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/7-Arrays-and-ArrayLists/chapter-07/src/DeckOfCardsTest.java)| Embaralhando e distribuindo cartas. |
|[EnhancedForTest](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/7-Arrays-and-ArrayLists/chapter-07/src/EnhancedForTest.java)| Utilizando a instrução for aprimorada para somar inteiros em um array. |
|[InitArray](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/7-Arrays-and-ArrayLists/chapter-07/src/InitArray.java)| Inicializando os elementos de um array como valores padrão de zero. |
|[NewInitArray](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/7-Arrays-and-ArrayLists/chapter-07/src/NewInitArray.java)| Inicializando os elementos de um array com um inicializador de array. |
|[OtherInitArray](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/7-Arrays-and-ArrayLists/chapter-07/src/OtherInitArray.java)| Calculando os valores a serem colocados nos elementos de um array. |
|[RollDie](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/7-Arrays-and-ArrayLists/chapter-07/src/RollDie.java)| Programa de jogo de dados utilizando arrays em vez de switch. |
|[StudentPoll](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/7-Arrays-and-ArrayLists/chapter-07/src/StudentPoll.java)| Programa de análise de enquete. |
|[SumArray](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/7-Arrays-and-ArrayLists/chapter-07/src/SumArray.java)| Calculando a soma dos elementos de um array. |
|[ArrayListCollection](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/7-Arrays-and-ArrayLists/chapter-07/src/ArrayListCollection.java)| Demonstração da coleção ArrayList<T> genérica. |
|[ArrayManipulations](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/7-Arrays-and-ArrayLists/chapter-07/src/ArrayManipulations.java)| Métodos da classe Arrays e System.arraycopy. |
|[GradeBook](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/7-Arrays-and-ArrayLists/chapter-07/src/GradeBook.java)| classe GradeBook utilizando um array para armazenar notas de teste. |
|[GradeBookTest](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/7-Arrays-and-ArrayLists/chapter-07/src/GradeBookTest.java)| GradeBookTest cria um objeto GradeBook utilizando um array de notas, e, então, invoca o método processGrades para analisá-las. |
|[GradeBook2](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/7-Arrays-and-ArrayLists/chapter-07/src/GradeBook2.java)| classe GradeBook utilizando um array bidimensional para armazenar notas. |
|[GradeBookTest2](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/7-Arrays-and-ArrayLists/chapter-07/src/GradeBookTest2.java)| GradeBookTest cria o objeto GradeBook utilizando um array bidimensional das notas e, então, invoca o método processGrades para analisá-las. |
|[InitArray2](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/7-Arrays-and-ArrayLists/chapter-07/src/InitArray2.java)| Inicializando arrays bidimensionais. |
|[InitArray3](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/7-Arrays-and-ArrayLists/chapter-07/src/InitArray3.java)| Inicializando um array com argumentos de linha de comando. |
|[PassArray](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/7-Arrays-and-ArrayLists/chapter-07/src/PassArray.java)| Passando arrays e elementos do arrays individuais aos métodos. |
|[VarargsTest](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/7-Arrays-and-ArrayLists/chapter-07/src/VarargsTest.java)| Utilizando listas de argumentos de comprimento variável. |
|[DrawRainbow](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/7-Arrays-and-ArrayLists/chapter-07/src/DrawRainbow.java)| Desenhando um arco-íris com arcos e um array de cores. |
|[DrawRainbowTest](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/7-Arrays-and-ArrayLists/chapter-07/src/DrawRainbowTest.java)| Aplicativo de teste para exibir um arco-íris. |

## Resumo

| Método | Descrição |
| ------ | ------ |
| add| Adiciona um elemento ao final do `ArrayList`.|
| clear | Remove todos os elementos do `ArrayList`. |
| contains | Retorna true se o `ArrayList` contém o elemento especificado; caso contrário, retorna false.|
| get | Retorna o elemento no índice especificado. |
| indexOf | Retorna o índice da primeira ocorrência do elemento especificado no `ArrayList`. |
| remove | Sobrecarregado. Remove a primeira ocorrência do valor especificado ou o elemento no índice especificado. |
| Size | Retorna o número de elementos armazenados em `ArrayList`. |
| trimToSize | Corta a capacidade do ArrayList para o número atual de elementos |

## Introdução

- Arrays são estruturas de dados de comprimento fixo que consistem em itens de dados relacionados do mesmo tipo.

## Arrays

- Um array é um grupo de variáveis (chamadas elementos ou componentes) que contêm valores todos do mesmo tipo. Os arrays são objetos;
  portanto, são considerados tipos por referência.
- Um programa referencia qualquer um dos elementos de um array com uma expressão de acesso ao array que inclui o nome do array seguido
  pelo índice do elemento particular em colchetes ([]).
- O primeiro elemento em cada array tem índice zero e às vezes é chamado de zero-ésimo elemento.
- Um índice deve ser um inteiro não negativo. Um programa pode utilizar uma expressão como um índice.
- Um objeto array conhece seu comprimento e armazena essas informações em uma variável de instância length.

## Declarando e criando arrays

- Para criar um objeto array, especifique o tipo de elemento do array e o número de elementos como parte de uma expressão de criação de array
que usa a palavra-chave new.
- Quando um array é criado, cada elemento recebe um valor padrão — zero para elementos de tipo primitivo numéricos, false para elementos
booleanos e null para referências.
- Em uma declaração de array, o tipo e os colchetes podem ser combinados no início da instrução para indicar que todos os identificadores na
declaração são variáveis de array.
- Todo elemento de um array do tipo primitivo contém uma variável do tipo declarado do array. Cada elemento de um array de tipo por referência
é uma referência a um objeto do tipo declarado do array.

## Exemplos que utilizam arrays

- Um programa pode criar um array e inicializar seus elementos com um inicializador de array.
- As variáveis constantes são declaradas com a palavra-chave final, devem ser inicializadas antes de serem utilizadas e não podem ser modificadas
depois.

## Tratamento de exceções: processando a resposta incorreta

- Uma exceção indica um problema que ocorre quando um programa é executado. O nome “exceção” sugere que o problema ocorre com pouca
frequência — se a “regra” é que uma instrução em geral executa corretamente, então o problema representa a “exceção à regra”.
- O tratamento de exceção permite criar programas tolerantes a falhas.
- Quando um programa Java é executado, a JVM verifica os índices de array para assegurar que eles são maiores ou iguais a 0 e menores do que
o comprimento do array. Se um programa usar um índice inválido, o Java gera uma exceção para indicar que ocorreu um erro no programa em
tempo de execução.
- Para lidar com uma exceção, coloque qualquer código que pode lançar uma exceção em uma instrução try.
- O bloco try contém o código que pode lançar uma exceção, e o bloco catch contém o código que manipula a exceção se uma ocorrer.
- Pode haver muitos blocos catch para tratar com diferentes tipos de exceções que podem ser lançadas no bloco try correspondente.
- Quando um bloco try termina, todas as variáveis declaradas no bloco try saem de escopo.
- Um bloco catch declara um tipo e um parâmetro de exceção. Dentro do bloco catch, você pode usar o identificador do parâmetro para interagir
com um objeto que capturou a exceção.
- Quando um programa é executado, a validade dos índices dos elementos de array é verificada — todos os índices devem ser maiores ou iguais a
0 e menores do que o comprimento do array. Se for feita uma tentativa de utilizar um índice inválido para acessar um elemento, ocorrerá uma
exceção ArrayIndexOutOfRangeException.
- O método toString de um objeto de exceção retorna uma mensagem de erro da exceção.

## Estudo de caso: simulação de embaralhamento e distribuição de cartas

- O método `toString` de um objeto é chamado implicitamente quando o objeto é utilizado onde uma `String` é esperada (por exemplo, quando
`printf` gera saída do objeto como uma `String` utilizando o especificador de formato `%s` ou quando o objeto é concatenado para uma
`String` utilizando o operador `+`).

## A instrução for aprimorada

A instrução for aprimorada permite iterar pelos elementos de um array ou uma coleção sem utilizar um contador. A sintaxe de uma instrução
for aprimorada é:

```
for (parâmetro : nomeDoArray)
instrução
```

onde parâmetro tem um tipo e um identificador (por exemplo, `int` number) e nomeDoArray é o array pelo qual iterar.
- A instrução for aprimorada não pode ser utilizada para modificar elementos em um array. Se um programa precisar modificar elementos,
utilize a tradicional instrução for controlada por contador.

## Passando arrays para métodos

- Quando um argumento é passado por valor, uma cópia do valor do argumento é feita e passada para o método chamador. O método chamado
funciona exclusivamente com a cópia.

## Passagem por valor versus passagem por referência


- Quando um argumento é passado por referência, o método chamado pode acessar o valor do argumento no chamador diretamente e, talvez,
modificá-lo.
- Todos os argumentos no Java são passados por valor. Uma chamada de método pode passar dois tipos de valores para um método — cópias dos
valores primitivos e cópias das referências a objetos. Embora uma referência do objeto seja passada por valor, um método ainda pode interagir
com o objeto referenciado chamando seus métodos public que utilizam a cópia da referência do objeto.
- Para passar uma referência de objeto para um método, simplesmente especifique na chamada de método o nome da variável que referencia o
objeto.
- Quando você passa um array ou um elemento de array individual de um tipo por referência para um método, o método chamado recebe uma
cópia do array ou uma referência do elemento. Ao passar um elemento individual de um tipo primitivo, o método chamado recebe uma cópia
do valor do elemento.
- Para passar um elemento de array individual para um método, use o nome indexado do array.

## Arrays multidimensionais

- Os arrays multidimensionais com duas dimensões costumam ser utilizados para representar tabelas de valores consistindo em informações
organizadas em linhas e colunas.
- Um array bidimensional com m linhas e n colunas é chamado array m por n. Esse array pode ser inicializado com um inicializador de array
na forma de

```
tipoDeArray[][] nomeDoArray = {{inicializador linha1}, {inicializador linha2}, …};
```

- Os arrays multidimensionais são mantidos como arrays de arrays unidimensionais separados. Como resultado, não é necessário que os comprimentos
das linhas em um array bidimensional sejam os mesmos.
- Um array multidimensional com o mesmo número de colunas em cada linha pode ser criado com uma expressão de criação de array na forma

```
tipoDeArray[][] nomeDoArray = new tipoDeArray[numDeLinhas][numDeColunas];
```

## Listas de argumentos de comprimento variável

- Um tipo de argumento seguido por reticências (...) na lista de parâmetros de um método indica que o método recebe um número variável de
argumentos desse tipo particular. As reticências só podem ocorrer uma vez na lista de parâmetros de um método. Elas devem estar no final da
lista de parâmetros.
- Uma lista de argumentos de comprimento variável é tratada como um array dentro do corpo do método. O número de argumentos no array
pode ser obtido utilizando o campo length do array.

## Classe Arrays

- A classe `Arrays` fornece métodos `static` que realizam manipulações de array comuns, incluindo a `sort` para classificar um array,
binarySearch para pesquisar um array classificado, `equals` para comparar arrays e `fill` para inserir itens em um array.
- O método `arraycopy` da classe `System` permite copiar os elementos de um array para outro.

## Introdução a coleções e classe ArrayList


- As classes da coleção da API Java fornecem métodos eficientes que organizam, armazenam e recuperam dados sem a necessidade de conhecer
como os dados são armazenados.
- Um `ArrayList<T>` é semelhante a um array, mas pode ser redimensionado dinamicamente.
- O método add com um argumento adiciona um elemento ao final de um `ArrayList`.
- O método add com dois argumentos insere um novo elemento em uma posição especificada em um `ArrayList`.
- O método size retorna o número dos elementos atualmente em um `ArrayList`.
- O método remove com uma referência a um objeto como um argumento remove o primeiro elemento que corresponde ao valor do argumento.
- O método remove com um argumento de inteiros remove o elemento no índice especificado, e todos os elementos acima desse índice são
deslocados para baixo por um.
- O método contains retorna true se o elemento é encontrado no `ArrayList` e, do contrário, false.
