package view;

import controller.Controller;
import integration.SaleDTO;

public class View {
    private SaleDTO saleDTO;
    private Controller controller;

    public View(Controller controller){
        this.controller = controller;
    }
    public void sampleExecution() {
        controller.startSale();
        System.out.println("Cashier starts new sale");
    }
}
