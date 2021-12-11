public class ForNumber {

    public static void main(String[] args) {

        int total = 0;
        for (int number = 2; number <= 20; total += number, number += 2)
            System.out.println(total);
    }
}
