package startup;

import controller.Controller;
import integration.ExternalAccounting;
import integration.ExternalInventory;
import integration.Printer;
import util.ItemIdentifier;
import view.View;

public class Main {
    private static Printer printer;
    private static ExternalInventory externalInventory;
    private static ExternalAccounting externalAccounting;
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        /*
        ItemIdentifier id1 = new ItemIdentifier("1002");
        ItemIdentifier id2 = new ItemIdentifier("1002");
        System.out.println(id1.equals(id2));
        */

        createExternalSystems();
        Controller controller = new Controller();
        View view = new View(controller);
        view.sampleExecution();
    }

    public static void createExternalSystems() {
        printer = new Printer();
        externalInventory = new ExternalInventory();
        externalAccounting = new ExternalAccounting();
    }
}
