public class Vetor08 {

    public static void main(String[] args) {
        String s = "CURSOEMVIDEO";
        char[] r = new  char[12];
        for (int c = s.length() -1; c >= 0; c--) {
            r[c] = s.charAt(c);
        }
        for (char i : r) {
            System.out.print(i);
        }
    }
}
