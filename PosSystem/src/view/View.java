package view;

import controller.Controller;
import integration.SaleDTO;
import util.Amount;
import util.ItemIdentifier;

public class View {
    private SaleDTO saleDTO;
    private Controller controller;

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
        System.out.println("Cashier starts new sale");
        saleDTO = controller.addItem(new ItemIdentifier("100"), 2);
        saleDTO = controller.addItem(new ItemIdentifier("101"), 2);
        saleDTO = controller.addItem(new ItemIdentifier("102"), 2);
        System.out.println(saleDTO.getRunningTotal());
        controller.pay(new Amount(150));
        controller.updateSystems();
    }
}
