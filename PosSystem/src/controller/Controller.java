package controller;

import integration.*;
import model.Sale;
import util.Amount;
import util.ItemIdentifier;
import util.VAT;

public class Controller  {
    private Sale sale;
    private DbHandler dbHandler;
    private ItemDTO itemDTO;
    private SaleDTO saleDTO;
    private Printer printer;
    private ExternalInventory externalInventory;
    private ExternalAccounting externalAccounting;

    /**
     *
     * @param printer
     * @param externalInventory
     * @param externalAccounting
     */
    public Controller(Printer printer, ExternalInventory externalInventory, ExternalAccounting externalAccounting) {
        this.printer = printer;
        this.externalInventory = externalInventory;
        this.externalAccounting = externalAccounting;
        dbHandler = new DbHandler(externalInventory, externalAccounting);
    }

    public void startSale(){
        sale = new Sale();
    }

    public SaleDTO addItem(ItemIdentifier itemIdentifier, int quantity) {
        itemDTO = dbHandler.getItemDTO(itemIdentifier);
        //System.out.println(itemDTO);
        if(itemDTO == null) {
            return null;
        } else {
            return saleDTO = sale.addItem(itemDTO, quantity);
        }
    }

    public void signalLastItem(SaleDTO saleDTO){
        sale.signalLastItem();
    }
    public Amount pay(Amount amount) {
        return sale.pay(amount);
    }

    public void updateSystems(){
        dbHandler.registerSalesInformation(saleDTO);
    }
}