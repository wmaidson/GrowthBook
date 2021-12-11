/**
 * O Java fornece o operador condicional (?:), que pode ser utilizado no lugar de uma instrução if...else. Isso pode tornar o
 * código mais curto e mais claro. O operador condicional é o único operador ternário do Java (isto é, um operador que recebe três
 * operandos). Juntos, os operandos e o símbolo ?: formam uma expressão condicional. O primeiro operando (à esquerda do ?) é
 * uma expressão boolean (isto é, uma condição que é avaliada como um valor boolean — true ou false), o segundo operando
 * (entre o ? e :) é o valor da expressão condicional se a expressão boolean for true e o terceiro operando (à direita do :) é o valor
 * da expressão condicional se a expressão boolean for avaliada como false. Por exemplo, a instrução
 * */

public class ConditionalOperator {

    public static void main(String[] args) {
        int studentGrade = 61;

        System.out.println(studentGrade >= 60 ? "Passed" : "Failed");
    }
}
