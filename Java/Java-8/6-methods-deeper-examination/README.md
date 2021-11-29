## Métodos: um exame mais profundo

| Nome | Descrição |
| ------ | ------ |
|[MaximumFinder](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/6-methods-deeper-examination/charapter-06/src/MaximumFinder.java)| Declarando métodos com múltiplos parâmetros |
|[RandomIntegers](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/6-methods-deeper-examination/charapter-06/src/RandomIntegers.java)| Inteiros aleatórios deslocados e escalonados.|
|[RollDie](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/6-methods-deeper-examination/charapter-06/src/RollDie.java)| Rola um dado de seis lados 6.000.000 vezes |
|[Craps](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/6-methods-deeper-examination/charapter-06/src/Craps.java)| Craps simula o jogo de dados craps |

## Resumo

| Tipo | Promoções válidas |
| ------ | ------ |
| double | None |
| float | Double |
| long | float ou double |
| int | long, float ou double |
| char | int, long, float ou double |
| short | int, long, float ou double (mas não char) |
| byte | short, int, long, float ou double (mas não char) |
| boolean | Nenhuma (os valores boolean não são considerados números em Java) |

## Introdução
- A experiência mostrou que a melhor maneira de desenvolver e manter um programa grande é construí-lo a partir de pequenos e simples pedaços,
ou módulos. Essa técnica é chamada dividir para conquistar.

## Módulos de programa em Java

- Os métodos são declarados dentro de classes. Em geral, as classes são agrupadas em pacotes para que possam ser importadas e reutilizadas.
- Os métodos permitem modularizar um programa separando suas tarefas em unidades autocontidas. As instruções em um método são escritas
somente uma vez e permanecem ocultas de outros métodos.
• Usar os métodos existentes como blocos de construção para criar novos programas é uma forma de reutilização de software que permite evitar
repetição de código dentro de um programa.

## Métodos static, campos static e classe Math

- Uma chamada de método especifica o nome do método a ser chamado e fornece os argumentos que o método chamado requer para realizar
sua tarefa. Quando a chamada de método é concluída, o método retorna um resultado, ou simplesmente o controle, ao seu chamador.
- Uma classe pode conter métodos `static` para realizar tarefas comuns que não exigem um objeto da classe. Quaisquer dados que um método
static poderia requerer para realizar suas tarefas podem ser enviados ao método como argumentos em uma chamada de método. Um método
static é chamado especificando o nome da classe em que o método é declarado seguido por um ponto (.) e pelo nome do método, como em

```
NomeDaClasse.nomeDoMétodo(argumentos)
```

- A classe Math fornece os métodos static para realizar cálculos matemáticos comuns.
- A constante Math.PI (3,141592653589793) é a relação entre a circunferência de um círculo e seu diâmetro. A constante Math.E
(2,718281828459045) é o valor base para logaritmos naturais (calculados com o método `static Math log`).
- `Math.PI` e `Math.E` são declaradas com os modificadores `public`, `final` e `static`. Torná-los `public` permite que você use esses campos
nas suas próprias classes. Um campo declarado com a palavra-chave `final` é constante — seu valor não pode ser alterado depois de ele ser
inicializado. Tanto PI como E são declarados `final` porque seus valores nunca mudam. Tornar esses campos `static` permite que eles sejam
acessados pelo nome da classe `Math` e um ponto (.) separador, como ocorre com os métodos da classe Math.
- Todos os objetos de uma classe compartilham uma cópia dos campos static da classe. As variáveis de classe e as variáveis de instância representam
os campos de uma classe.
- Quando você executa a Java Virtual Machine ( JVM) com o comando java, a JVM carrega a classe especificada e utiliza esse nome de classe para
invocar o método main. É possível especificar argumentos de linha de comando adicionais que a JVM passará para o seu aplicativo.
- Você pode colocar um método `main` em cada classe que declara — somente o método main na classe que você utiliza para executar o aplicativo
será chamado pelo comando java.

## Declarando métodos com múltiplos parâmetros

- Quando um método é chamado, o programa faz uma cópia dos valores de argumento do método e os atribui aos parâmetros correspondentes do
método. Quando o controle do programa retorna ao ponto em que método foi chamado, os parâmetros do método são removidos da memória.
- Um método pode retornar no máximo um valor, mas o valor retornado poderia ser uma referência a um objeto que contém muitos valores.
- Variáveis devem ser declaradas como campos de uma classe somente se forem utilizadas em mais de um método da classe ou se o programa
deve salvar seus valores entre chamadas aos métodos da classe.
• Se um método tiver mais de um parâmetro, os parâmetros serão especificados como uma lista separada por vírgulas. Deve haver um argumento
na chamada de método para cada parâmetro na declaração do método. Além disso, cada argumento deve ser consistente com o tipo do parâmetro
correspondente. Se um método não aceitar argumentos, a lista de parâmetros ficará vazia.
- `Strings` podem ser concatenadas com o operador `+`, o que posiciona os caracteres do operando direito no final daqueles no operando esquerdo.
- Cada objeto e valor primitivos no Java podem ser representados como uma `String`. Quando um objeto é concatenado com uma `String`, ele
é convertido em uma `String` e então as duas Strings são concatenadas.
- Se um boolean for concatenado com uma String, a palavra “true” ou “false” é utilizada para representar o valor boolean.
- Todos os objetos em Java têm um método especial chamado `toString` que retorna uma representação `String` do conteúdo do objeto. Quando
um objeto é concatenado com uma `String`, a JVM chama implicitamente o método toString do objeto a fim de obter a representação string
do objeto.
- Pode-se dividir grandes literais String em várias `Strings` menores e colocá-las em múltiplas linhas de código para melhorar a legibilidade,
depois remontar as `Strings` utilizando concatenação.

## Notas sobre a declaração e utilização de métodos
