## Introdução a classes, objetos, métodos e strings

| Nome | Descrição |
| ------ | ------ |
|[AccountWithConstrutor](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/3-introduction-to-class-objects-methods-and-strings/charapter-03/src/AccountWithConstrutor.java)| a classe Account com um construtor que inicializa o nome |
|[AccountWithConstrutorTest](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/3-introduction-to-class-objects-methods-and-strings/charapter-03/src/AccountWithConstrutorTest.java)|Usando o construtor de Account para inicializar a instância name variável no momento em que cada objeto Account é criado |
|[Account](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/3-introduction-to-class-objects-methods-and-strings/charapter-03/src/Account.java)| Classe Account que contém uma variável de instância name e métodos para configurar e obter seu valor.|
|[AccountTest](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/3-introduction-to-class-objects-methods-and-strings/charapter-03/src/AccountTest.java)| Cria e manipula um objeto Account |
|[Dialog1](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/3-introduction-to-class-objects-methods-and-strings/charapter-03/src/Dialog1.java)| Usando JOptionPane para exibir múltiplas linhas em uma caixa de diálogo |
|[NameDialog](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/3-introduction-to-class-objects-methods-and-strings/charapter-03/src/NameDialog.java)| Obtendo a entrada de usuário a partir de um diálogo |

#### Resumo

- Cada classe que você cria torna-se um novo tipo que pode ser utilizado para declarar variáveis e elaborar objetos.
- Você pode declarar novos tipos de classe conforme necessário; essa é uma razão pela qual o Java é conhecido como uma linguagem extensível
- Toda declaração de classe que inicia com o modificador de acesso `public` deve ser armazenada em um arquivo que tem o mesmo nome que
a classe e termina com a extensão de arquivo `.java`.
- Cada declaração de classe contém a palavra-chave `class` seguida imediatamente do nome da classe.
- Os nomes de classe, método e variável são identificadores. Por convenção, todos usam nomes na notação camelo. Os nomes de **classe** começam
com letra **maiúscula**, e os de **método** e **variável**, com uma letra **minúscula**.
- Um objeto tem atributos que são implementados como variáveis de instância que eles mantêm ao longo de sua vida.
- Existem variáveis de instância antes que os métodos sejam chamados em um objeto, enquanto os métodos são executados e depois que essa ação
foi concluída.
- Uma classe normalmente contém um ou mais dos métodos que manipulam as variáveis de instância que pertencem a objetos específicos da
classe.
- Variáveis de instância são declaradas dentro de uma declaração de classe, mas fora do corpo das instruções de método da classe.
- Cada objeto (instância) da classe tem sua própria cópia de cada uma das variáveis de instância da classe.
- A maioria das declarações de variável de instância é precedida pela palavra-chave `private`, que é um modificador de acesso. As variáveis ou
métodos declarados com o modificador de acesso private só são acessíveis a métodos da classe em que são declarados.
- Os parâmetros são declarados em uma lista de itens separados por vírgula, que está localizada entre os parênteses que vêm depois do nome do
método na declaração dele. Múltiplos parâmetros são separados por vírgulas. Cada parâmetro deve especificar um tipo seguido por um nome
de variável.
- As variáveis declaradas no corpo de um método particular são conhecidas como locais e só podem ser utilizadas nesse método. Quando ele
terminar, os valores de suas variáveis locais são perdidos. Os parâmetros de um método são variáveis locais dele.
- O corpo de todos os métodos é delimitado pelas chaves esquerda e direita ({ e }).
- O corpo de cada método contém uma ou mais instruções que executam a(s) tarefa(s) desse método.
- O tipo de retorno do método especifica o tipo de dado retornado para o chamador de um método. A palavra-chave `void` indica que um método
realizará uma tarefa, **mas não retornará nenhuma informação**.
- Os parênteses vazios que seguem um nome de método indicam que ele não requer nenhum **parâmetro** para realizar sua tarefa.
- Quando um método que especifica um tipo de retorno diferente de void for chamado e completar sua tarefa, ele retornará um resultado para
seu método de chamada.
- A instrução `return` passa um valor a partir de um método chamado de volta para seu chamador.
- As classes costumam fornecer métodos `public` para permitir aos clientes da classe **set** (configurar) ou **get** (obter) variáveis de instância
`private`. Os nomes desses métodos não precisam começar com set ou get, mas essa convenção de nomenclatura é recomendada.
- Uma classe que cria um objeto de outra classe, e então chama os métodos do objeto, é uma **driver**.
- A expressão de criação de instância de classe começa com a palavra-chave `new` e estabelece um novo objeto.
- Um construtor é semelhante a um método, mas é chamado implicitamente pelo operador `new` para inicializar as variáveis de instância de um
objeto no momento em que ele é criado.
- Para chamar um método de um objeto, o nome da variável deve ser seguido de um ponto separador, do nome de método e de um conjunto de
parênteses que contém os argumentos do método.
- Variáveis locais não são inicializadas automaticamente. Cada variável de instância tem um valor inicial padrão — fornecido pelo Java quando
você não especifica o valor inicial dela.
- O valor padrão para uma variável de instância do tipo `String` é `null`.
- Uma chamada de método fornece valores — conhecidos como **argumentos** — para cada um dos parâmetros dele. O valor de cada argumento
é atribuído ao parâmetro correspondente no cabeçalho do método.
- O número de argumentos na chamada de método deve corresponder ao de itens na lista de parâmetros da declaração do método.
- Os tipos de argumento na chamada de método devem ser consistentes com os dos parâmetros correspondentes na declaração do método.
- O comando `javac` pode compilar múltiplas classes ao mesmo tempo. Basta listar os nomes dos arquivos do código-fonte após o comando com
cada um deles separado do próximo por um espaço. Se o diretório contendo o aplicativo incluir apenas os arquivos de um único aplicativo, você
pode compilar todas as classes com o comando `javac *.java`. O asterisco (*) em `*.java` indica que todos os arquivos no diretório atual
que têm a extensão de nome de arquivo “.java” devem ser compilados.
- Você deve chamar a maioria dos métodos, exceto `main`, explicitamente para instruí-los a fazer suas tarefas.
- Uma parte fundamental da ativação da JVM para localizar e chamar o método `main` a fim de começar a execução do aplicativo é a palavra-
-chave `static`, que indica que `main` é um método `static` que pode ser chamado sem antes criar um objeto da classe em que esse método é
declarado.
- A maioria das outras classes que você utilizará nos programas Java precisa ser importada explicitamente. Há um relacionamento especial entre
as classes que são compiladas no mesmo diretório. Por padrão, essas classes são consideradas como estando no mesmo pacote — conhecido
como pacote padrão. As classes do mesmo pacote são importadas implicitamente para os arquivos de código-fonte de outras classes desse mesmo
pacote. Uma declaração `import` não é necessária quando uma classe em um pacote utiliza outra no mesmo pacote.
- Uma declaração `import` não é necessária se você sempre se referir a uma classe com um nome totalmente qualificado, que inclui o nome do
pacote e o nome da classe.
- Declarar variáveis de instância `private` é conhecido como ocultar dados ou informações
- Tipos no Java são divididos em duas categorias — primitivos e por referência. Os tipos primitivos são `boolean`, `byte`, `char`, `short`, `int`,
`long`, `float` e `double`. Todos os outros são por referência; portanto, classes, que especificam os tipos de objeto, são tipos por referência.
- Uma variável de tipo primitivo pode armazenar exatamente um valor de seu tipo declarado por vez.
- As variáveis de instância de tipo primitivo são inicializadas por padrão. Variáveis dos tipos `byte`, `char`, `short`, `int`, `long`, `float` e `double`
são inicializadas como 0. As variáveis de tipo `boolean` são inicializadas como `false`.
- Variáveis de tipo por referência (chamadas referências) armazenam o local de um objeto na memória do computador. Essas variáveis referenciam
objetos no programa. O objeto que é referenciado pode conter muitas variáveis de instância e métodos.
- As variáveis de instância de tipo por referência são inicializadas por padrão como valor `null`.
- Uma referência a um objeto é necessária para chamar os métodos de um objeto. Uma variável de tipo primitivo não referencia um objeto e,
portanto, não pode ser utilizada para invocar um método.
