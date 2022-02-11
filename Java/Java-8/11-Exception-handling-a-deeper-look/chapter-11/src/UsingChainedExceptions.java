// Figura 11.7: UsingChainedExceptions.java
// Exceções encadeadas.

public class UsingChainedExceptions {
    public static void main(String[] args) {

        try {
            method1();
        }
        // exceções lançadas de method1
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    // chama method2; lança exceções de volta para main
    public static void method1() throws Exception {
        try {
            method2();
        }
        // exceção lançada de method2
        catch (Exception exception) {
            throw new Exception("Exception thrown in method1", exception);
        }
    }
    // chama method3; lança exceções de volta para method1
    public static void method2() throws Exception {
        try {
            method3();
        }
        // exceção lançada de method3
        catch (Exception exception) {
            throw new Exception("Exception thrown in method2", exception);
        }
    }
    // lança Exception de volta para method2
    public static void method3() throws Exception {
        throw new Exception("Exception thrown in method3");
    }
}
