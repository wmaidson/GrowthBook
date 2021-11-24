import javax.swing.*;

public class TesteDoWhile {

    public static void main(String[] args) {

        int n;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>informe um numero: <br><em>(valor zero interrompe)</em></html>"));
        } while (n != 0);
    }
}
