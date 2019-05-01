package model;
import integration.ItemDTO;
import integration.SaleDTO;

public class Sale {
    private SaleDTO saleDTO;
    private ItemDTO lastAddedItem;
    private AddedItems addedItems;
    private Cost totalCost;

    public Sale() {
        addedItems = new AddedItems();
        totalCost = new Cost(addedItems);
    }
    public double pay(double amount){return 1.0;}
    public void addItem(ItemDTO itemDTO, int quantity){
        saleDTO = new SaleDTO("Jarmo", totalCost, lastAddedItem, addedItems);

        if(addedItems.getAddedItems().containsKey(itemDTO)) {
            addedItems.getAddedItems().put(itemDTO, addedItems.getAddedItems().get(itemDTO) + quantity);
            System.out.println("Successfully added an item!");
        } else {
            addedItems.getAddedItems().put(itemDTO, quantity);
        }
    }
    public void recordInitialSalesInfo(){}
}
