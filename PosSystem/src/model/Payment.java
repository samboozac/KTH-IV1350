package model;

import integration.Printer;
import integration.SaleDTO;

public class Payment {
    private SaleDTO saleDTO;
    private Cost totalCost;
    private Receipt receipt;
    private double change;
    public Payment(SaleDTO saleDTO) {
        this.saleDTO = saleDTO;
        receipt = new Receipt(saleDTO);
        Printer.printReciept(receipt);
    }

    public double pay(double amount) {
        change = totalCost.getCost() - amount;
        return change;
    }
}
