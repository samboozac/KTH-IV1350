package integration;

import model.Receipt;

public class Printer {
    private SaleDTO saleDTO;

    /**
     * Empty constructor
     */
    public Printer(){}

    /**
     * Print reciept to the standard output.
     * @param receipt
     */
    public static void printReceipt(Receipt receipt) {
        System.out.println(receipt);
    }
}
