package integration;

import model.RegisteredItems;
import util.Amount;

import java.time.LocalDateTime;

public final class SaleDTO {
    private final String cashier;
    private final LocalDateTime time;
    private final RegisteredItems registeredItems;
    private final Amount change;
    private final Amount runningTotal;

    public SaleDTO(String cashier, RegisteredItems registeredItems, Amount runningTotal, Amount change) {
        this.cashier = cashier;
        this.registeredItems = registeredItems;
        this.runningTotal = runningTotal;
        this.change = change;
        this.time = LocalDateTime.now();
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
    public RegisteredItems getRegisteredItems(){return registeredItems;}

    public Amount getRunningTotal() {
        return runningTotal;
    }

    public Amount getChange() {
        return change;
    }
}
