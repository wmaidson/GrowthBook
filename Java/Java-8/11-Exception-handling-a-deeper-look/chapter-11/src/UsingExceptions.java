// Figura 11.5: UsingExceptions.java
// mecanismo de tratamento de exceção try...catch...finally.


public class UsingExceptions {

    public static void main(String[] args) {
        try {
            throwException();
        }
        // exceção lançada por throwException
        catch (Exception exception) {
            System.err.println("Exception handled in main");
        }
        doesNotThrowException();
    }

    // demonstra try...catch...finally
    public static void throwException() throws Exception {
        // lança uma exceção e imediatamente a captura
        try {
            System.out.println("Method throwException");
            throw new Exception(); // gera a exceçãoÿ

        }
        // captura exceção lançada em try
        catch (Exception exception) {
            System.err.println(
                    "Exception handled in method throwException");
            throw exception; // lança novamente para processamento adicional

            // o código aqui não seria alcançado; poderia causar erros de compilação
        }
        // executa independentemente do que ocorre em try...catch
        finally {
            System.err.println("Finally executed in throwException");
        }
        // o código aqui não seria alcançado; poderia causar erros de compilação

    }
    // demonstra finally quando nenhuma exceção ocorrer
    public static void doesNotThrowException() {
        // bloco try não lança uma exceção
        try {
            System.out.println("Method doesNotThrowException");
        }
        // não executa
        catch (Exception exception) {
            System.err.println(exception);
        }

        // executa independentemente do que ocorre em try...catch
        finally
        {
            System.err.println(
                    "Finally executed in doesNotThrowException");
        }
        System.out.println("End of method doesNotThrowException");
    }
}
