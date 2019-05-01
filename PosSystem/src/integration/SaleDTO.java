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
    private final Cost change;

    /**
     *
     * @param cashier
     * @param cost
     * @param lastAddedItem
     * @param saleRegister
     * @param change
     */
    public SaleDTO(String cashier, Cost cost, ItemDTO lastAddedItem, AddedItems saleRegister, Cost change) {
        this.cashier = cashier;
        this.cost = cost;
        this.lastAddedItem = lastAddedItem;
        this.saleRegister = saleRegister;
        this.time = LocalDateTime.now();
        this.change = change;
    }

    /**
     *
     * @return
     */
    public String getCashier() {return cashier;}

    /**
     *
     * @return
     */
    public LocalDateTime getTime() {return time;}

    /**
     *
     * @return
     */
    public Cost getCost() {return cost;}

    /**
     *
     * @return
     */
    public ItemDTO getLastAddedItem() { return lastAddedItem; }

    /**
     *
     * @return
     */
    public AddedItems getCompletedSalesLog(){return saleRegister;}

    /**
     *
     * @return
     */
    public Cost getChange(){return change;}

}
