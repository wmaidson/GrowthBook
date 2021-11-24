public class TesteDeMesa {

    public static void main(String[] args) {
        int c = 1;

        do {
            if (c % 5 != 0) System.out.println(c);
            else break;
            c += 1;
        } while (c <= 10);
    }
}
