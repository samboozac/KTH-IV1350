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

    /**
     *  Constructor, creates a DbHandler which handles the external systems.
     */
    public Controller() {
        dbHandler = new DbHandler(new ExternalInventory(), new ExternalAccounting());
    }

    /**
     * New sale for every new customer.
     */
    public void startSale(){
        sale = new Sale();
    }

    /**
     * Returns Checks the 'database' after ID then calls sale, returns current status of the Sale (SaleDTO)
     * @param itemIdentifier
     * @param quantity
     * @return
     */
    public SaleDTO addItem(ItemIdentifier itemIdentifier, int quantity) {
        itemDTO = dbHandler.getItemDTO(itemIdentifier);
        if(itemDTO == null) {
            System.out.println("DOES NOT EXIST ----> Item: " + itemIdentifier.getValue() + " <---- DOES NOT EXIST");
            return null;
        } else {
            return saleDTO = sale.addItem(itemDTO, quantity);
        }
    }

    /**
     * Cashier enters amount payed which is passed down.
     * @param amount
     */
    public void pay(Amount amount) {
        sale.pay(amount);
    }

    /**
     * How we would update the database after a finished sale.
     */
    public void endSale(){
        dbHandler.updateExternalSystems(saleDTO);
        sale = null;
        saleDTO = null;
        itemDTO = null;
        System.out.println("Sale ended, Logs updated!");
    }
}
