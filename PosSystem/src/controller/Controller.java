package controller;
// controller.getDiscount
import integration.DbHandler;
import integration.ItemDTO;
import integration.SaleDTO;
import model.Sale;
import util.ItemIdentifier;

public class Controller  {
    private Sale sale;
    private DbHandler dbHandler;
    private ItemDTO itemDTO;

    public Controller() {
        dbHandler = new DbHandler();
    }
    public void addItem(ItemIdentifier itemIdentifier, int quantity) {
        itemDTO = dbHandler.getItemDTO(itemIdentifier);
    }
    public double pay(double amount) {
        return 1.0;
    }
    public void startSale(){
        sale = new Sale();
    }
    public void enterDiscount(String customerID) {

    }
}