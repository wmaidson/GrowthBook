import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.printf(":Digite o nome do aluno: ");
        String nome = teclado.nextLine();

        System.out.printf(":Digite a idade do aluno: ");
        int idade = teclado.nextInt();

        System.out.printf(":Digite o salario do aluno: ");
        float salario = teclado.nextFloat();

        System.out.printf(":Digite a nota do aluno: ");
        float nota = teclado.nextFloat();

        System.out.format("A nota de %s é %.1f\n", nome, nota);
        System.out.format("A idade do %s é %d\n", nome, idade);
        System.out.format("O salario do %s é %f\n", nome, salario);
    }
}
