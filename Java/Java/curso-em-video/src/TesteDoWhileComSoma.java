import javax.swing.*;

public class TesteDoWhileComSoma {

    public static void main(String[] args) {

        int n, s = 0;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>informe um numero: <br><em>(valor zero interrompe)</em></html>"));

            s += n;
        } while (n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado final <br><hr>" +
                "<br>somatorio vale " + s + "</html>") ;
    }
}
