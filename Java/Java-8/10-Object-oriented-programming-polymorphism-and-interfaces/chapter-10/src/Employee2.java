// Figura 10.13: Employee.java
// Superclasse abstrata Employee que implementa Payable.

public class Employee2 {

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    // construtor
    public Employee2(String firstName, String lastName,
                    String socialSecurityNumber) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // retorna o nome
    public String getFirstName() {
        return firstName;
    }

    // retorna o sobrenome
    public String getLastName() {
        return lastName;
    }

    // retorna o número de seguro social
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    // retorna a representação de String do objeto Employee
    @Override
    public String toString() {

        return String.format("%s %s%nsocial security number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }
}
