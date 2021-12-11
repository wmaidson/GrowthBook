public class AccountWithConstrutorTest {

    public static void main(String[] args) {

        // cria dois objetos AccountWithConstrutor
        AccountWithConstrutor account1 = new AccountWithConstrutor("Jane Green");
        AccountWithConstrutor account2 = new AccountWithConstrutor("John Blue");

        // exibe o valor inicial de nome para cada Account
        System.out.printf("account1 name is: %s%n", account1.getName());
        System.out.printf("account2 name is: %s%n", account2.getName());
    }
}
