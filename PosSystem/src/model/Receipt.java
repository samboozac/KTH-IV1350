package model;

import integration.ItemDTO;
import integration.SaleDTO;

import java.util.Iterator;
import java.util.Map;

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

        sb.append("LastAdded: " + saleDTO.getRegisteredItems());
        sb.append(System.getProperty("line.separator"));

        sb.append("Items: ");
        sb.append(System.getProperty("line.separator"));

        for (Map.Entry<ItemDTO, Integer> pair : saleDTO.getRegisteredItems().getMap().entrySet()) {
            sb.append(pair.getKey().getName() + " Quantity: " + pair.getValue());
            sb.append(System.getProperty("line.separator"));
        }

        sb.append("AllItems: " + saleDTO.getRegisteredItems());
        sb.append(System.getProperty("line.separator"));

        sb.append("Change: " + saleDTO.getChange());
        sb.append(System.getProperty("line.separator"));

        return sb.toString();
    }
}
