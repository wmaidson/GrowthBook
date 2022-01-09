## JUnit 5

| Nome | Descrição |
| ------ | ------ |
| @Test | @Test, que informa ao JUnit quais são os métodos de teste de uma classe. Para o JUnit o nome do método não importa, pois desde de que ele seja anotado dessa maneira ele será identificado como um método de teste. Um método anotado com @Test não deve retornar um valor. |
| @RepeatedTest |  Ela nos fornece uma maneira poderosa de escrever qualquer teste que desejamos repetir várias vezes. `@RepeatedTest(3)` O teste será executado três vezes como se o mesmo teste fosse escrito três vezes. |
| @TestFactory | O teste dinâmico é um novo modelo de programação introduzido no JUnit 5. Neste artigo, veremos o que são exatamente os testes dinâmicos e como criá-los. |
| @DisplayName  | @DisplayNameé usado para declarar um nome de exibição personalizado para a classe de teste anotado ou método de teste. Os nomes de exibição são normalmente usados para relatórios de teste em IDEs e ferramentas de construção e podem conter espaços, caracteres especiais e até emoji. |
| @BeforeEach | |
| @AfterEach | |
| @Nested | |
| @ParameterizedTest |
| @TestFactory |
