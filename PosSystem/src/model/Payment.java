package model;

import integration.Printer;
import integration.SaleDTO;
import util.Amount;

public class Payment {
    private SaleDTO saleDTO;
    private Printer printer;
    private Amount amountPaid = new Amount(0);
    private Amount currentChange = new Amount(0);

    /**
     * Constructor, Save the passed Sales information and creates a printer.
     * @param saleDTO
     */
    public Payment(SaleDTO saleDTO) {
        this.saleDTO = saleDTO;
        printer = new Printer();
    }

    /**
     * Verify the payment by checking against running total and calculate the change.
     * If the payment is ok, we print a receipt.
     * @param amount
     * @return
     */
    public void verify(Amount amount) {
        amountPaid = amountPaid.add(amount);
        currentChange = amountPaid.subtract(saleDTO.getRunningTotal());

        if(amountPaid.getValue() >= saleDTO.getRunningTotal().getValue()) {
            printer.printReceipt(new Receipt(saleDTO, amountPaid, currentChange));
        } else {
            System.out.println("Payed amount: " + amountPaid);
            System.out.println("missing amount: " + currentChange.negate());
        }
    }

    /**
     * Retrieve the current amount payed.
     * @return
     */
    public Amount getAmountPaid() {
        return amountPaid;
    }
}
