package model;
import integration.ItemDTO;
import integration.SaleDTO;

public class Sale {
    private SaleDTO saleDTO;
    private ItemDTO lastAddedItem;
    private SaleRegister completedSalesLog;
    private Cost totalCost;

    public Sale() {
        totalCost = new Cost();
    }
    public double pay(double amount){return 1.0;}
    public SaleDTO addItem(ItemDTO itemDTO, int quantity){return saleDTO;}
    public void recordInitialSalesInfo(){}
}
