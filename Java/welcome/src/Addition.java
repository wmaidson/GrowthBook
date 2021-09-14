// Figura 2.7: Addition Java
// Progeama de adição que insere dois números, então exibe a soma deles.
import java.util.Scanner; // programa utiliza a classe Scanner

public class Addition {


    // método main inicia a execução do aplicativo Java
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1; // primeiro número a somar
        int number2; // segundo número a somar
        int sum; // soma de number1 e number2

        System.out.println("Enter the first integer: "); // prompt
        number1 = input.nextInt(); // Lê primeiro o número fornecido pelo usuário

        System.out.println("Enter the second integer: "); // prompt
        number2 = input.nextInt(); // Lê segundo número fornecido pelo usuário

        sum = number1 + number2;

        System.out.printf("Sum is %d%n", sum); // exibe a soma

    } // fim do método main
} // fim da classe Addition
