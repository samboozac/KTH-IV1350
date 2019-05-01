package integration;

import model.Cost;

public class ItemDTO {
    private final String name;
    private final Cost price;
    private final String itemDescription;
    public ItemDTO(String name, String itemDescription, Cost price){
        this.name = name;
        this.itemDescription = itemDescription;
        this.price = price;
    }

    public String getName(){return name;}
    public String getItemDescription(){return itemDescription;}
    public Cost getPrice(){return price;}
}
