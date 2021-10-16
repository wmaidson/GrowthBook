/*
Figura 3.8: Account.java
Classe Account com a variavel de intancia balance do tipo double e um construtor
e metodo deposit que executa a validacao
*/

public class Account
{
    private String name; //variavel de instantica
    private double balance; // variavel de instancia

    //Construtor de Account que recebe dois parametros
    public Account(String name, double balance)
    {
        this.name = name; //atribui name a variavel de instancia name
        if (balance > 0.0) //se o saldo for valido
            this.balance = balance; //o atribui a variavel de instancia balance
    }

    //metodo que deposita (adiciona) apenas uma quanti valida no saldo
    public void deposit(double depositAmount)
    {
        if (depositAmount > 0.0) //se depositAmount for valido
            balance = balance + depositAmount; //adiciona ao saldo
    }
    //metodo que retorna o saldo da conta
    public double getBalance()
    {
        return balance;
    }
    //metodo que define nome
    public void setName(String name)
    {
        this.name = name;
    }

    //metodo qu retorna o nome
    public String getName()
    {
        return name; // retorna o valor de name ao chamador
    }
}
