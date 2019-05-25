package controller;

import integration.*;
import model.Sale;
import util.Amount;
import util.ItemIdentifier;

public class Controller  {
    private Sale sale;
    private DbHandler dbHandler;
    private ItemDTO itemDTO;
    private SaleDTO saleDTO;
    private ExternalInventory externalInventory;
    private ExternalAccounting externalAccounting;

    public Controller() {
        externalInventory = new ExternalInventory();
        externalAccounting = new ExternalAccounting();
        dbHandler = new DbHandler(externalInventory, externalAccounting);
    }
    /**
    *
    */
    public void startSale(){
        sale = new Sale();
    }

    public SaleDTO addItem(ItemIdentifier itemIdentifier, int quantity) {
        itemDTO = dbHandler.getItemDTO(itemIdentifier);
        if(itemDTO == null) {
            System.out.println("DOES NOT EXIST ----> Item: " + itemIdentifier.getValue() + " <---- DOES NOT EXIST");
            return null;
        } else {
            return saleDTO = sale.addItem(itemDTO, quantity);
        }
    }
    public void pay(Amount amount) {
        sale.pay(amount);
    }

    public void updateSystems(){
        dbHandler.updateExternalSystems(saleDTO);
    }
}
