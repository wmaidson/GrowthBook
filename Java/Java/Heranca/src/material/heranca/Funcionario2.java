package material.heranca;

/**
 * Classe utilizada para representar um Funcionario que é uma Pessoa.
 */
public class Funcionario2 extends Pessoa {
    private String departamento;

    public Funcionario2(String nome, int matricula, String departamento) {
        super(nome, matricula);
        this.departamento = departamento;
    }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
