public class TestLowestPrice {

    /*
        Executa do 0 até 4 inclusive
        se o preço do atual for menor que o preço do mais barato
        então o preço mais barato se torna o preço atual.
    */

    public static void main(String[] args) {

        double prices[] = new double[5];
        prices[0] = 1000000;
        prices[1] = 46000;
        prices[2] = 16000;
        prices[3] = 46000;
        prices[4] = 17000;

        int lowestPrice = 0;

        for (int currentPrice = 0; currentPrice <= 4; currentPrice++){
            if(prices[currentPrice] < prices[lowestPrice]) {
                lowestPrice = currentPrice;

            }
        }

        System.out.println(lowestPrice);
        System.out.println("the cheapest car costs " + prices[lowestPrice]);
    }
}
