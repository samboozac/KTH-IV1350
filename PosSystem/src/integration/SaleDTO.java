package integration;

import model.Cost;
import model.AddedItems;
import java.time.LocalDateTime;

public final class SaleDTO {
    private final String cashier;
    private final LocalDateTime time;
    private final Cost cost;
    private final ItemDTO lastAddedItem;
    private final AddedItems saleRegister;

    public SaleDTO(String cashier, Cost cost, ItemDTO lastAddedItem, AddedItems saleRegister) {
        this.cashier = cashier;
        this.cost = cost;
        this.lastAddedItem = lastAddedItem;
        this.saleRegister = saleRegister;
        this.time = LocalDateTime.now();
    }

    public String getCashier() {return cashier;}
    public LocalDateTime getTime() {return time;}
    public Cost getCost() {return cost;}
    public AddedItems getCompletedSalesLog(){return saleRegister;}

}
