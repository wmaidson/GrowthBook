public class Resultado {

    public static void main(String[] args) {

        for (int i = 0; i < 15; i += 2 ) {
            if (i % 3 == 0) continue;
            System.out.println(i);
        }
    }
}
