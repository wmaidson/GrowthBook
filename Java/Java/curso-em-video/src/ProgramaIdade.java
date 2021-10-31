import java.util.Scanner;

public class ProgramaIdade {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int nasc = t.nextInt();
        int i = 2015-nasc;
        if (i >= 18) {
            System.out.println("Maior de Idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
