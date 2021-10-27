public class OperadorTernario {

    public static void main(String[] args) {

        int n1, n2, r;
        n1 = 4;
        n2 = 8;
        r = (n1 > n2) ? 0 : 1;
        System.out.println(r);

        int valor1 = 4;
        int valor2 = 8;
        int resultado = (valor1 > valor2) ? valor1 : valor2;
        System.out.println(resultado);

        int object1 = 10;
        int object2 = 5;
        int result = (object1 > object2) ? object1 + object2 : object1 - object2;
        System.out.println(result);
    }
}
