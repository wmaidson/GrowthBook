public class Resolucao {

    public static void main(String[] args) {
        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto = 0;

        if(salarioAnual < 44712) {
            salarioAnual = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 44713 && salarioAnual ,= 68507) {
            salarioAnual = salarioAnual * segundaFaixa;
        } else {
            salarioAnual = salarioAnual * terceiraFaixa;
        }
        System.out.println(salarioAnual);
    }
}