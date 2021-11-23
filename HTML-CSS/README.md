

## HTML Sintaxe

| Elemento / tag | Descrição |
| ------ | ------ |
| `<html></html>` | Indica que qualquer coisa entre ela é código HTML. |
| `<head></head>` | Antes do elemento `<body>` Esse elemento contem informações sobre a página(Em vez de informações que são exibidas na parte principal da janela no navegador) . |
| `<title></title>` | O conteúdo do elemento `<title>` é exibido na parte superior do navegador, acima onde você costuma digitar o URL. |
| `<body></body>` | Indica que qualquer coisa entre ela deve ser exibida na janela principal do navegador. |
| `<h1></h1>` | A palavra entre`<h1>` e `</h1>` são um título principal . |
| `<h2></h2>` | A palavra entre`<h2>` e `</h2>` formam um subtítulo . |
| `<p></p>` | **paragraph** - A palavra entre`<p>` e `</p>` formam um parágrafo . |
| `<>` | `<` Conchete angurar esquerdo (sinal menor que), `>` Conchete angurar direito(sinal maior que ) |
| `<p>` | `p` caractere , `<p>` tag de abertura |
| `</p>` | `/` barra , `</p>` tag de fechamento |
| `<p lang="en">` | `lang` nome do atributo , `"en"` valor do atributo |
| `<h1><h6>` | **headings** - `h1` tem seis "níveis" de titulos |
| `<b></b>` | **bold** - Colocando as palavras entre as tags `<b>` e `</b>` podemos exibir os caracteres em negrito |
| `<i></i>` | **italic** - Colocando as palavras entre as tags `<i>` e `</i>` podemos exibir os caracteres em itálico |
| `<sup></sup>` | **superscript** - O elemento `<sup>` é usado para conter caracteres que devem ser sobrescrito como os sufixos das datas ou conceitos matemáticos como elevar um número a uma potência.  |
| `<sub></sub>` | **subscript** - O elemento `<sub>` é usado para conter caracteres que devem ser subscrito ele é comumente utilizado em notas de rodapé ou fórmulas químicas.  |
| `<br />` | **line-break** - O elemento `<br>` é usado para quebra de linha.  |
| `<hr />` | **horizontal-rules** - Para criar uma quebra de linha entre temas ___ como uma alteração no tema em um livro ou uma nova cena em uma peça adcione uma linha horizontal entre as secções usando a tag  `<hr />`.  |
| `<strong></strong>` | **strong** - O uso do elemento `<strong>` indica que o conteúdo tem grande importância. Por exemplo as palavras contidas nesse elemento podem ser destacadas por um leitor de tela. Por padrão, os navegadores exibirão o conteúdo de um elemento `<strong>` em negrito .  |
| `<em></em>` | **emphasis** - O elemento `<em>` indica ênfase que sultimente muda o significado de uma fase. Por padrão, os navegadores exibirão o conteúdo de um elemento `<em>` em itálico |
| `<blockquote></blockquote>` | **blockquote** - bloco de citação - O elemento `<blockquote>` é usado para citações mais longas que oculpam um paragrafo inteiro. OS navegadores tendem a recuar o conteúdo do elemento. |
| `<q></q>` | **quotations** - citação - O elemento `<q>` é usado para citações mais curtas que permanecem dentro de um paragrafo. OS navegadores tendem a recuar o conteúdo do elemento. |
| `cite="https://"` |  Os dois elementos `<blockquote>` e `<q>` podem usar o atributo `cite` para indicar de onde vem a citação. Seu valor deve ser um URL que terá mais informações sobre fonte de citação.|
| `<abbr></abbr>` | **abbreviations** - Se você usa abreviação ou acrônimo, pode empregar o elemento`<abbr>` um atributo `tittle=""` é usado para especificar o termo completo. |
| `<cite></cite>` | **citations** - Ao fazer uma referência a uma parte do trabalho como um livro, filme, artigo de pesquisa, o elmento `<cite>` pode ser usado para indicar fonte de citação. Os navegadores exibem o conteúdo de um elemento `<cite>` em itálico |
| `<dfn></dfn>` | **definitions** - Na primeira vez que você explica alguma nova terminologia(talvez um conceito acadêmico ou algum jargão) em um documento, isso é conhecido como definição de um termo na primeira ocorrência. O elemento `<dfn>` é indicado para isso. |
| `<address></address>` | **address** - O elemento `<address>` tem uma utilização muito específica. conter detalhes para contato com o autor da página. Os navegadores costuman exibir o conteúdo do elemento em itálico |
| `<ins></ins>` | **insert** - O elemento `<ins>` pode ser usado para mostrar o conteúdo que foi inserido em um documento. O conteúdo normalmente é sublinhado |
| `<del></del>` | **delete** - O elemento `<del>` pode ser usado para exibir texto que foram excluído dele. O conteúdo geralmente é rabiscado |
| `<s></s>` | **strikethrough**. -  O elemento `<s>` indica que algo não é mais exato ou relevante(mas que não deve ser excluído). Visualmente o conteúdo geralmente será exibido com um risco no meio do texto |
| `<ol></ol>` | **ordered-lists**. -  A lista ordenada é criada com o elemento `<ol>` |
| `<li></li>` | **list-items**. - Cada elemento da lista é colocado dentro entre uma tag de abertura `<li>` e uma tag de fechamento '</li>`(O li siginifica item da lista). Os navegadores recuam a listas por padrão  |
| `<ul></ul>` | **unordered-lists**. -  A lista não ordenada é criada com o elemento `<ul>` |
| `<dl></dl>` | **definitions-lists**. -  A lista de definição é criada com o elemento `<dl>` e geralmente consiste de uma série de termos e suas definições. Dentro do elemento você costuma ver pares de elementos `<dt>` e `<dt>` |
| `<dt></dt>` | **definitions-term**. - Isso é usado para conter o termo a ser definido(a definição do termo) |
| `<dd></dd>` | **definitions-details**. - Isso é usado para conter o definição |
| `<a></a>` | **anchor**. - Links são criados usando o elemento `<a>` que tem um atributo chamado `href` o valor do atributo de href é a URL link alvo |
| `<a href="">` | `href="https://"` Está é a página para qual o link leva você |
| `<img>` | **images**. - Para adicionar uma imagem à uma página, você precisa usar um elemento `<img>` Esse é um elemento vazio(o que siginifica que não há nenhuma tag de fechamento). Ele deve receber os dois seguintes atributos. |
| `src` | **source**. - Isso informa o navegador onde ele pode encontrar o arquivo de imagem. Geralmente será uma URL relativo apontando para uma imagem em seu próprio site |
| `alt` | **alternative**. - Isso fornece uma descrição de texto da imagem que define a imagem se você não conseguir vê-la. |
| `tittle` | **tittle**. - Você também pode utilizar o atributo tittle com o elemento `<img>` para fornecer informações adicionais sobre a imagem. A maioria dos navegadores exive o conteúdo desse atributi em uma dica de ferramenta quando o usuário passa o mouse sobre a imagem. |
| `height` | Isso especifica a altura da imagem em pixels |
| `width` | Isso especifica a largura da imagem em pixels |
| `align` | Foi removido do HTML5 e novos sites devem usar CSS para controlar o alinhamento das imagems, o atributo align pode receber estes valores horizontais **left** isso alinha a imagem a esquerda (permitindo que o texto flutua do lado direito). **right** Isso alinha à direita (permitindo que o texto flutua do lado esquerdo) |
| `top` | Isso alinha a primeira linha do texto adjacente com a parte superior da imagem |
| `middle` | Isso alinha a primeira linha do texto adjacente com o cntro da imagem |
| `botton` | Isso alinha a primeira linha do texto adjacente com a parte inferior da imagem |  
  
## CSS Sintaxe  

| Seletor / Declaração | Descrição |
| ------ | ------ |
| `p {font-family: Arial;}` | **selector** Seletores indicam o lemento ao qual a regra se aplica. A mesma regra é aplicada a mais de um elemento se você separar os nomes dos elementos com vírgula |
| `p {font-family: Arial;}` | **Declarações indicam como os elementos referodos no seletor devem ser utilizados. As declarações são divididas em duas partes(uma propriedade e um valor), e são separads por dois-pontos**|
