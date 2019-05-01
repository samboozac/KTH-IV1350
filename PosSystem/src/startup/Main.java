package startup;

import controller.Controller;
import integration.DbHandler;
import integration.ExternalAccountingSystem;
import integration.ExternalInventorySystem;
import integration.Printer;
import view.View;

public class Main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Printer printer = new Printer();
        DbHandler dbHandler = new DbHandler();
        ExternalInventorySystem externalInventorySystem = new ExternalInventorySystem();
        ExternalAccountingSystem externalAccountingSystem = new ExternalAccountingSystem();

        Controller controller = new Controller();
        View view = new View(controller);
        view.sampleExecution();
    }
}
