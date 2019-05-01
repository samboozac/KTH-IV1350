package integration;

import model.Receipt;

public class Printer {
    private SaleDTO saleDTO;
    public Printer(){}
    public static void printReciept(Receipt receipt) {
        receipt.toString();
    }
}
