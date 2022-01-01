package material.heranca;

/**
 * Classe utilizada para representar um Coordenador que é uma Pessoa.
 */
public class Coordenador3 extends Pessoa {
    private String cursoCoordenado;

    public Coordenador3(String nome, int matricula, String cursoCoordenado) {
        super(nome, matricula);
        this.cursoCoordenado = cursoCoordenado;
    }

    public String getCursoCoordenado() { return cursoCoordenado; }
    public void setCursoCoordenado(String cursoCoordenado) {
        this.cursoCoordenado = cursoCoordenado;
    }
}