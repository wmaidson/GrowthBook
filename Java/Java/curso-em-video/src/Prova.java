public class Prova {

    public static void main(String[] args) {
        int i = 1;
        int a = 0;
        while (i < 10) {
            ++a;
            i = i + 1;
            if (a > 6) ++i;
        }
        System.out.println(i);
        System.out.println(a);
    }
}
