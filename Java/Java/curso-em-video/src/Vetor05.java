import java.util.Arrays;

public class Vetor05 {

    public static void main(String[] args) {

        int[] vet = {5, 7, 9, 3, 1, 4, 6, 2, 8};
        for (int v: vet) {
            System.out.print(v + " ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet, 6);
        System.out.println("Encontrei o valor na posicao " + p);
    }
}
