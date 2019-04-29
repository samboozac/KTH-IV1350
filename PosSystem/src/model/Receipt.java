package model;

import integration.SaleDTO;

public class Receipt {
    private SaleDTO saleDTO;
    protected Receipt(SaleDTO saleDTO){
        this.saleDTO = saleDTO;
    }
}
