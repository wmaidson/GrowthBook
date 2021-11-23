

public class LogicosAND  {

    public static void main(String[] args) {

        // && (AND) || (OR) ! (NOT)

        int idade = 35;
        float salario = 3500F;
        boolean MaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean MenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println(MaiorQueTrinta);
        System.out.println(MenorQueTrinta);

    }   
}
