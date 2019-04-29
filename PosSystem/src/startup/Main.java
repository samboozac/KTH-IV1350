package startup;

import controller.Controller;
import integration.DbHandler;
import integration.ExternalAccountingSystem;
import integration.ExternalInventorySystem;
import view.View;

public class Main {
    Controller controller = new Controller();
    View view = new View();
    DbHandler dbHandler = new DbHandler();
    ExternalInventorySystem externalInventorySystem = new ExternalInventorySystem();
    ExternalAccountingSystem externalAccountingSystem = new ExternalAccountingSystem();
}
