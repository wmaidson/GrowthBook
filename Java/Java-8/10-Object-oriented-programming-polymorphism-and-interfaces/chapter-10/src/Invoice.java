// Figura 10.12: Invoice.java
// Classe Invoice que implementa Payable.

public class Invoice implements Payable {

    private final String partNumber;
    private final String partDescription;
    private int quantity;
    private double pricePerItem;

    // construtor
    public Invoice(String partNumber, String partDescription, int quantity,
                   double pricePerItem) {

        if (quantity < 0) // valida quantidade
            throw new IllegalArgumentException("Quantity must be >= 0");


        if (pricePerItem < 0.0) // valida pricePerItem
            throw new IllegalArgumentException(
                    "Price per item must be >= 0");


        this.quantity = quantity;
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.pricePerItem = pricePerItem;
    }

    // obtém o número da peça
    public String getPartNumber() {

        return partNumber; // deve validar
    }

    // obtém a descrição
    public String getPartDescription() {
        return partDescription;
    }


    // configura a quantidade
    public void setQuantity(int quantity) {

        if (quantity < 0) // valida quantidade
            throw new IllegalArgumentException("Quantity must be >= 0");
        this.quantity = quantity;
    }

    // obtém quantidade
    public int getQuantity() {
        return quantity;
    }

    // configura preço por item
    public void setPricePerItem(double pricePerItem) {

        if (pricePerItem < 0.0) // valida pricePerItem
            throw new IllegalArgumentException(
                    "Price per item must be >= 0");

        this.pricePerItem = pricePerItem;
    }


    // obtém preço por item
    public double getPricePerItem() {
        return pricePerItem;
    }

    // retorno da representação de String do objeto Invoice


    public String toString() {
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f",
                "invoice", "part number", getPartNumber(), getPartDescription(),
                "quantity", getQuantity(), "price per item", getPricePerItem());
    }
}
