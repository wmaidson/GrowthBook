import java.util.Arrays;

public class SimpleTesting {
	public static void main(String[] args) {	
		int[] arr = new int[]{12,3,5,21,4,85,6,9,2,1};
		for (int i : arr) {
			System.out.print(i+" ");
		}
		Arrays.parallelSort(arr, 0, 5);
		System.out.println("\nAfter Sorting...");
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}