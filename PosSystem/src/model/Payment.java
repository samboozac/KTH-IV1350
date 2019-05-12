package model;

import integration.Printer;
import integration.SaleDTO;
import util.Amount;

public class Payment {
    private SaleDTO saleDTO;
    private Receipt receipt;
    private Amount change;

    /**
     *
     * @param saleDTO
     */
    public Payment(SaleDTO saleDTO) {
        this.saleDTO = saleDTO;
        receipt = new Receipt(saleDTO);
        Printer.printReciept(receipt);
    }

    /**
     *
     * @param amount
     * @return
     */
    public Amount pay(Amount amount) {
        saleDTO.getRunningTotal().subtract(amount);
        return saleDTO.getRunningTotal();
    }
}
