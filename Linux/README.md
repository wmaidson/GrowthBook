## Linux

Referências [linux.die.net](https://linux.die.net/)



| Comando | descrição | 
| ------ | ------ |
| `--help` | Commando de ajuda |
| `pwd` | Imprime o nome de arquivo completo do diretório de trabalho atual. |
| `ls` | Liste informações sobre os FILEs (o diretório atual por padrão). Classificar entradas em ordem alfabética se nenhum dos `-cftuvSUX` nem `--sort` . |
| `echo` | Faça eco do (s) STRING (s) para a saída padrão. |
| `cat` | Concatene ARQUIVO (s), ou entrada padrão, para a saída padrão. |
| `vi` | O Vim é um editor de texto compatível com o Vi. Ele pode ser usado para editar todos os tipos de texto simples. É especialmente útil para editar programas. |
| `nano` | **nano** é um editor pequeno, gratuito e amigável que visa substituir o Pico, o editor padrão incluído no pacote não-livre do Pine. Em vez de apenas copiar a aparência e comportamento do Pico, o nano também implementa alguns recursos ausentes (ou desabilitados por padrão) no Pico, como "pesquisar e substituir" e "ir para a linha e número da coluna".|
| `gedit` | **gedit** é o editor de texto oficial do ambiente de área de trabalho GNOME.|
| `less` | **Less** é um programa semelhante ao more (1) , mas que permite o movimento para trás no arquivo, bem como o movimento para frente. Além disso, o less não precisa ler todo o arquivo de entrada antes de iniciar, portanto, com arquivos de entrada grandes, ele inicia mais rápido do que editores de texto como o vi (1) . Less usa termcap (ou terminfo em alguns sistemas), portanto, pode ser executado em uma variedade de terminais. Existe até suporte limitado para terminais impressos. (Em um terminal impresso, as linhas que devem ser impressas na parte superior da tela são prefixadas com um acento circunflexo.) |
| `more` | **More** é um filtro para percorrer o texto em uma tela de cada vez. Esta versão é especialmente primitiva. Os usuários devem perceber que menos (1) fornece mais (1) emulação e amplos aprimoramentos. |
| `clear` | **clear** limpa sua tela se isso for possível. Ele procura no ambiente o tipo de terminal e, em seguida, no banco de dados terminfo para descobrir como limpar a tela. |
| `man` | **man** formata e exibe as páginas do manual online. Se você especificar a seção , o man só olha essa seção do manual. nome é normalmente o nome da página do manual, que normalmente é o nome de um comando, função ou arquivo. No entanto, se nome contém uma barra `( / )`, então man o interpreta como uma especificação de arquivo, de forma que você pode fazer `man ./foo.5` ou mesmo `man /cd/foo/bar.1.gz` . |
| `cd` | O comando **cd** serve para acessar e mudar de diretório corrente. |
| `mkdir` | Crie o (s) DIRETÓRIO (s), se ainda não existirem. |
| `rmdir` | Remove um diretório |
| `rm` | Esta página de manual documenta a versão GNU do **rm** . `rm` remove cada arquivo especificado. Por padrão, ele não remove diretórios. |
| `cp` | Copie SOURCE para DEST ou várias SOURCE (s) para DIRECTORY. |
| `mv` | Renomeie SOURCE para DEST ou mova SOURCE (s) para DIRECTORY. |
| `zip` | zip é um utilitário de compactação e empacotamento de arquivos para Unix, VMS, MSDOS, OS / 2, Windows 9x / NT / XP, Minix, Atari, Macintosh, Amiga e Acorn RISC OS. É análogo a uma combinação dos comandos Unix [**tar**](https://linux.die.net/man/1/tar)  e [**compress**](https://linux.die.net/man/1/compress) e é compatível com PKZIP (ZIP de Phil Katz para sistemas MSDOS). |
| `unzip` | descompactar irá listar, testar ou extrair arquivos de um arquivo ZIP, comumente encontrado em sistemas MS-DOS. O comportamento padrão (sem opções) é extrair para o diretório atual (e subdiretórios abaixo dele) todos os arquivos do arquivo ZIP especificado. Um programa complementar, zip (1L), cria arquivos ZIP; ambos os programas são compatíveis com os arquivos criados pelo PKZIP do PKWARE e pelo PKUNZIP para MS-DOS, mas em muitos casos as opções do programa ou comportamentos padrão são diferentes. |
| `tar` | GNU 'tar' salva muitos arquivos juntos em uma única fita ou arquivo em disco e pode restaurar arquivos individuais do arquivo. |
| `bzip2` | O bzip2 compacta arquivos usando o algoritmo de compactação de texto de classificação de bloco de Burrows-Wheeler e a codificação de Huffman. A compressão é geralmente consideravelmente melhor do que a alcançada por compressores mais convencionais baseados em LZ77 / LZ78 e se aproxima do desempenho da família PPM de compressores estatísticos. |
| `touch` | Atualize os horários de acesso e modificação de cada ARQUIVO para o horário atual. |
| `data` | Exiba a hora atual no FORMATO fornecido ou defina a data do sistema. |
| `head` | Imprima as primeiras 10 linhas de cada ARQUIVO na saída padrão. Com mais de um ARQUIVO, preceda cada um com um cabeçalho com o nome do arquivo. Sem FILE, ou quando FILE for -, leia a entrada padrão. |
| `tail` | Imprima as últimas 10 linhas de cada ARQUIVO na saída padrão. Com mais de um ARQUIVO, preceda cada um com um cabeçalho com o nome do arquivo. Sem FILE, ou quando FILE for -, leia a entrada padrão. |

## SSH

- SSH (Secure Shell) é um protocolo de comunicação seguro que permite p envio de comandos e o controle remoto de um host por meio de uma conexão Criptografado.
- O SSH possui uma arquitetura cliente e servido, e está disponível em praticamente todas as plataformas, como Linux, MAC OS X, BDS, Windows, etc.

##Protocolo SSH

- O protocolo SSH cuida da autenticação, criptografia e integridade dos dados trasmitidos em uma rede.
- AutenticaçãoÇ Determina a identidade de alguém de forma confiável.
- CRiptografia: Os dados são "embaralhados" e modo a se tornarem ininteligíveis para todos exceto os destinatários.
- Integridadade: Garantia de qie os dados trasmitidos chegegem inalterados.

## Pequena Histórico do SSH

- O protocolo SSH foi desenvolvido em 1995 por Tatu Ylönen, pesquisador da Universidade de Tecnogia da Finlândia.
- E julho do mesmo ano, o software SSH1 foi liberado ao público como software livre com código fonte Em 199 a SCS( SSH Communications Security Corp) fundada por Ylönen langou a versão SSH-2 incorporando novos algoritmos e eliminando falhas de segunraça da primeira versão.

## OpenSSH

- O [OpenSSH](https://www.openssh.com/) é uma versão gratuita do SSH. É desenvolvido pelo projeto OpenBSD

## Usando o SSH

instalar o cliente OpenSSH no Linux:
```
sudo apt-get install openssh-client
```

Istalar o servidor Linux:
```
sudo apt-get install openssh-client-server
```

Conectar a partir do cliente:
```
ssh -l user IP/name_host
ssh -l example 192.18.1.130
```

Porta de comunicação 22

## Know Hosts

- Quando um cliente SSH se conecta a um servidor, cada um prova sua identidade ao outro. O servidor autentica o cliete e o cliete também autentica o servidor com o uso de crptografia de chave pública.
- Cada servidor SSH possui uma chave de identificação, chamada de `host key`, usada para identintificar-se para os clientes.
- Na primeira vez que um cliente se conecta a uma host remoto, uma cópia da chave de host é armazenada em sua conta local.
Assim, toda cez que o cliente se reconectar a esse host remoto, o cliente SSH verificará a identidade dele usando essa chave pública.
Essa técnia ajida a evitar, por exmplo, ataques do tipo 'main-in-the-middle'
