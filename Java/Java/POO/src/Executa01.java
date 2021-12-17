public class Executa01 {

    public static void main(String[] args) {
        Caneta01 c1 = new Caneta01();
        c1.setModelo("BIC");
        c1.setPonta(0.5f);
        c1.status();

        System.out.println("********");
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());

        System.out.println("********");
        c1.status();
    }
}
