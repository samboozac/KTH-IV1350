package model;

import integration.Printer;
import integration.SaleDTO;
import util.Amount;

public class Payment {
    private SaleDTO saleDTO;
    private Printer printer;
    private Amount amountPaid = new Amount(0);
    private Amount currentChange;

    /**
     *
     * @param saleDTO
     */
    public Payment(SaleDTO saleDTO) {
        this.saleDTO = saleDTO;
        printer = new Printer();
    }

    /**
     *
     * @param amount
     * @return
     */
    public void verify(Amount amount) {
        amountPaid.add(amount);
        currentChange = amountPaid.subtract(saleDTO.getRunningTotal());

        if(amountPaid.getValue() >= saleDTO.getRunningTotal().getValue()) {
            printer.printReciept(new Receipt(saleDTO, amountPaid, currentChange));
        } else {
            System.out.println("Payed amount: " + amountPaid);
            System.out.println("missing amount: " + currentChange.negiate());
        }
    }
}
