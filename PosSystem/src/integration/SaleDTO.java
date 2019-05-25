package integration;

import model.RegisteredItems;
import util.Amount;
import java.time.LocalDateTime;

public final class SaleDTO {
    private final String cashier = "Jarmo";
    private final LocalDateTime time;
    private final RegisteredItems registeredItems;
    private final Amount runningTotal;
    private final Amount totalVAT;

    public SaleDTO(String cashier, RegisteredItems registeredItems, Amount runningTotal, Amount totalVAT) {
        this.registeredItems = registeredItems;
        this.runningTotal = runningTotal;
        this.time = LocalDateTime.now();
        this.totalVAT = totalVAT;
    }

    /**
     * Retrieve the cashier name.
     * @return
     */
    public String getCashier() {return cashier;}

    /**
     * Retrieve the time for this sale.
     * @return
     */
    public LocalDateTime getTime() {return time;}

    /**
     * Retrieve the list of registered items.
     * @return
     */
    public RegisteredItems getRegisteredItems(){return registeredItems;}

    /**
     * Retrieve the running total of this sale
     * @return
     */
    public Amount getRunningTotal() {
        return runningTotal;
    }

    /**
     * Retrieve the total VAT of this sale.
     * @return
     */
    public Amount getTotalVAT() {
        return totalVAT;
    }
}
