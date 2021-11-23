/**
 * Crie uma classe que calcule uma determinada porcentagem de um dado salario
 * Crie uma classe
 * Aceite um valor de entrada para o salario
 * Defina o valor da porcentagem
 * Calcular a porcentagem
 */

public class CalculadoraImposto {

    public static void main(String[] args) {

        float salario = 2500.00F;
        float porcentagem = 30;
        float porcentagemDoSalario = salario * (porcentagem / 100);

        System.out.println(porcentagemDoSalario);

    }
}
