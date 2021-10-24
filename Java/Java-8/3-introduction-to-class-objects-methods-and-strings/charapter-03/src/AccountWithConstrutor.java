// Figura 3.5: Account.java
// a classe Account com um construtor que inicializa o nome

public class AccountWithConstrutor {

    private String name; // variável de instância

    // o construtor inicializa name com nome do parâmetro
    public AccountWithConstrutor(String name) { // o nome do construtor é nome da classe

        this.name = name;
    }

    // método para recuperar o nome do curso
    public String getName() {
        return name;
    }

    // método para configurar o nome
    public void setName(String name) {
        this.name = name;
    }
}
