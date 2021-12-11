/**
 * Para forçar a instrução if…else aninhada para executar como foi originalmente concebida, devemos escrevê-la como a seguir:
 * */

public class SolutionSwingingElse {

    public static void main(String[] args) {

        int x = 6;
        int y = 6;

        if (x > 5)
        {
            if (y > 5)
                System.out.println("x and y are > 5");
        }
        else
            System.out.println("x is <= 5");
    }
}
