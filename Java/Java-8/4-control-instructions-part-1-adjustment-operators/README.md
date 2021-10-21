## Instruções de controle: parte 1; operadores de atribuição ++ e --

| Nome | Descrição |
| ------ | ------ |
|[NestedInstructionSelection.java](https://github.com/wmaidson/GrowthBook/blob/5751f14ffa6b7bcd1df2b29fb9686f7ea9493d52/Java/Java-8/4-control-instructions-part-1-adjustment-operators/charapter-04/src/NestedInstructionSelection.java)| Instruções `if...else` aninhadas com espaçamento |
|[OtherNested](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/4-control-instructions-part-1-adjustment-operators/charapter-04/src/OtherNested.java)|Instruções `if...else` aninhadas com recuo |
|[ProblemSwingingElse](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/4-control-instructions-part-1-adjustment-operators/charapter-04/src/ProblemSwingingElse.java)| O problema do `else` oscilante |
|[ProblemSwingingElseTwo](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/4-control-instructions-part-1-adjustment-operators/charapter-04/src/ProblemSwingingElseTwo.java)| O problema do `if...else` sem chaves |
|[SolutionSwingingElse](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/4-control-instructions-part-1-adjustment-operators/charapter-04/src/SolutionSwingingElse.java)| Solução do `if...else` com chaves|
|[Blocks](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/4-control-instructions-part-1-adjustment-operators/charapter-04/src/Blocks.java)| Instruções contidas em par de chaves (como o corpo de um método) formam um bloco|
|[ConditionalOperator](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/4-control-instructions-part-1-adjustment-operators/charapter-04/src/ConditionalOperator.java)| Operador condicional |
|[Student](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/4-control-instructions-part-1-adjustment-operators/charapter-04/src/Student.java)| Demonstra uma instrução `if` aninhada que determina a letra da nota de um aluno com base na média do aluno em um curso.|
|[StudentTest](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/4-control-instructions-part-1-adjustment-operators/charapter-04/src/StudentTest.java)| Método main da classe StudentTest |
|[ClassAverage](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/4-control-instructions-part-1-adjustment-operators/charapter-04/src/ClassAverage.java)| Instrução de repetição while |
|[Sentinel](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/4-control-instructions-part-1-adjustment-operators/charapter-04/src/Sentinel.java)| Implementando a repetição controlada por sentinela |
|[Analysis](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/4-control-instructions-part-1-adjustment-operators/charapter-04/src/Analysis.java)| Formulando algoritmos: instruções de controle aninhadas |
|[Increment](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/4-control-instructions-part-1-adjustment-operators/charapter-04/src/Increment.java)| Pré-incremento e Pós-incremento |
|[DrawPanel](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/4-control-instructions-part-1-adjustment-operators/charapter-04/src/DrawPanel.java)| Classe Graphics (do pacote java.awt), que fornece vários métodos para desenhar texto e formas na tela |
|[DrawPanelTest](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/4-control-instructions-part-1-adjustment-operators/charapter-04/src/DrawPanelTest.java)| Método main da classe DrawPanel |

### Resumo

#### Introdução

- Antes de escrever um programa para resolver um problema, você deve ter um entendimento completo do problema e uma abordagem cuidadosamente
planejada para resolvê-lo. Você também deve entender os blocos de construção que estão disponíveis e empregar técnicas de construção
do programa comprovadas.

#### Algoritmos

- Qualquer problema de computação pode ser resolvido executando uma série de ações em uma ordem específica.
- O procedimento para resolver um problema em termos das ações a serem executadas e da ordem em que são executadas é chamado algoritmo.
- Especificar a ordem em que as instruções são executadas em um programa chama-se controle de programa.

#### Pseudocódigo

- Pseudocódigo é uma linguagem informal que ajuda a desenvolver algoritmos sem se preocupar com os estritos detalhes da sintaxe da linguagem
Java.
- pseudocódigo que usamos neste livro é simples ele é conveniente e fácil de usar, mas não é uma linguagem de programação de computador
real. Naturalmente, você pode usar seu próprio idioma nativo para desenvolver seu pseudocódigo.
- O pseudocódigo ajuda você a “estudar” um programa antes de tentar escrevê-lo em uma linguagem de programação como Java.
- O pseudocódigo cuidadosamente preparado pode ser facilmente convertido em um programa Java correspondente.

#### Estruturas de controle

- Normalmente, instruções em um programa são executadas uma após a outra na ordem em que são escritas. Esse processo é chamado execução
sequencial.
- Várias instruções Java permitem a você especificar que a próxima instrução a executar não seja necessariamente a próxima na sequência. Isso
é chamado transferência de controle.
- Bohm e Jacopini demonstraram que todos os programas poderiam ser escritos em termos de somente três tipos de estruturas de controle a
estrutura de sequência, a estrutura de seleção e a estrutura de repetição.
- O termo “estruturas de controle” vem do campo das ciências da computação. A Java Language Specification refere-se a “estruturas de controle”
como “instruções de controle”.
- A estrutura de sequência está incorporada ao Java. A não ser que seja instruído de outra forma, o computador executa as instruções Java uma
depois da outra na ordem em que elas são escritas isto é, em sequência.
- Em qualquer lugar que uma ação única pode ser colocada, várias ações podem ser colocadas em sequência. 

- O Java tem **três tipos de instruções de seleção**.
1. A instrução de seleção única **if** escolhe ou ignora uma ou mais ações.
2. A instrução de seleção dupla **if…else** seleciona entre duas ações ou grupos de ações.
3. A instrução **switch** é chamada de instrução de seleção múltipla, uma vez que seleciona entre muitas ações diferentes (ou grupos de ações).
- O Java fornece as **instruções de repetição** **while**, **do…while** e **for** (também chamada iteração ou loop), que permitem que programas executem
instruções repetidamente enquanto uma condição de continuação de loop permanece verdadeira.
- As instruções while e for realizam a(s) ação(ões) no seu zero de corpos ou mais horas se a condição de continuação do loop for inicialmente
falsa, a(s) ação(ões) não serão executadas. A instrução do…while realiza a(s) ação(ões) no seu corpo uma ou várias horas.
- As palavras if, else, switch, while, do e for são palavras-chave Java. As palavras-chave não podem ser utilizadas como identificadores,
por exemplo, nos nomes de variáveis.
- Cada programa é formado combinando o número de instruções de sequência, seleção e de repetição, conforme apropriado no algoritmo que o
programa implementa.
- As instruções de controle de entrada única/saída única são anexadas uma a outra conectando o ponto de saída de uma instrução ao ponto de
entrada da instrução seguinte. Isso é conhecido como empilhamento de instruções de controle.
- Uma instrução de controle também pode ser aninhada dentro de outra instrução de controle.
