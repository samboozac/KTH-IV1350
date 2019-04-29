package model;
import integration.ItemDTO;
import integration.SaleDTO;

import java.time.LocalDateTime;

public class Sale {
    private String cashier;
    private LocalDateTime time;
    private Cost cost;
    private SaleDTO saleDTO;
    private ItemDTO lastAddedItem;

    public Sale(){}
    public double pay(double amount){return 1.0;}
    public SaleDTO addItem(ItemDTO itemDTO, int quantity){}
    public void publicInitialSalesInto(){}
}
