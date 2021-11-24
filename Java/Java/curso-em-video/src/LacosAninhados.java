public class LacosAninhados {

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j <=2; j *= 2) {

                System.out.print("valor de i:" + i + " | ");
                System.out.println("valor de j:" + j);
            }
        }
    }
}
