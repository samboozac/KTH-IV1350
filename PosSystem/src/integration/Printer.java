package integration;

import model.Receipt;

public class Printer {
    public Printer(){}

    /**
     * Print reciept to the standard output.
     * @param receipt
     */
    public static void printReceipt(Receipt receipt) {
        System.out.println(receipt);
    }
}
