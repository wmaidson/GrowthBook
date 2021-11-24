public class OutroFatorial {

    public static void main(String[] args) {
        int n = 4;
        int f = 1;
        int c = n;

        while (c >= 1) {
            f *= c;
            c--;
        }
        System.out.println(f);
    }
}
