/**
 *  Crie variaveis para os campos descrito abaixo <> e imprima a seguinte mensagem:
 * 
 * Eu <nome>, morando no endereco <endereco>,
 * confirmo que recebi o salario de <salario, na data <data>>
 * 
 */

public class Exercicio {

    public static void main(String[] args) {

        String nome = "Goku";
        String endereco = "Algum lugar";
        double salario = 5600.00;
        String dataRecebimentoSalario = "20/12/21";
        String relatorio = "Eu" + nome + "moro no endereco " + endereco + " confirmo que recebi o salario de " + salario + " na data " + dataRecebimentoSalario;

        System.out.println(relatorio);
    }   
}
