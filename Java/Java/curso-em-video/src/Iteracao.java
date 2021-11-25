public class Iteracao {

    public static void main(String[] args) {

        int s = 1;

        for (int c = 0; c <= 10; c += 2) {
            s += c;
        }

        for (int c = 0; c < 10; c += 2) {
            s += c;
        }

        for (int c = 0; c <= 10; c++) {
            s += c;
        }

        for (int c = 0; c >= 10; c++) {
            s += c;
        }
    }

}
