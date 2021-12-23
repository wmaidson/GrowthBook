

| Nome | Descrição |
| ------ | ------ |
| `mysql -u root -p`| Iniciar o MySQL |
| `exit` | Sair do MySQL |
| `mysqladmin -u root -p create name_db;` | Criando um banco de dados |
| `mysqladmin -u banto -p drop name_db;` | Apagando um banco de dados |
| `show databases;` | Lista todos bancos de dados do MySQL |
| `use DBNAME;` | Lista todos bancos de dados do MySQL |
| `use DBNAME;` | Seleciona o Banco de dados |
| `show tables;` | Exibe uma listagem de tabelas do Banco |
| `truncate table table_name` | Apagar dados da tabela |
| `describe nome_da_tabela;` | Ver a descrição da tabela |
| `desc nome_da_tabela;` | Ver a descrição da tabela |
| `ALTER TABLE DBNAME.TABLENAME AUTO_INCREMENT = 50;` | Alterar o valor do auto incremento de uma tabela |
| `INSERT INTO Name_Table (time_colum) VALUE (NOW());` | Inserir data e horário atual |
| `INSERT INTO Name_Table (time_colum) VALUE (curdate());` | nserir a data atual |
| `INSERT INTO Name_Table (time_colum) VALUE (current_time());` | Inserir a data e horário atual |
| `DELETE FROM produtos WHERE cogido = '100100';` | Delete |
| `RENAME TABLE tb1 TO tb2, tb3 TO tb4;` | Para  renomear varias tabelas em um único comando |
| `ALTER TABLE name_table CHANGE name_column1 name_colimn2 type_data;` | Alterar nome da Coluna, informar o tipo de dados no final exemplo VARCHAR(25), FLOAT |
| `UPDATE table_name SET camp_name = valor WHERE condition` | update |
| `show create table nome_da_tabela;` | Exibir todo SQL de criação de uma tabela |
| `select * from users order by name;` | Seleciona tudo de uma tabela com base no nome |
| `mysql -u root-p my_db < file_name.sql` | Importando um banco de dados |
| `mysqldump -u root -p my_db > file_name.sql` | Exportando todas os bancos de dados |
| `mysql -h 127.0.0.1 -P 3307 -u root -p Integration ation` | Conexão via Host , Porta e Banco de Dados |
| `mysql -h 127.0.0.1 -P 3307 -u root -p `| Conexão via Host , Porta e Banco de Dados |








