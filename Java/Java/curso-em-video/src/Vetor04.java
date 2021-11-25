import java.util.Arrays;

public class Vetor04 {

    public static void main(String[] args) {

        int[] v = {5, 7, 9, 3, 1, 4, 6, 2, 8};

        Arrays.sort(v);

        for(int  value : v) {
            System.out.println(value + " ");
        }
    }
}
