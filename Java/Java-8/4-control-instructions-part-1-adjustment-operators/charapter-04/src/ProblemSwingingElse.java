
/**
 * O compilador Java sempre associa um else à instrução if imediatamente anterior, a menos que instruído de outro modo pela
 * colocação de chaves ({ e }). Esse comportamento pode levar àquilo que é chamado de problema do else oscilante. Por exemplo
 *
 * parece indicar que, se x for maior do que 5, a instrução if aninhada determina se y também é maior do que 5. Se for assim, a string
 * "x and y are > 5" é enviada para a saída. Caso contrário, parece que se x não for maior que 5, a parte else do if…else imprime a
 * string "x is <= 5". Cuidado! Essa instrução if…else aninhada não é executada como parece. Na verdade, o compilador interpreta
 * a instrução
 * */

public class ProblemSwingingElse {

    public static void main(String[] args) {
        int x = 6;
        int y = 6;

        if (x > 5)
            if (y > 5)
                System.out.println("x and y ate > 5");
        else
            System.out.println("x is <= 5");
    }
}
