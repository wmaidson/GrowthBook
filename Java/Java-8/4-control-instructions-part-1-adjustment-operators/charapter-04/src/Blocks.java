/**
 * A instrução if normalmente espera somente uma instrução no seu corpo. Para incluir várias instruções no corpo de uma if
 * (ou no corpo de um else de uma instrução if…else), inclua as instruções dentro de chaves. As instruções contidas em um par
 * de chaves (como o corpo de um método) formam um bloco. Um bloco pode ser colocado em qualquer lugar em um método em que
 * uma única instrução pode ser colocada.
 *
 * O exemplo a seguir inclui um bloco na parte else de uma instrução if…else:
 * */

public class Blocks {

    public static void main(String[] args) {

        int grade = 59;

        if (grade >= 60)
            System.out.println("Passed");
        else
        {
            System.out.println("Failed");
            System.out.println("You must take this course again.");
        }
    }
}
