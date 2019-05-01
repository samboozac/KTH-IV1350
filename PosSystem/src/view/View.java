package view;

import controller.Controller;
import integration.SaleDTO;
import util.ItemIdentifier;

public class View {
    private SaleDTO saleDTO;
    private Controller controller;
    private double change;

    /**
     *
     * @param controller
     */
    public View(Controller controller){
        this.controller = controller;
    }

    /**
     *
     */
    public void sampleExecution() {
        controller.startSale();
        controller.addItem(new ItemIdentifier("1231231"), 2);
        System.out.println("Cashier starts new sale");
        controller.enterDiscount("124938129348");
        change = controller.pay(10);

    }
}
