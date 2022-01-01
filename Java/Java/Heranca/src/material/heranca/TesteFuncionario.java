package material.heranca;

/**
 * Classe utilizada para testar a Herança da classe
 * Funcionario.
 */
public class TesteFuncionario {
    public static void main(String[] args) {
        /* Declarações comuns. */
        Pessoa camilo = new Pessoa("Camilo", 123);
        Funcionario2 rafael = new Funcionario2("Rafael", 111, "informatica");

        /* Todo Funcionario é uma Pessoa. */
        Pessoa sakurai = new Funcionario2("Sakurai", 222, "telecomunicação");

        /* Erro de compilação, porque nem toda
           Pessoa é um Funcionario. */
        Funcionario cristiano = new Pessoa("Cristiano", 456);
    }
}