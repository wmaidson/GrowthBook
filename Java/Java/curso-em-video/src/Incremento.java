public class Incremento {

    public static void main(String[] args) {

        int numero = 5;
        int valor = 5 + ++numero;
        System.out.println(valor);

        int numero2 = 5;
        int valor2 = 5 + numero2++;
        System.out.println(valor2);

        int numero3 = 10;
        int valor3 = 4 + numero3--;
        System.out.println(valor3);
        System.out.println(numero3);

        int numero4 = 10;
        int valor4 = 4 + --numero4;
        System.out.println(valor4);
        System.out.println(numero4);

        int x = 4;
        x += 2;
        System.out.println(x);
    }
}
