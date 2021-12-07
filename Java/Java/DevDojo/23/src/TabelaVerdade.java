

/**
 * | p | q | p AND q |
 * | ------ | ------ | ------ |
 * | V | V | V |
 * | V | F | F |
 * | F | V | F |
 * | F | F | F |
 *
 * | p | q | p OR q |
 * | ------ | ------ | ------ |
 * | V | V | V |
 * | V | V | V |
 * | F | V | V |
 * | F | F | F |
 *
 * | p | q | p ^ q |
 * | ------ | ------ | ------ |
 * | V | V | F |
 * | V | V | V |
 * | F | V | V |
 * | F | F | F |
 *
 * | p | !p |
 * | ------ | ------ |
 * | V | F |
 * | F | V |
 *
 */

public class TabelaVerdade {

    public static void main(String[] args) {

    }
}