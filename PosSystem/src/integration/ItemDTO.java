package integration;

import util.Amount;

public class ItemDTO {
    private final String name;
    private final String itemDescription;
    private final Amount price;
    private final Amount vat;

    /**
     * Item placeholder for design purposes.
     * @param name
     * @param itemDescription
     * @param price
     * @param vat
     */
    public ItemDTO(String name, String itemDescription, Amount price, Amount vat){
        this.name = name;
        this.itemDescription = itemDescription;
        this.price = price;
        this.vat = vat;
    }

    /**
     * Retrive the item name.
     * @return
     */
    public String getName(){return name;}

    /**
     * Retrieve the item description.
     * @return
     */
    public String getItemDescription(){return itemDescription;}

    /**
     * Retrieve the item price.
     * @return
     */
    public Amount getPrice(){return price;}

    /**
     * Retrieve the item VAT rate.
     * @return
     */
    public Amount getVAT(){return vat;}

    /**
     * String representation of the items.
     * @return
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(name + " ");
        sb.append(itemDescription + " ");
        sb.append(price + " ");
        sb.append(vat + " ");
        sb.append("]");
        return sb.toString();
    }
}