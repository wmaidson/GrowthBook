import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pessoa implements Comparable<Pessoa>  {
    private String nome;
    private int idade;
    private String endereco;

    //getters and setters

    @Override
    public int compareTo(Pessoa p) {
        return this.getNome().compareTo(p.getNome());
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", endereco="
                + endereco + "]";
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("João");
        Pessoa p2 = new Pessoa();
        p2.setNome("Maria");
        Pessoa p3 = new Pessoa();
        p3.setNome("André");
        List<Pessoa> pessoas = new ArrayList();
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        Collections.sort(pessoas);
        System.out.println(pessoas);        
    }
}
