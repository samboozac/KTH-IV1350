package controller;

import integration.DbHandler;
import integration.ItemDTO;
import integration.SaleDTO;
import model.Sale;
import util.ItemIdentifier;

public class Controller  {
    private Sale sale;
    private DbHandler dbHandler;
    private ItemDTO itemDTO;
    private SaleDTO saleDTO;

    public Controller() {
        dbHandler = new DbHandler();
    }

    public void startSale(){
        sale = new Sale();
    }

    public SaleDTO addItem(ItemIdentifier itemIdentifier, int quantity) {
        itemDTO = dbHandler.getItemDTO(itemIdentifier);

        return saleDTO = sale.addItem(itemDTO, quantity);
    }
    public void enterDiscount(String customerId) {

    }

    public double pay(double amount) {
        return sale.pay(amount);
    }

    public void updateSystems(){
        dbHandler.registerSalesInformaiton(saleDTO);
    }
}