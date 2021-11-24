public class Teste {

    public static void main(String[] args) {
        char c = 'c';
        int i = 10;
        double d = 10;
        long l = 1;
        String s = "Hello";

        // CORRETO c = c + 1
        // ERRADO s += i;
        // ERRADO i += s;
        // ERRADO c += s;
        // CORRETO i += l;
    }
}
