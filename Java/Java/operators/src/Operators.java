public class Operators {

    /***
     *
     * @param args Java logical and mathematical operators
     */

    public static void main(String[] args) {

/**
 *                                 Arithmetic
 *
 *       Arithmetic operators are binary operators, that is, they work with two operands. For example,
 *       the expression “a + 1” contains the binary operator “+” (plus) and the two operands “a” and “1”.
 *
 *        +-----------------+-----------+----------------------+-----------------+
 *        | Operation       | Operator  | Algebraic expression | Java expression |
 *        +-----------------+-----------+----------------------+-----------------+
 *        | Addition        |     +     |        a + 1         |        a +1     |
 *        +-----------------+-----------+----------------------+-----------------+
 *        | Subtraction     |     -     |        b -2          |        b -2     |
 *        +-----------------+-----------+----------------------+-----------------+
 *        | Multiplication  |     *     |         cm           |      c * m      |
 *        +-----------------+-----------+----------------------+-----------------+
 *        | Division        |     /     |       d / e          |      d / e      |
 *        +-----------------+-----------+----------------------+-----------------+
 *        | Rest            |     %     |       f mod g        |      f % g      |
 *        +-----------------+-----------+----------------------+-----------------+
 *
 *      The module (%) provides the rest of the division, in the expression “x% y”,
 *      the result is the remainder after x is divided by y, so in the expression “7% 4” the result is 3
 *      and “17% 5 ”The result produces 2. This operator is mostly used with integer operands,
 *      but it can also be used with other types.
  */

        // Addition

        int A = 10;
        int B = 20;
        int sum = A + B;

        System.out.println(sum);

        // Subtraction

        int C = 50;
        int D = 25;
        int subtraction = C - D;

        System.out.println(subtraction);

        // Multiplication

        int E = 100;
        int F = 10;
        int multiplication = E * F;

        System.out.println(multiplication);

        // Division

        int G = 100;
        int H = 2;
        int division = F / G;

        System.out.println(division);

        // Rest

        int I = 7;
        int J = 4;
        int rest = I % J;

        System.out.println(rest);

/**
 *                            Precedence of operators
 *
 *      Operators have rules that are applied to Java arithmetic expressions,
 *      which are the same as those followed in algebra. When we say that operators are applied from left to right,
 *      we are referring to their associativity.
 *
 *      Multiplication, division and module operators are applied first. For example,
 *      when an expression appears with several of these operations, they will be applied from left to right.
 *
 *      The addition and subtraction operations are then applied.
 *
 *         +-----------+----------------+-----------------------------------------------------------+
 *         | Operator  | Operation      | Evaluation order (precedence)                             |
 *         +-----------+----------------+-----------------------------------------------------------+
 *         |   * / %   | Multiplicação  | Rated first. If there are multiple operators of this type,|
 *         |            | Rest Division | they will be evaluated from left to right                 |
 *         +-----------+----------------+-----------------------------------------------------------+
 *         |    + -    |    Addition    | Then evaluated. If there are several such operators,      |
 *         |           |  Subtraction   | they will be evaluated from left to right.                |
 *         +-----------+----------------+-----------------------------------------------------------+
 *         |    =      |  Attribution   | Set last                                                  |
 *         +-----------+----------------+-----------------------------------------------------------+
 *
  */

        // Precedence

        int a = 30;
        int b = 5;
        int c = 10;
        int total = (a + b + c) / 10;

        System.out.println("The result is = "+total);


/**
 *                        Equality operators and relational operators
 *
 *      A condition is an expression that can be true or false, that is, a value of type Boolean.
 *
 *         +--------------------+---------------------+------------------------+----------------------------------+
 *         | Equality operator  |  Equality operator  | Java condition example | Meaning of the condition in Java |
 *         +--------------------+---------------------+------------------------+----------------------------------+
 *         |                                              Equality operator                                       |
 *         +--------------------+---------------------+------------------------+----------------------------------+
 *         |          =         |         ==          |        x == y          |        x is equal to y           |
 *         +--------------------+---------------------+------------------------+----------------------------------+
 *         |          ?         |         !=          |     x != y             |      x is different from y       |
 *         +--------------------+---------------------+------------------------+----------------------------------+
 *         |                                              Relational operators                                    |
 *         +--------------------+---------------------+------------------------+----------------------------------+
 *         |           >        |         >           |        x > y           |        x is greater than y       |
 *         +--------------------+---------------------+------------------------+----------------------------------+
 *         |          <         |         <           |     x < y              |        x is less than y          |
 *         +--------------------+---------------------+------------------------+----------------------------------+
 *         |           >_       |         >=          |        x >= y          | x is greater than or equal to y  |
 *         +--------------------+---------------------+------------------------+----------------------------------+
 *         |          <_        |         <=          |     x <= y             | x is less than or equal to y     |
 *         +--------------------+---------------------+------------------------+----------------------------------+
  */

        // relational
        
        int valueA = 14;
        int valueB = 20;
        if(valueA < valueB)
            System.out.printf("%d it's smaller than %d", valueA, valueB);

/**
 *                                      Logic operators
 *
 *          +-----------+--------------------------------------------------------------+
 *          |     &&    | Used when we want the two expressions to be true.            |
 *          +-----------+--------------------------------------------------------------+
 *          |    ||     | Used when we need at least one of the expressions to be true.|
 *          +-----------+--------------------------------------------------------------+
 *
  */

        // && Example

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        // find the largest number
        // using && operator
        if (num1 >= num2 && num1 >= num3)
            System.out.println(num1 + " is the largest number.");
        else if (num2 >= num1 && num2 >= num3)
            System.out.println(num2 + " is the largest number.");
        else
            System.out.println(num3 + " is the largest number.");

        
        // || Example

        int value1 = 1;
        int value2 = 2;

        if((value1 == 1) && (value2 == 2))
            System.out.println("value1 is 1 AND value2 is 2");
        if((value1 == 1) || (value2 == 1))
            System.out.println("value1 is 1 OR value2 is 1");

    }
}
