## Maxima, a Computer Algebra System

Maxima é um sistema para a manipulação de expressões simbólicas e numéricas, incluindo diferenciação, integração, série de Taylor, transformadas de Laplace, equações diferenciais ordinárias, sistemas de equações lineares, polinômios, conjuntos, listas, vetores, matrizes e tensores. Maximize os resultados numéricos de alta precisão usando frações exatas, inteiros de precisão arbitrária e números de ponto flutuante de precisão variável. Maxima pode plotar funções e dados em duas ou três dimensões.

O código-fonte do Maxima pode ser compilado em muitos sistemas, incluindo Windows, Linux e MacOS X. O código-fonte para todos os sistemas e binários pré-compilados para Windows e Linux estão disponíveis em [SourceForge file manager](https://sourceforge.net/projects/maxima/files/).


## Formulação do Problema

- Uma caixa com tampa deve ser contruída com base quadrada, de lado a tendo altura **b** (ambos **a** e **b** e, centímetros).
- Esta caixa deve conter 2 listros e deve ter área mínima, de modo a reduzir o custo de fabricação.
- O fornecedor cobra **X R$0.01** por centímetro quadrado.

- Problema: qual deve ser o tamanho da caixa de modo que o seu custo seja mínimo?

Fórmula: `A(a,b) = 2a² + 4ab`
Equacionando o problema (Volume):
O volume é a **base** x **altura**, e deve ser 2 litros: (2000 cm^3)
Fórmula: `V(a,b) = a²b = 2000`

Se procedermos com esse cálculo, o **b** valerá `2000` sobre `a²`
`A(a,b) = 2a² + 4a(2000 / a²)`

Então o substituiremos e cancelaremos um `a` de `4a` com uma potência do `a²` dentro dos parênteses, enquanto o `4` multiplicará por `2000`. Finalmente, o termo `4ab` original ficará somente `8000` sobre `a`.
`A(a) = 2a² + (8000 / a)`

Lembrando que o nosso fornecedor cobra um centavo por `cm²`, multiplicaremos um centavo que é `0,01` do real, pela função da área, obtendo assim a função do custo `C(a)` proporcional à `A(a)`. Ou seja, se a embalagem for maior, custará mais caro, e se for menor, será mais barata.
`C(a) = 0.01A(a)`

Desta forma, a função `C(a)` será a multiplicação de `0.01` pela função `A(a)`, o que será igual a `0.02a²` mais `80` dividido por a, lembrando que o a é a **dimensão linear** da base quadrada de lado `a`.
`C(a) = 0.02a² + (80 / a)`
A função `C(a)` é chamada de **Função Objetiva** do problema.