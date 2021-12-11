/**
 * em que o corpo da primeira if é uma if…else aninhada. A instrução if externa testa se x for maior do que 5. Se for, a execução
 * continuará testando se y também for maior que 5. Se a segunda condição for verdadeira, a string adequada — "x and y are > 5"
 * — é exibida. Entretanto, se a segunda condição for falsa, a string "x is <= 5" é exibida, apesar de sabermos que x é maior que 5.
 * Igualmente ruim, se a condição da instrução if externa for falsa, o if…else interno é pulado e nada é exibido.
 *
 * */

public class ProblemSwingingElseTwo {

    public static void main(String[] args) {
        int x = 6;
        int y = 6;

        if (x > 5)
            if (y > 5)
                System.out.println("x and y are > 5");
            else
                System.out.println("x is <= 5");
    }
}
