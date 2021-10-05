// Figura 2.7: Addition.Java
// Programa de adição que insere dois números, então exibe a soma deles

import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {

        //cria um Scanner para obter entrada a partir da janela de commando
        Scanner input = new Scanner(System.in);

        int number1; // primeiro número a somar
        int number2; // segundo número a somar
        int sum; // soma de numero1 e numero2

        System.out.printf("Enter first integer: "); // prompt
        number1 = input.nextInt(); // lê o primeiro número fornecido pelo usuário

        System.out.printf("Enter second integer: "); // prompt
        number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário

        sum = number1 + number2; // soma os números, depois armazena o total em sum

        System.out.printf("Sum is %d%n", sum); // exibe a soma
    } // fim do método main
} // fim da classe addition
