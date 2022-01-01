/**
 * Em orientação a objetos, método abstrato é o método de uma classe abstrata que não possui implementação.
 *
 * Na classe abstrata, é definido o método abstrato com palavra reservada abstract e sua assinatura.
 *
 * A sua implementação é feita na classe filha, através de sobrescrita de método.
 */

abstract class Pai {
    public abstract int Soma(int x, int y);
}

class Filha {


    public int Soma(int x, int y) {
        return x + y;

    }
}

public class Testa {
    public static void main(String[] args) {

        Filha filha = new Filha();
        System.out.println(filha.Soma(2, 6));
    }
}
