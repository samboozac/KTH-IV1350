package integration;

import java.util.ArrayList;
import java.util.List;

public class ExternalAccounting {
    private List<SaleDTO> salesLog = new ArrayList<>();

    public ExternalAccounting(){}

    /**
     * Just a representaiton to update the Accounting database.
     * @param saleDTO
     */
    public void update(SaleDTO saleDTO) {
        salesLog.add(saleDTO);
        System.out.println("Updated Accounting successfully!");
    }

    /**
     * How to retrieve all the sales logs for e.g printing out X or Z-report.
     * @return
     */
    public List<SaleDTO> getSaleLog(){
        return salesLog;
    }
}
