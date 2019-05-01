package integration;

import model.Receipt;

public class Printer {
    private SaleDTO saleDTO;

    /**
     *
     */
    public Printer(){}

    /**
     *
     * @param receipt
     */
    public static void printReciept(Receipt receipt) {
        receipt.toString();
    }
}
