package integration;

import model.Cost;

public class ItemDTO {
    private final String name;
    private final Cost price;
    private final String itemDescription;

    /**
     *
     * @param name
     * @param itemDescription
     * @param price
     */
    public ItemDTO(String name, String itemDescription, Cost price){
        this.name = name;
        this.itemDescription = itemDescription;
        this.price = price;
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
    public Cost getPrice(){return price;}
}
