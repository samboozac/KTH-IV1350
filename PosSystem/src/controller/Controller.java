package controller;
// controller.getDiscount
import integration.SaleDTO;
import model.Sale;

public class Controller  {
    private SaleDTO saleDTO;
    private Sale sale;
    public Controller() {}
    public void addItem(String itemIdentifier, int quantity) {

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