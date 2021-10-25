## Instruções de controle: parte 2; operadores lógicos

| Nome | Descrição |
| ------ | ------ |
|[WhileCounter](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/5-control-instructions-part-2-logical-operators/charapter-05/src/WhileCounter.java)| Repetição controlada por contador |
|[WhileLoop](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/5-control-instructions-part-2-logical-operators/charapter-05/src/WhileLoop.java)| Condição de continuação do loop |
|[ForCounter](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/5-control-instructions-part-2-logical-operators/charapter-05/src/ForCounter.java)| Instrução de repetição for |
|[ForArithmetic](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/5-control-instructions-part-2-logical-operators/charapter-05/src/ForArithmetic.java)| Colocando expressões aritméticas no cabeçalho de uma instrução for |
|[ForSimpleArithmetic](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/5-control-instructions-part-2-logical-operators/charapter-05/src/ForSimpleArithmetic.java)| Expressões aritméticas simples no cabeçalho de uma instrução for |
|[ForIncrementsByOne](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/5-control-instructions-part-2-logical-operators/charapter-05/src/ForIncrementsByOne.java)| Varie a variável de controle de 1 a 100 em incrementos de 1. |
|[ForDecrementsByOne](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/5-control-instructions-part-2-logical-operators/charapter-05/src/ForDecrementsByOne.java)| Varie a variável de controle de 100 a 1 em decrementos de 1. |
|[ForIncrementsBySeven](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/5-control-instructions-part-2-logical-operators/charapter-05/src/ForIncrementsBySeven.java)| Varie a variável de controle de 7 a 77 em incrementos de 7. |
|[ForDecrementsByTwo](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/5-control-instructions-part-2-logical-operators/charapter-05/src/ForDecrementsByTwo.java)| Varie a variável de controle de 20 a 2 em decrementos de 2. |
|[ForRelativeValue](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/5-control-instructions-part-2-logical-operators/charapter-05/src/ForRelativeValue.java)| Varie a variável de controle em relação aos valores 2, 5, 8, 11, 14, 17, 20. |
|[ForRelativeValueTwo](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/5-control-instructions-part-2-logical-operators/charapter-05/src/ForRelativeValueTwo.java)| Varie a variável de controle em relação aos valores 99, 88, 77, 66, 55, 44, 33, 22, 11, 0. |
|[Sum](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/5-control-instructions-part-2-logical-operators/charapter-05/src/Sum.java)| Soma de inteiros pares de 2 a 20 |
|[ForNumber](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/5-control-instructions-part-2-logical-operators/charapter-05/src/ForNumber.java)| Listas separadas por vírgulas de expressões que permitem utilizar múltiplas expressões de inicialização ou múltiplas expressões de incremento |
|[Interest](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/5-control-instructions-part-2-logical-operators/charapter-05/src/Interest.java)| Cálculos de juros compostos com for |
|[DoWhileTest](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/5-control-instructions-part-2-logical-operators/charapter-05/src/DoWhileTest.java)| Instrução de repetição do...while. |
|[LetterGrades](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/5-control-instructions-part-2-logical-operators/charapter-05/src/LetterGrades.java)| A estrutura de seleção múltipla switch |
|[AutoPolicy](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/5-control-instructions-part-2-logical-operators/charapter-05/src/AutoPolicy.java)| Estudo de caso da classe AutoPolicy: Strings em instruções switch |
|[AutoPolicyTest](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/5-control-instructions-part-2-logical-operators/charapter-05/src/AutoPolicyTest.java)| Main class de AutoPolicy  |
|[BreakTest](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/5-control-instructions-part-2-logical-operators/charapter-05/src/BreakTest.java)| Instruções break |
|[ContinueTest](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/5-control-instructions-part-2-logical-operators/charapter-05/src/ContinueTest.java)| Instruções continue |
|[LogicalOperators](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/5-control-instructions-part-2-logical-operators/charapter-05/src/LogicalOperators.java)| Operadores lógicos |
|[Shapes](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/5-control-instructions-part-2-logical-operators/charapter-05/src/Shapes.java)| Estudo de caso de GUIs e imagens gráficas: desenhando retângulos e ovais |
|[ShapesTest](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/5-control-instructions-part-2-logical-operators/charapter-05/src/ShapesTest.java)| Main classe de Shapes |

## Resumo


### Princípios básicos de repetição controlada por contador
- A repetição controlada por contador requer uma variável de controle, o valor inicial da variável de controle, o incremento pelo qual a variável
de controle é modificada a cada passagem pelo loop (também conhecido como cada iteração do loop) e a condição de continuação do loop, que
determina se um loop deve continuar.
- Você pode declarar uma variável e inicializá-la na mesma instrução.

### Instrução de repetição for

- A instrução while pode ser utilizada para implementar qualquer loop controlado por contador.
- A instrução for especifica todos os detalhes do contador — repetição controlada no cabeçalho.
- Quando a instrução for começa a ser executada, sua variável de controle é declarada e inicializada. Se inicialmente a condição de continuação
do loop for verdadeira, o corpo será executado. Depois de executar o corpo do loop, a expressão de incremento é executada. Então, o teste de
continuação do loop é realizado novamente para determinar se o programa deve continuar com a próxima iteração do loop.
- O formato geral da instrução for é
- 
```
for (inicialização; condiçãoDeContinuaçãoDoLoop; incremento)
instrução
```

onde a expressão inicialização nomeia a variável de controle do loop e fornece seu valor inicial, condiçãoDeContinuaçãoDoLoop é a condição
que determina se o loop deve continuar executando e incremento modifica o valor da variável de controle, para que a condição de continuação
do loop por fim se torne falsa. Os dois pontos e vírgulas no cabeçalho for são necessários.
• A maioria das instruções for pode ser representada com instruções while equivalentes como a seguir:

```
inicialização;
while (condiçãoDeContinuaçãoDoLoop)
{
  instrução
  incremento;
}
```

Em geral, as instruções `for` são utilizadas para repetição controlada por contador e as instruções `while`, para repetição controlada por sentinela.
- Se a expressão de inicialização no cabeçalho for declarar a variável de controle, esta só poderá ser utilizada nessa instrução for — ela não
existirá fora da instrução for.
- As expressões em um cabeçalho for são opcionais. Se a condiçãoDeContinuaçãoDoLoop for omitida, o Java irá supor que ela sempre é verdadeira,
criando assim um loop infinito. Você poderia omitir a expressão inicialização se a variável de controle for inicializada antes do loop.
Você poderia omitir a expressão incremento se o incremento fosse calculado com instruções no corpo do loop ou se nenhum incremento fosse
necessário.
- A expressão incremento em uma instrução for atua como se ela fosse uma instrução independente no fim do corpo de for.
- Uma instrução for pode contar para baixo utilizando um incremento negativo — isto é, um decremento. Se a condição de continuação do loop
for inicialmente false, o corpo da instrução for não executa.

### Exemplos com a estrutura for

O Java trata as constantes de ponto flutuante como `1000.0` e `0.05` como tipo double. De maneira semelhante, o Java trata as constantes de
número inteiro como `7` e `-22` como tipo `int`.
- O especificador de formato `%4s` gera saída para uma String em um tamanho de campo de `4` — isto é, `printf` exibe o valor com pelo menos
4 posições de caractere. Se o valor a ser enviado para a saída for menor do que a largura de 4 posições de caractere, o valor é alinhado à direita
no campo por padrão. Se a largura tiver um valor maior do que 4 posições de caractere, o tamanho do campo é expandido para acomodar o
número apropriado de caracteres. Para alinhar o valor à esquerda, utilize um número inteiro negativo para especificar o tamanho do campo.
- `Math.pow(x, y) `calcula o valor de x elevado à y-ésima potência. O método recebe dois argumentos double e retorna um valor double.
- O flag de formatação vírgula (,) em especificador de formato indica que um valor de ponto flutuante deve ser gerado com um separador de
agrupamento. O separador real utilizado é específico à localidade do usuário (isto é, país). Nos Estados Unidos, o número terá vírgulas que
separam cada três dígitos e um ponto decimal que separa a parte fracionária do número, como em 1,234.45.
- O . em um especificador de formato indica que o número inteiro à direita é a precisão do número.

### Instrução de repetição do…while

- A instrução `do…while` é semelhante à instrução while. No while, o programa testa a condição de continuação do loop no início do loop,
antes de executar seu corpo; se a condição for falsa, o corpo nunca será executado. A instrução do…while testa a condição de continuação do
loop depois de executar o corpo do loop; portanto, o corpo sempre executa pelo menos uma vez.
