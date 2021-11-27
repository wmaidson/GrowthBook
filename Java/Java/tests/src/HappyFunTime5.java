import java.util.ArrayList;

public class HappyFunTime5 {

    public static void main(String[] args) {

      ArrayList<Integer> numbers = new ArrayList<Integer>();

      numbers.add(3);
      numbers.add(7);
      numbers.add(2);
      
      for(int a : numbers) {
          System.out.println(a);
      }

      for(int i = 0; i < numbers.size(); i++) {
          System.out.println(numbers.get(i));
      }
    }
}
