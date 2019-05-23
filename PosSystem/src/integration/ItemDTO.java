package integration;

import util.Amount;

public class ItemDTO {
    private final String name;
    private final String itemDescription;
    private final Amount price;
    private final Amount vat;


    /**
     *
     * @param name
     * @param itemDescription
     * @param price
     */
    public ItemDTO(String name, String itemDescription, Amount price, Amount vat){
        this.name = name;
        this.itemDescription = itemDescription;
        this.price = price;
        this.vat = vat;
    }

    /**
     *
     * @return
     */
    public String getName(){return name;}

    /**
     *
     * @return
     */
    public String getItemDescription(){return itemDescription;}

    /**
     *
     * @return
     */
    public Amount getPrice(){return price;}

    /**
     *
     * @return
     */
    public Amount getVAT(){return vat;}
    public String toString() {
        return name + " " + itemDescription + " " + price + " " + vat;
    }
}