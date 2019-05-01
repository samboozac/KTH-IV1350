package model;

import integration.SaleDTO;

public class Receipt {
    private SaleDTO saleDTO;
    protected Receipt(SaleDTO saleDTO){
        this.saleDTO = saleDTO;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cashier: " + saleDTO.getCashier());
        sb.append(System.getProperty("line.separator"));

        sb.append("Cashier: " + saleDTO.getCashier());
        sb.append(System.getProperty("line.separator"));

        sb.append("Cashier: " + saleDTO.getCashier());
        sb.append(System.getProperty("line.separator"));

        sb.append("Cashier: " + saleDTO.getCashier());
        sb.append(System.getProperty("line.separator"));

        return sb.toString();
    }
}
