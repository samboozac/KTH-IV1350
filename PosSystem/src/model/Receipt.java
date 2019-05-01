package model;

import integration.SaleDTO;

public class Receipt {
    private SaleDTO saleDTO;

    /**
     *
     * @param saleDTO
     */
    protected Receipt(SaleDTO saleDTO){
        this.saleDTO = saleDTO;
    }

    /**
     *
     * @return
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cashier: " + saleDTO.getCashier());
        sb.append(System.getProperty("line.separator"));

        sb.append("Cost: " + saleDTO.getCashier());
        sb.append(System.getProperty("line.separator"));

        sb.append("LastAdded: " + saleDTO.getLastAddedItem());
        sb.append(System.getProperty("line.separator"));

        sb.append("AllItems: " + saleDTO.getCompletedSalesLog());
        sb.append(System.getProperty("line.separator"));

        sb.append("Change: " + saleDTO.getChange());
        sb.append(System.getProperty("line.separator"));

        return sb.toString();
    }
}
