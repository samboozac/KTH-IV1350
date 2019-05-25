package model;

import integration.ItemDTO;
import integration.SaleDTO;
import util.Amount;
import java.util.Map;

public class Receipt {
    private SaleDTO saleDTO;
    private Amount amountPaid;
    private Amount change;

    /**
     * Constructor, only saving the parameters.
     * @param saleDTO
     */
    public Receipt(SaleDTO saleDTO, Amount amountPaid, Amount change){
        this.saleDTO = saleDTO;
        this.amountPaid = amountPaid;
        this.change = change;
    }

    /**
     * String representation of the receipt.
     * @return
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("---------------------------------");
        sb.append(System.getProperty("line.separator"));
        sb.append("------------ RECEIPT ------------");
        sb.append(System.getProperty("line.separator"));
        sb.append("---------------------------------");
        sb.append(System.getProperty("line.separator"));

        sb.append("--- Cashier: " + saleDTO.getCashier());
        sb.append(System.getProperty("line.separator"));

        sb.append("------------- Items -------------");
        sb.append(System.getProperty("line.separator"));

        for (Map.Entry<ItemDTO, Integer> pair : saleDTO.getRegisteredItems().getMap().entrySet()) {
            sb.append("--- " + pair.getKey().getName() + ", " + pair.getValue() + ", " + pair.getKey().getPrice().getValue()*pair.getValue() + "kr" + ", " + "(VAT: " + (pair.getKey().getPrice().getValue()/100) * pair.getKey().getVAT().getValue() + ")");
            sb.append(System.getProperty("line.separator"));
        }
        sb.append("---------------------------------");
        sb.append(System.getProperty("line.separator"));
        sb.append("---------------------------------");
        sb.append(System.getProperty("line.separator"));

        sb.append("--- Cost: " + saleDTO.getRunningTotal());
        sb.append(System.getProperty("line.separator"));

        sb.append("--- Paid: " + amountPaid);
        sb.append(System.getProperty("line.separator"));

        sb.append("--- Change: " + change);
        sb.append(System.getProperty("line.separator"));

        sb.append("--- totalVAT: " + saleDTO.getTotalVAT());
        sb.append(System.getProperty("line.separator"));

        sb.append("--- Time: " + saleDTO.getTime());
        sb.append(System.getProperty("line.separator"));

        sb.append("---------------------------------");
        sb.append(System.getProperty("line.separator"));
        sb.append("----------- THANK YOU -----------");
        sb.append(System.getProperty("line.separator"));
        sb.append("---------------------------------");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }
}
