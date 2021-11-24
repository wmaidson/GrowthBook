public class Contador {

    public static void main(String[] args) {

        int contador = 0;

        while (contador < 10) {
            contador++;
            if (contador == 2 || contador == 3 || contador == 4) {
                continue;
            }
            if (contador == 7) {
                break;
            }
            System.out.println(contador);
        }
    }
}
