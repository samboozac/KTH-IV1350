package integration;

public class ItemDTO {
    private final String name;
    private  final double price;
    private final String itemDescription;
    public ItemDTO(String name, String itemDescription, double price){
        this.name = name;
        this.itemDescription = itemDescription;
        this.price = price;
    }

    public String getName(){return name;}
    public String getItemDescription(){return itemDescription;}
    public double  getPrice(){return price;}
}
