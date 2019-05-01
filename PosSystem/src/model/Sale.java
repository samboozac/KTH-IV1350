package model;
import integration.ItemDTO;
import integration.SaleDTO;

public class Sale {
    private SaleDTO saleDTO;
    private ItemDTO lastAddedItem;
    private AddedItems addedItems;
    private Cost totalCost;
    private Payment payment;
    private Cost change;

    public Sale() {
        saleDTO = new SaleDTO("Jarmo", totalCost, lastAddedItem, addedItems, change);
        payment = new Payment(saleDTO);
        addedItems = new AddedItems();
    }
    public SaleDTO addItem(ItemDTO itemDTO, int quantity){

        if(addedItems.getAddedItems().containsKey(itemDTO)) {
            addedItems.getAddedItems().put(itemDTO, addedItems.getAddedItems().get(itemDTO) + quantity);
            System.out.println("Successfully added an item!");
        } else {
            addedItems.getAddedItems().put(itemDTO, quantity);
        }
        totalCost = addedItems.getRunningTotal();
        lastAddedItem = itemDTO;
        return saleDTO;
    }
    public void recordInitialSalesInfo(){}
    public double pay(double amount){
        return payment.pay(amount);
    }
}
