

public class LogicosOR  {

    public static void main(String[] args) {

        // && (AND) || (OR) ! (NOT)

        int idade = 35;
        float salario = 3500F;
        boolean ContaCorrente = 200;
        boolean ContaPoupanca = 1000;
        float precisa = 5000F;

        float total = contaCorrente > precisa || contaPoupanca > precisa;

        System.out.println(precisa);

    }   
}
