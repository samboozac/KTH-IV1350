package view;

import controller.Controller;
import controller.OperationFailedException;
import integration.SaleDTO;
import util.Amount;
import util.ItemIdentifier;

public class View {
    private SaleDTO saleDTO;
    private Controller controller;
    private ErrorMessageHandler errorMessageHandler;

    public View(Controller controller, ErrorMessageHandler errorMessageHandler){
        this.controller = controller;
        this.errorMessageHandler = errorMessageHandler;
    }

    /**
     * Start the sale by calling controller method
     */
    public void startSale() {
        controller.startSale();
        System.out.println("Cashier starts new sale");
    }

    /**
     * Add an item by calling the controller.
     * @param itemIdentifier
     * @param quantity
     */
    public void addItem(ItemIdentifier itemIdentifier, int quantity) {
        try {
            saleDTO = controller.addItem(itemIdentifier, quantity);
        } catch (OperationFailedException e){
            errorMessageHandler.showErrorMsg(e.getMessage());
            errorMessageHandler.logErrorMsg(e);
        }

    }

    /**
     * Pay the running total by calling the controller.
     * @param amount
     */
    public void pay(Amount amount) {
        controller.pay(amount);
    }

    /**
     * End sale by calling the controller.
     */
    public void endSale() {
        controller.endSale();
    }
    /**
     * To test the program (No GUI developed).GLHF!
     */
    public void sampleExecution() {
        startSale();
        addItem(new ItemIdentifier("100"), 2);
        addItem(new ItemIdentifier("101"), 2);
        addItem(new ItemIdentifier("102"), 2);
        pay(new Amount(200));
        endSale();
    }
}
