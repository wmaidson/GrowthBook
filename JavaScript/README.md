## Introdução a JavaScript

- JavaScript é uma linguagem de programação de auto nível, dinâmica, **interpretada** e não tipada, conveniente para estilos de programação orientados a objetos e funcionais. A sintaxe de JavaScript é derivada da linguagem Java, das funções de primeira classe de **Schema** e da herança baseada em protótipagem de **Self**.

- JavaScript foi criada pela [`Netscape`](https://pt.wikipedia.org/wiki/Netscape) na fase inicial da Web, JavaScript é marca registrada e licenciada pela [`Sun Microsystems`](https://pt.wikipedia.org/wiki/Sun_Microsystems) agora pertence a [`Oracle`](https://pt.wikipedia.org/wiki/Oracle_Corporation), usada para descrever a implementação da linguagem pelo `Netscape` que agora é Mozilla Foundation[(`moz://a`)](https://pt.wikipedia.org/wiki/Mozilla_Foundation).
A Netscape enviou a Linguagem para a [`ECMA`](https://pt.wikipedia.org/wiki/Ecma_International)(acrônimo para **E**uropean **C**omputer **M**anufacturers **A**ssociation) devido a padronização e questões relacionadas a registro da marca.
A versão padronizda manteve o nome de [`ECMAScript`](https://pt.wikipedia.org/wiki/ECMAScript), atualmente está na versão 10 conhecida como `ES10`

## Estrutura léxica

- A estrutura léxica de uma linguagem de programação é o **conjunto de regras elementares** que especificam o modo de escrever programas nesta linguaguem.

##### Conjunto de caracteres

-  Os programas JavaScript são escritos com conuntos de catactes [`Unicode`](https://pt.wikipedia.org/wiki/Unicode). Unicode é um superconjunto de [`ASCII`](https://pt.wikipedia.org/wiki/ASCII)( **A**merican **S**tandard **C**ode for **I**nformation **I**nterchange) e [`Latin-1`](https://pt.wikipedia.org/wiki/ISO/IEC_8859-1)(ISO/IEC 8859-1)

##### Diferenciação de maiúscula e minúscula

- JavaScript é [**case-sensitive**](https://pt.wikipedia.org/wiki/Case-sensitive) é uma linguagem que diferencia maiúscula de minúscula. Iso significa que palavras-chaves, variáveis, nome de funções e outros identificadores da linguagem devem ser digitados com a composição compatível da letra.
Por exemplo a palavra chave `while` não é igual a `While` e `WHILE`.
Entretando, HTML **não diferencia letra maiúscula de minúscula**, isso pode confundir muitos programadores iniciantes porque JavaScript é muito utilizado no lado do cliente (Front-End)

##### Epaço em branco, quebra de linhas e caracteres de controle de formato, pontos e vírgulas

- JavaScript ignora espaços que aparecem entre sinais e também ignora quebras de linhas(mas a exceções)
Assim como muitas linguagens de programação.JavaScript usa o ponto e vírgula (`;`) para **separar instruções**.
Isso é importante para tornar claro o significado de seu código sem um **separador**, o fim de uma instrução pode parecer o início da segunda ou vice-versa. Normalmente em JavaScript você pode omitir o ponto e virgula entre duas **instruções** caso essas sejam escritas em linhas separadas, ou se o próximo sinal seja uma chave de fechamento (`{}`).
Exemplo válido:

```js
a = 3;
b = 4;
```

Exemplo válido:

```js
a = 3
b = 4;
```
Exemplo invalido:
```js
a = 3;
b = 4
```

Exemplo válido:

```js
a = 3; b = 4 ;
```
Exemplo invalido:

```js
a = 3 b = 4 ;
```

##### Palavras Reservadas

- JavaScrip reserva vários identificadores como palavras-chaves da própria linguagem. Você não pode usar essas palavras como identificadores em seu programas, você pode ver a lista completa [`aqui`](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Lexical_grammar#palavras-chave_reservadas_do_ecmascript_2021)

<h1 align="center">
<img alt="lexicalGrammar" src=".github/lexicalGrammar.png" height="300px" />
</h1>

##### Comentários

- JavaScript aceita dois estilos de comentários. Qualquer texto entre `//` e o final de uma linha é tratado como comentário e é ignorado pelo JavaSript. E qualquer bloco de texto escrito com `/*` e `*/` são tratados como comentarios.

Exemplo:
 
```js
// Esse é um comentário de uma linh.

/*
Esse é um comentário em bloco.
Esse é um comentário em bloco.
Esse é um comentário em bloco.
*/
```

##### Literais

- Um _literal_ é **um valor de dados que aparece diretamente em um programa**. Os valores seguintes são todos literais.

Exemplo:

| Literal | Descrição |
| ------ | ------ |
| `12` | Um inteiro |
| `1.2` | Um ponto flutuante |
| `"Hello"` | Uma string de texto |
| `"Hi"` | Outra string |
| `true` | Um valor booleano |
| `false` | Outro valor booleano |
| `/javascript/gi` | Uma "expressão regular" literal (para comparação de padrões) |
| `null` | Ausência de um objeto |

## Identificadores

Um **identificador** é simplesmente um nome. Em JavaScript, os identificadores são usados para dar
nomes a variáveis e funções e para fornecer rótulos para certos laços no código JavaScript. Um identificador
JavaScript deve começar com uma letra, um sublinhado (`_`) ou um cifrão (`$`). Os caracteres
subsequentes podem ser letras, dígitos, sublinhados ou cifrões. (Os dígitos não são permitidos como
primeiro caractere, para que JavaScript possa distinguir identificadores de números facilmente.) Todos
estes são identificadores válidos:

```
i
my_variable_name
v13
_dummy
$str
```
## Tipos, valores e variáveis


Os programas de computador funcionam manipulando valores, como o número 3,14 ou o texto
“Olá Mundo”. Os tipos de valores que podem ser representados e manipulados em uma linguagem
de programação são conhecidos como **tipos** e uma das características mais fundamentais de uma linguagem
de programação é o conjunto de tipos que ela aceita.
Quando um programa precisa manter um valor para uso futuro, ele atribui o valor (ou “armazena” o valor) a uma **variável**.

Os tipos de JavaScript podem ser divididos em duas categorias: **tipos primitivos** e **tipos de objeto**.

Os valores especiais `null` e `undefined` de JavaScript são valores primitivos, mas não são números, nem
strings e nem booleanos. Cada valor normalmente é considerado como **membro único de seu próprio
tipo especial**.

Qualquer valor em JavaScript que não seja número, string, booleano, `null` ou `undefined` é um objeto.

Um objeto (isto é, um membro do tipo objeto) é um conjunto de propriedades, em que cada propriedade
tem um nome e um valor (ou um valor primitivo, como um número ou string, ou um objeto).

Um objeto normal em JavaScript é um conjunto não ordenado de valores nomeados. A linguagem
também define um tipo especial de objeto, conhecido como array, que representa um conjunto
ordenado de valores numerados. A linguagem JavaScript contém sintaxe especial para trabalhar com
arrays, sendo que os arrays têm um comportamento especial que os diferencia dos objetos normais.


JavaScript define outro tipo especial de objeto, conhecido como função. Uma função é um objeto
que tem código executável associado. Uma função pode ser chamada para executar esse código executável
e retornar um valor calculado.

As funções que são escritas para serem usadas (com o operador `new`) para inicializar um objeto criado
recentemente são conhecidas como **construtoras**.

Cada construtora define uma classe de objetos
o conjunto de objetos inicializados por essa construtora. As classes podem ser consideradas como
subtipos do tipo de objeto. Além das classes `Array` e `Function`, JavaScript básica define outras três
classes úteis. A classe `Date` define objetos que representam datas. A classe `RegExp` define objetos que
representam expressões regulares (uma poderosa ferramenta de comparação de padrões e a classe `Error` define objetos que representam erros de sintaxe e de execução que
podem ocorrer em um programa JavaScript.

#### [Classe](https://medium.com/@viniazvd/classes-vs-fun%C3%A7%C3%B5es-construtoras-vs-fun%C3%A7%C3%B5es-f%C3%A1brica-b92a6afa70a4)
É uma função construtora. Ou seja, uma estrutura que descreve estados e comportamentos de um objeto.
Foram introduzidas no ECMAScript 6 e são simplificações da linguagem para as heranças baseadas nos protótipos. Mas preste atenção:

JavaScript não possui classes!
A sintaxe para classes não introduz um novo modelo de herança de orientação a objetos em JavaScript. É apenas uma abstração! Ou seja, uma forma mais simples -principalmente para quem veio de linguagens orientadas a objeto- de criar objetos e lidar com herança.

#### [Função Construtora](https://medium.com/@viniazvd/classes-vs-fun%C3%A7%C3%B5es-construtoras-vs-fun%C3%A7%C3%B5es-f%C3%A1brica-b92a6afa70a4)
Um construtor é basicamente uma função. Ela pode ser executada como uma função ou pode ser utilizada para instanciar um objeto utilizando a palavra reservada new.

#### [Função Fábrica](https://medium.com/@viniazvd/classes-vs-fun%C3%A7%C3%B5es-construtoras-vs-fun%C3%A7%C3%B5es-f%C3%A1brica-b92a6afa70a4)
Podemos resumir uma função fábrica como um gerador de objetos.
Em JavaScript, qualquer função pode retornar um objeto. Mas, quando isso acontece sem o new, é uma função de fábrica. Ou seja, quando uma função não é uma classe ou um construtor, é uma função fábrica.

Tecnicamente, em JavaScript apenas os objetos
possuem métodos. Mas números, strings e valores booleanos se comportam como se tivessem métodos Em JavaScript, `null` e `undefined` são os únicos valores
em que métodos não podem ser chamados.

####  [Mutáveis e Imutáveis](https://developer.mozilla.org/pt-BR/docs/Glossary/Mutable)
Os tipos de JavaScript podem ser divididos em tipos primitivos e tipos de objeto. E podem ser divididos
em tipos com métodos e tipos sem métodos. Também podem ser classificados como tipos
mutáveis e imutáveis. Um valor de um tipo mutável pode mudar. Objetos e arrays são mutáveis: um
programa JavaScript pode alterar os valores de propriedades do objeto e de elementos de arrays.
Números, booleanos, null e undefined são imutáveis – nem mesmo faria sentido falar sobre alterar
o valor de um número, por exemplo. As strings podem ser consideradas arrays de caracteres, sendo
que se poderia esperar que fossem mutáveis. No entanto, em JavaScript as strings são imutáveis: você
pode acessar o texto de determinado índice de uma string, mas JavaScript não fornece uma maneira

JavaScript converte valores de um tipo para outro de forma livre.
Se um programa espera uma string, por exemplo, e você fornece um número, ele converte o número em string automaticamente.
Se você usa um valor não booleano onde é esperado um booleano, JavaScript converte adequadamente.
As regras de conversão de valor liberais de JavaScript afetam sua definição de igualdade, 
sendo que o operador de igualdade == realiza conversões de tipo.

Quando um número aparece diretamente em um programa JavaScript, ele é chamado de `literal
numérico`.

## Aritmética em JavaScript

Os programas JavaScript trabalham com números usando os operadores aritméticos fornecidos pela
linguagem. Isso inclui + para adição, – para subtração, * para multiplicação, / para divisão e % para
módulo (resto da divisão).

| objeto Math | Descrição |
| ------ | ------ |
| Math.pow(2,53) | 9007199254740992: 2 elevado à potência 53 |
| Math.round(.6) | 1.0: arredonda para o inteiro mais próximo |
| Math.ceil(.6) | 1.0: arredonda para cima para um inteiro |
| Math.floor(.6) | 0.0: arredonda para baixo para um inteiro |
| Math.abs(-5)  | 5: valor absoluto |
| Math.max(x,y,z) | Retorna o maior argumento |
| Math.min(x,y,z) | Retorna o menor argumento |
| Math.random() | Número pseudoaleatório x, onde 0 <= x < 1.0 |
| Math.PI | π: circunferência de um círculo / diâmetro |
| Math.E | e: A base do logaritmo natural|
| Math.sqrt(3) | A raiz quadrada de 3 |
| Math.pow(3, 1/3) | A raiz cúbica de 3 |
| Math.sin(0) | Trigonometria: também Math.cos, Math.atan, etc. |
| Math.log(10)  | Logaritmo natural de 10 |
| Math.log(100)/Math.LN10  | Logaritmo de base 10 de 100 | 
| Math.log(512)/Math.LN2 | Logaritmo de base 2 de 512 |
| Math.exp(3) | Math.E ao cubo |

JavaScript predefine as variáveis globais `Infinity` e `NaN` para conter o infinito positivo e o valor **not--a-number**.

## Datas e horas

JavaScript básico inclui uma construtora `Date()` para criar objetos que representam datas e horas.
Esses objetos Date têm métodos que fornecem uma API para cálculos simples de data. Os objetos
Date não são um tipo fundamental como os números.



| objeto Math | Descrição |
| ------ | ------ |
| var then = new Date(2010, 0, 1); | O 1º dia do 1º mês de 2010 |
| var later = new Date(2010, 0, 1,  17, 10, 30); | O mesmo dia, às 5:10:30 da tarde, hora local |
| var now = new Date(); | A data e hora atuais |
| var elapsed = now – then; | Subtração de data: intervalo em milissegundos |
| later.getFullYear() | => 2010 |
| later.getMonth() | => 0: meses com base em zero |
| later.getDate() | => 1: dias com base em um |
| later.getDay() | => 5: dia da semana. 0 é domingo, 5 é sexta-feira. |
| later.getHours() | => 17: 5 da tarde, hora local |
| later.getUTCHours() | Horas em UTC; depende do fuso horário |
| later.toString() | => "Sexta-feira, 01 de janeiro de 2010, 17:10:30 GMT-0800  (PST)" |
| later.toUTCString() | => "Sábado, 02 de janeiro de 2010, 01:10:30 GMT"
| later.toLocaleDateString() | => "01/01/2010" |
| later.toLocaleTimeString() | => "05:10:30 PM" |
| later.toISOString() | => "2010-01-02T01:10:30.000Z"; somente ES5 |

## Texto

Uma string é uma sequência ordenada imutável de valores de 16 bits, cada um dos quais normalmente
representa um caractere Unicode – as strings são um tipo de JavaScript usado para representar
texto. O comprimento de uma string é o número de valores de 16 bits que ela contém. As strings (e
seus arrays) de JavaScript utilizam indexação com base em zero: o primeiro valor de 16 bits está na
posição 0, o segundo na posição 1 e assim por diante. A string vazia é a string de comprimento 0.
JavaScript não tem um tipo especial que represente um único elemento de uma string. Para representar
um único valor de 16 bits, basta usar uma string que tenha comprimento 1.

| Codigo | Saida |
| ------ | ------ |
| \0 | o  caractere NULL |
| \\' | aspas simples |
| \\"	| aspas duplas |
| \\	| barra invertida |
| \n	| nova linha |
| \r	| carriage return |
| \v	| tab vertical |
| \t	| tab |
| \b	| backspace |
| \f | form feed | 
| \uXXXX | unicode codepoint |
| \xXX	| the Latin-1 character |

## Trabalhando com strings

Um dos recursos incorporados a JavaScript é a capacidade de concatenar strings. Se o operador + é
utilizado com números, ele os soma. Mas se esse operador é usado em strings, ele as une, anexando
a segunda na primeira. Por exemplo:

```
msg = "Hello, " + "world"; // Produz a string "Hello, world"
greeting = "Welcome to my blog," + " " + name;
```
Para determinar o comprimento de uma string – o número de valores de 16 bits que ela contém –
use sua propriedade length. Determine o comprimento de uma string s como segue:
s.length

```
s.length
```
Além dessa propriedade length, existem vários métodos que podem ser chamados em strings

| Codigo | Descrição |
| ------ | ------ |
| var s = "hello, world" | Começa com um texto. |
| s.charAt(0) | => "h": o primeiro caractere. |
| s.charAt(s.length-1) | => "d": o último caractere. |
| s.substring(1,4) | => "ell": o 2º, 3º e 4º caracteres. |
| s.slice(1,4) | => "ell": a mesma coisa |
| s.slice(-3) | => "rld": os últimos 3 caracteres |
| s.indexOf("l") | => 2: posição da primeira letra l. |
| s.lastIndexOf("l") | => 10: posição da última letra l. |
| s.indexOf("l", 3) | => 3: posição do primeiro "l" em ou após 3 |
| s.split(", ") |  => ["hello", "world"] divide em substrings | 
| s.replace("h", "H") |  => "Hello, world": substitui todas as instâncias | 
| s.toUpperCase() |  => "HELLO, WORLD" | 

## Valores booleanos
Um valor booleano representa verdadeiro ou falso, ligado ou desligado, sim ou não. Só existem dois
valores possíveis desse tipo. As palavras reservadas true e false são avaliadas nesses dois valores.
Geralmente, os valores booleanos resultam de comparações feitas nos programas JavaScript. Por
exemplo:
a == 4
Esse código faz um teste para ver se o valor da variável a é igual ao número 4. Se for, o resultado dessa
comparação é o valor booleano `true`. Se a não é igual a 4, o resultado da comparação é `false`.
Os valores booleanos são comumente usados em estruturas de controle em JavaScript. Por exemplo,
a instrução `if/else` de JavaScript executa uma ação se um valor booleano é true e outra ação se o valor
é `false`. Normalmente, uma comparação que gera um valor booleano é combinada diretamente
com a instrução que o utiliza. O resultado é o seguinte:

```
if (a == 4)
b = b + 1;
else
a = a + 1;
```

Em JavaScript qualquer valor pode ser convertido em um valor booleano.
Os valores a seguir são convertidos (e, portanto, funcionam como) em false:

```
undefined
null
0
-0
NaN
"" // a string vazia
```
## null e undefined

Apesar dessas diferenças, tanto `null` quanto `undefined` indicam uma ausência de valor e muitas
vezes podem ser usados indistintamente. O operador de igualdade `==` os considera iguais. (Para diferenciá-
los, use o **operador de igualdade restrito** `===`.) Ambos são valores falsos – eles se comportam
como false quando um valor booleano é exigido. Nem null nem undefined tem propriedades ou
métodos. Na verdade, usar . ou [] para acessar uma propriedade ou um método desses valores causa
um TypeError.

## O objeto global

O objeto global é um objeto normal de JavaScript que tem um objetivo muito importante: as propriedades desse objeto
são os símbolos definidos globalmente que estão disponíveis para um programa JavaScript. Quando
o interpretador JavaScript começa (ou quando um navegador Web carrega uma nova página), ele
cria um novo objeto global e dá a ele um conjunto inicial de propriedades que define:

- propriedades globais, como `undefined`, `Infinity` e `NaN`
- funções globais, como `isNaN()`, `parseInt()` e `eval()`
- funções construtoras, como `Date()`, `RegExp()`, `String()`, `Object()` e `Array()`
- objetos globais, como Math e JSON

As propriedades iniciais do objeto global não são palavras reservadas, mas merecem ser tratadas
como se fossem.

No código de nível superior – código JavaScript que não faz parte de uma função –, pode-se usar a
palavra-chave `this` de JavaScript para se referir ao objeto global:

```
var global = this; // Define uma variável global para se referir ao objeto global
```

## Objetos wrapper

Os objetos JavaScript são valores compostos: eles são um conjunto de propriedades ou valores nomeados.
Ao usarmos a notação . fazemos referência ao valor de uma propriedade. Quando o valor
de uma propriedade é uma função, a chamamos de **método**. Para chamar o método m de um objeto
o, escrevemos `o.m()`.

Também vimos que as strings têm propriedades e métodos:

```
var s = "hello world!"; // Uma string
var word = s.substring(s.indexOf(" ")+1, s.length); // Usa propriedades da string
```

Contudo, as strings não são objetos. Então, por que elas têm propriedades? Quando você tenta se
referir a uma propriedade de uma string s, JavaScript converte o valor da string em um objeto como
se estivesse chamando `new String(s)`.
Esse  objeto herda métodos da string eé utilizado para solucionar a referência da propriedade.
Uma vez solucionada a propriedade, o objeto
recentemente criado é descartado. (As implementações não são obrigadas a criar e descartar esse
objeto transitório – contudo, devem se comportar como se fossem.)

Números e valores booleanos têm métodos pelo mesmo motivo que as strings: um objeto temporário
é criado com a construtora Number() ou Boolean() e o método é solucionado por meio desse
objeto temporário. Não existem objetos empacotadores (wrapper) para os valores null e undefined:
qualquer tentativa de acessar uma propriedade de um desses valores causa um TypeError.
Considere o código a seguir e pense no que acontece quando ele é executado:

```
var s = "test"; // Começa com um valor de string.
s.len = 4; // Configura uma propriedade nele.
var t = s.len; // Agora consulta a propriedade.
```

Os objetos temporários criados ao se acessar uma propriedade de uma string, número ou valor booleano
são conhecidos como **objetos empacotadores (wrapper)** e ocasionalmente pode ser necessário
diferenciar um valor de string de um objeto String ou um número ou valor booleano de um objeto
Number ou Boolean. Basta saber que string, número e valores
booleanos diferem de objetos pois suas propriedades são somente para leitura e que não é possível
definir novas propriedades neles.

## Valores primitivos imutáveis e referências de objeto mutáveis

Em JavaScript existe uma diferença fundamental entre valores primitivos (undefined, null, booleanos,
números e strings) e objetos (incluindo arrays e funções). Os valores primitivos são imutáveis:
não há como alterar (ou “mudar”) um valor primitivo. Isso é óbvio para números e booleanos – nem
mesmo faz sentido mudar o valor de um número. No entanto, não é tão óbvio para strings. Como
as strings são como arrays de caracteres, você poderia pensar que é possível alterar o caractere em
qualquer índice especificado. Na verdade, JavaScript não permite isso e todos os métodos de string
que parecem retornar uma string modificada estão na verdade retornando um novo valor de string.
Por exemplo:

```
var s = "hello"; // Começa com um texto em letras minúsculas
s.toUpperCase(); // Retorna "HELLO", mas não altera s
s // => "hello": a string original não mudou
```
