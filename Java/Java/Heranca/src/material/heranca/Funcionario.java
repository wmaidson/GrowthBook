package material.heranca;

/**
 * Classe utilizada para representar o Funcionario.
 */
public class Funcionario {
    private String nome;
    private int matricula;
    private String departamento;

    public Funcionario(String nome, int matricula, String departamento) {
        this.nome = nome;
        this.matricula = matricula;
        this.departamento = departamento;
    }

    public int getMatricula() { return matricula; }
    public void setMatricula(int matricula) { this.matricula = matricula; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}