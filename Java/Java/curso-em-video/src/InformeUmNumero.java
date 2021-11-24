import javax.swing.*;

public class InformeUmNumero {

    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "informe um numero: "));
        JOptionPane.showMessageDialog(null,"voce digitou o valor: " + n);
    }
}
