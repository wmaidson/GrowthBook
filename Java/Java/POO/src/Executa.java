public class Executa {

    public static void main(String[] args) {

        // chamada a atributo
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;

        // chamada a metodo
        //c1.tampar();
        c1.destampada();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "Host";
        c2.cor = "Preta";
        c2.destampada();
        c2.rabiscar();
    }
}
