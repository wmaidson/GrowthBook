// Figura 9.11: BasePlusCommissionEmployee.java
// A classe BasePlusCommissionEmployee é herdada de CommissionEmployee2
// e acessa os dados private da superclasse via
// métodos public herdados.

public class BasePlusCommissionEmployee4 extends CommissionEmployee2 {

    private double baseSalary; // salário-base por semana

    // construtor de seis argumentos
    public BasePlusCommissionEmployee4(
            String firstName, String lastName,
            String socialSecurityNumber, double grossSales,
            double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber,
                grossSales, commissionRate);
        // se baseSalary é inválido, lança uma exceção
        if (baseSalary < 0.0)
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0");

        this.baseSalary = baseSalary;
    }

    // configura o salário-base
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0)
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0");

        this.baseSalary = baseSalary;
    }

    // retorna o salário-base
    public double getBaseSalary() {
        return baseSalary;
    }

    // calcula os lucros
    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    // retorna a representação de String de BasePlusCommissionEmployee
    @Override
    public String toString() {
        return String.format("%s %s%n%s: %.2f", "base-salaried",
                super.toString(), "base salary", getBaseSalary());
    }



}
