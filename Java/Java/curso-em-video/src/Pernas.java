import java.util.Scanner;

public class Pernas {

    public static void main(String[] args) {

        Scanner objeto = new Scanner(System.in);

        System.out.print("Quantas pernas? ");
        int perna = objeto.nextInt();
        String tipo;
        System.out.print("Isso é um(a): ");

        switch(perna) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo ="Quadrúpede";
                break;
            case 5:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
        }
        System.out.println(tipo);
    }
}
