public class Objeto {

    public static void main(String[] args) {

        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");

        // O ultimo objeto foi instanciado com a clausula new
        // tecnicamente não tem a mesma estrutura dos dois de cima
        // o conteudo é igual mas o objeto é diferente.

        String resultado1;
        String resultado2;
        String resultado3;

        resultado1 = (nome1 == nome2) ? "igual" : "diferente";
        resultado2 = (nome1 == nome3) ? "igual" : "diferente";
        resultado3 = (nome1.equals(nome3)) ? "igual" : "diferente";
        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
    }
}
