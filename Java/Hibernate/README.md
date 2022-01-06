## Hibernate 

## ORM : Object Relational Mapper


| Nome | Descrição |
| ------ | ------ |
| LazyInitializationException | O Hibernate lança a LazyInitializationException quando precisa inicializar uma associação buscada lentamente para outra entidade sem um contexto de sessão ativo. Geralmente, esse é o caso se você tentar usar uma associação não inicializada em seu aplicativo cliente ou camada da web. |
| OptimisticLockException | Outra exceção muito comum é a OptimisticLockException. O Hibernate o lança quando você usa o bloqueio otimista e detecta uma atualização conflitante de uma entidade. Isso geralmente acontece por um de dois motivos: 2 usuários tentam atualizar a mesma entidade quase no mesmo ponto no tempo. 1 usuário realiza 2 atualizações da mesma entidade e você não atualizou a representação da entidade no cliente, de forma que o valor da versão não foi atualizado após a primeira atualização. |
|org.hibernate.AnnotationException: Unknown Id.generator | Este é causado por um mapeamento de entidade incorreto e você pode encontrá-lo durante o desenvolvimento. A razão para isso é muito simples, você faz referência a um gerador de sequência desconhecido em sua anotação @GeneratedValue |
| QuerySyntaxException: Table is not mapped | Este é outro erro de mapeamento típico. Na maioria dos projetos, o esquema do banco de dados já existe ou está definido independentemente de seu mapeamento de entidade. E isso é bom. Por favor, projete o esquema do banco de dados apropriadamente e não deixe o Hibernate gerá-lo para você! |
| org.hibernate.PersistentObjectException: detached entity passed to persist | Você tenta persistir uma nova entidade e fornecer um valor de chave primária, mas o mapeamento da entidade define uma estratégia para gerá-la. Você tenta persistir uma nova entidade e o contexto de persistência já contém uma entidade com o id fornecido. Você tenta persistir uma entidade separada em vez de fundi-la.|
