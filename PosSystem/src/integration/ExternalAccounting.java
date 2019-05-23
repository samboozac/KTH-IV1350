package integration;

import java.util.ArrayList;
import java.util.List;

public class ExternalAccounting {
    private List<SaleDTO> salesLog = new ArrayList<>();

    public ExternalAccounting(){}

    /**
     *
     * @param saleDTO
     */
    public void update(SaleDTO saleDTO) {
        salesLog.add(saleDTO);
        System.out.println("Updated Accounting successfully!");
    }

    /**
     *
     * @return
     */
    public List<SaleDTO> getSaleLog(){
        return salesLog;
    }
}
