### Variável

- Variável é um local reservado na memória para armazenar um tipo de dado.
- Além de ter um **nome**, a variável também precisa ter um **tipo**.
- O tipo de dado de uma variável determina o que ela é capaz de armazenar.

O tipo de uma variável é conhecido como **tipo primitivo**.
- Consiste em 6 tipos que são: `byte`- `short`- `char`- `int`- `long`- `float`->`double`

### Atribuição

Atribuir significa armazenar um valor em uma variável.

* Em linguagem Java usamos o operador `=` para fazer uma atribuição.

Exemplo: `X = 10;`

Este comando atribui o valor `10` para a variável `X`.

* Para poder atribuir um valor a uma variável, esta tem que ter sido previamente declarada.

Abaixo estão alguns exemplos de declarações de variáveis. 

```
int idade = 3;
float sal = 1825.54f;
char = 'G';
boolena casado = false;
long id = 1L;
```
---

### Casting

Casting é a conversão de tipo, ocorre quando você atribui um valor de um tipo de dados primitivo a outro tipo.

- Em Java, existem dois tipos de fundição:

**Ampliando o Casting** (automaticamente) - convertendo um tipo menor em um tamanho de tipo maior

`byte`-> `short`-> `char`-> `int`-> `long`-> `float`->`double`

**Estreitando Casting** (manualmente) - convertendo um tipo maior para um tipo de tamanho menor

`double`-> `float`-> `long`-> `int`-> `char`-> `short->byte`


**Typecast**
```
int idade = (int) 3;
float sal = (float) 1825.54;
char letra = (char) 'G';
boolean casado = (boolean) false;
```
**Wrapper Class** (invólucro)
```
Integer idade = new Integer(3);
Float sal = new Float(1825.54);
Charactere letra = new Charactere('G');
Boolean casado = new Boolean(false);
```

| Família| Tipo Primitivo | Classe Invólucro | Tamanho | Exemplo |
| ------ | ------ | ------ | ------ | ------ |
| Lógico | boolean | Boolean |1 bit | true |
| Líterias | char | caracter | 1 byte |  'a' |
| Líterias | - | String| 1 byte/cada |  "Java" |
| Inteiros | byte | Byte | 1 byte  |  127 |
| Inteiros | short | Short  | 2 byte | 32 767 |
| Inteiros | int | Integer| 4 byte | 2 147 483 |
| Inteiros | long| Long | 8 byte | 2^63 |
| Reais| float | Float | 4 bytes | 3.4e^+38 |
| Reais| double| Double| 8 bytes | 1.8e^+308 |

---


| Simbolo | Descrição | valor | Resultado |
| ------ | ------ | ------ | ------ |
| + | Adição | 5 + 2| 7 |
| - | Subtração | 5 - 2 | 3 |
| * | Multiplicação | 5 * 2 | 10 |
| / | Divisão |5 / 2| 1 |

---

### Operadores de atribuição

| Simbolo | Descrição | valor | Resultado |
| ------ | ------ | ------ | ------ |
| += | Somar e atribuir | a += b | a = a + b |
| -= | Subtrair e atribuir | a -= b | a = a * b |
| *= | Mmultiplicar e atribuir | a *= b | a = a / b |
| /= | Dividir e atribuir | a %= b | a = a / b |
| %= | Resto e atribuir | a %= b | a = a % b |

---

### Classe Math

| Simbolo | Descrição | valor | Resultado |
| ------ | ------ | ------ | ------ |
| PI | Constante | Math.PI | 3.1415 |
| pow | Exponenciação | Math.pow(5,2) | 25 |
| sqrt | Raiz Quadrada | Math.sqrt(25) | 5 |
| cbrt | Raiz Cúbica | Math.cbrt(27) | 3 |
| abs | Valor Absoluto | Math.abs(-10) | 10 |
| floor | Arredonda para Baixo | Math.floor(3.9) | 3 |
| ceil | Arredonda para cima | Math.ceil(4.2) | 5 |
| round | Arredonda Aritmeticamente | Math.round(5.6) | 6 |

---

### Operador Ternário

```
Se (n1 > n2) então
  maior = n1
senão
  maior = n2
FimSe
```

```
maior = n1 > n2 ? n1 : n2;
```
---

### Operador Relacional

| Simbolo | Descrição | valor | Resultado |
| ------ | ------ | ------ | ------ |
| >  | Maior que | 5 > 2  |true |
| <  | Menor que | 4 < 1  |false |
| >= | Maior ou iqual a | 8 >= 3 | true |
| <= | Menor ou igual a  | 6 <= 6 | true |
| == | Igual a | 9 == 8 | false |
| != | Diferente de | 4 != 5 | true |

---

### Operador Lógicos

| p | q | p AND q |
| ------ | ------ | ------ |
| V | V | V |
| V | F | F |
| F | V | F |
| F | F | F |

| p | q | p OR q |
| ------ | ------ | ------ |
| V | V | V |
| V | V | V |
| F | V | V |
| F | F | F |

| p | q | p ^ q |
| ------ | ------ | ------ |
| V | V | F |
| V | V | V |
| F | V | V |
| F | F | F |

| p | !p |
| ------ | ------ |
| V | F |
| F | V |

---

## Exercícios

Uma pilha é uma versão limitada de uma list encadeada. Novos
só podem ser adicionados e retirados de uma pilha pelo topo. Em Java, a classe
**Stack** possui métodos de manipulaçao em pilhas. Em pacotes a classe Stack está definida.

- A)✔️ java.util
- B) java.lang
- C) java.net
- D) java.io
- E) java.swt

---

Na linguagem de programação Java, que palavra-chave cria um **objeto** de um classe especifica?

- A) MAIN
- B) PUBLIC
- C) CLASS
- D) PRIVATE
- E)✔️ NEW

---

Em relação ao tipos básicos de dados (tipos primitivos),
assinale a opção INCORRETA.

- A) booleano (ou lógico): conjunto de valores false ou verdadeiro.
- B)✔️ vetor: estrutura que suporta NxM posições de um mesmo tipo
- C) caracter: qualquer conjunto de caracteres alfanuméricos.
- D) inteiro: qualquer número inteiro, negativo, nulo ou positivo.
- E) real: qualquer número real, negativo, nulo ou positivo.

---
Marque 1 para dados do tipo inteiro e 2 para dados de outeos tipos

```
( ) "582.4"
```

```
( ) .verdadeiro.
```

```
( ) 105
```

```
( ) -102
```

```
() "0"
```

```
() "informação"
```

```
() 0.82
```

- A) 2, 2, 1, 1, 1, 2, 1
- B)✔️ 2, 2, 1 ,1, 2, 2, 2
- C) 1, 1, 1, 2, 2, 1, 2
- D) 1, 2, 2, 2, 1, 1, 1

---

Assinale a alternativa que contenha somente nomes válidos de variáveis

- A) índice, #pagina, contexto
- B)✔️ nome1, sobrenome2, senha3
- C) 2-nome, sobrenome, endereco
- D) 1-nome, 2-sobrenome, 3-senha

---

Assinale a alternativa que completa corretamente a lacuna da afirmativa a seguir.

São caracterizados como tipos_____os dados numériocos positivos ou negativos, excluindo-se destes qualquer fracionário.

- A) caracteres
- B) lógicos
- C)✔️ inteiros
- D) reais

--

Considerando os tipo de dados, relacione as colunas e , a seguir, assinale a alternativa com a sequência correta.

(1) Inteiro

(2) Reais

(3) Caracteres

(4) Lógicos

```
( ) 35; 0; -56
```

```
( ).F; .V
```

```
( )"Rua Brigadeiro Layra"
```

```
( ) -0,5; 1,8; -4
```

- A) 3, 1, 4, 2
- B) 2, 4 ,3, 1
- C) 1, 2, 3, 4
- D)✔️ 1, 4, 3, 2

---

### Exercícios de Java #07

Considerando o trecho de código a seguir, contruíndo em linguagem Java, marque a opção que preencha as lacunas:

```
int n = 4;
System.out.println("O valor da variável é " + n ++);
```

Executando as linhas acima, será exibida a mensagem "O valro da variável é____" e o valor final de n após a execução será___.

- A) 3 e 4
- B)✔️ 4 e 5 
- C) 5 e 5
- D) 3 e 3

---

Considerando o tratamento de tipos primitivos pelo Java, analise o código a seguir e indique que o valor será impresso na tela

```
int n1 = 2, n2 = 5;
double resultado = n2 / n1;
System.out.print(resultado);
```

- A) 5.0
- B)✔️ 2.0
- C) 2.5
- D) 3.0

---

Execute as três instruções Java a seguir e marque  opção que contém o val0r que será impresso na tela:

```
int v1 = 7, v2 = v1 % 2, v3 = 2;
v3 += v2;
System.out.printlnU(v1 + "" + v2 + "" + v3);
```

- A) 7 2 4
- B) 7 1 1 
- C)✔️ 7 1 3
- D) 7 0 2

```
V1 = 7
V2 = V1(7) / 2 = 1
V3 = 2
V3 = 2 + V2(1) = 3
System.out.printlnU(v1 + "" + v2 + "" + v3);
7 1 3
```
---

### Exercícios de Java #08

Dados as linhas a seguir:

```
int x = 8, y = 3;
int w = x / y;
Sting z = (w % 2 == 0) ? "frase1":"frase2";
System.out.println(z);
```
P que acontecerá se esse código for executado?

- a) Um erro de tipo na variável w
- b) Um erro de atribuição na vaiável z
- c)✔️ Será impresso "frase1"
- d) Será impresso "frase2"

---

Analise o código a seguir e infique o que será impresso na tela:

```
String parte1 = "Curso";
String parte2 = "Video";
String parte3 = parte1 + parte2;
String parte4 = "CursoVideo";
System.out.println(parte3 == parte4);
System.out.println(parte3.equals(parte4));
```
- a) CursoVideo
- b)✔️ false true
- c) tru true
- d) true false

- Obs: `==` compara se dois objestos sao iguais
- `.equals` compara se o conteudo de dois objetos sao iguais

---

Analise o código a seguir e indique o que será impresso na tela:

```
boolean val1 = (4>=5), val2 = (4<4), val13 = (val1==val2);
boolean val4 = val1 ^ va13;
boolean val5 = !val2 && val4;
System.out.println(val4 + "" + val15);
```
- a)✔️ true true
- b) false true
- c) false false
- d) true false
