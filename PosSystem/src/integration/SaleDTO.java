package integration;

import model.Payment;
import model.RegisteredItems;
import util.Amount;
import util.VAT;

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

    public Amount getTotalVAT() {
        return totalVAT;
    }
}
