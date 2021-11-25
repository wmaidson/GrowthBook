import java.util.Arrays;

public class Vetor06 {

    public static void main(String[] args) {
        int[] v = new int[20];

        Arrays.fill(v, 0);

        for (int value: v) {
            System.out.print(value +  " ");
        }
    }
}
