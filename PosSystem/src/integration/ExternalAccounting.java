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
    public void updateAccounting(SaleDTO saleDTO) {
        salesLog.add(saleDTO);
    }

    /**
     *
     * @return
     */
    public List<SaleDTO> getSaleLog(){
        return salesLog;
    }
}
